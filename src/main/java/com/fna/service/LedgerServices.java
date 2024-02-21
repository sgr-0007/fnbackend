package com.fna.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fna.exceptions.SalesLedgerNotFoundException;
import com.fna.model.AUCBuyerLedger;
import com.fna.model.AUCGrowerLedger;
import com.fna.model.Company;
import com.fna.model.CompanyType;
import com.fna.model.FileUploads;
import com.fna.model.InvoiceBuyerDetails;
import com.fna.model.LedgerBankDetails;
import com.fna.model.LedgerDetails;
import com.fna.model.LedgerGroupDetails;
import com.fna.model.LedgerSubGroupDetails;
import com.fna.model.SalesLedger;
import com.fna.repository.AUCBuyerLedgerRepo;
import com.fna.repository.AUCGrowerLedgerRepo;
import com.fna.repository.CompanyRepository;
import com.fna.repository.CompanyTypeRepository;
import com.fna.repository.FileRepository;
import com.fna.repository.InvoiceBuyerRepository;
import com.fna.repository.LedgerBankDetailsRepo;
import com.fna.repository.LedgerDetailsRepository;
import com.fna.repository.LedgerGroupRepository;
import com.fna.repository.LedgerRepository;
import com.fna.repository.LedgerSubGroupRepository;

@Service
@Transactional
public class LedgerServices {
	private final Path root = Paths.get("C:/fnafiles");
	@Autowired
	private LedgerRepository ledgerRepository;
	
	@Autowired
	private AUCBuyerLedgerRepo buyerRepo;
	@Autowired
	private AUCGrowerLedgerRepo growerRepo;
	
	@Autowired
	private LedgerBankDetailsRepo bankrepo;
	
	@Value("${savefileendpoint}")
	private String filesaveendpointurl;

	@Autowired
	private LedgerDetailsRepository ledgerdetailsRepository;
	@Autowired
	private FileRepository filerepo;
	@Autowired
	private InvoiceBuyerRepository invoiceledgerdetailsRepository;
	@Autowired
	private LedgerGroupRepository ledgergrouprepo;

	@Autowired
	private LedgerSubGroupRepository ledgersubgrouprepo;
	@Autowired
	private CompanyRepository companyRepository;

	@Autowired
	private CompanyTypeRepository companytypeRepo;
	
	@Transactional
	public ResponseEntity<SalesLedger> saveSalesLedger(SalesLedger saleLedger) throws CloneNotSupportedException {
		System.out.println(saleLedger);
		
			saleLedger.setActive((byte)1);
			saleLedger.setAffectInventory(0);
			saleLedger.setAccounttypeid(1);
			ledgerRepository.save(saleLedger);
			int lid = saleLedger.getLedgerId();
			if (saleLedger.getFileUploadId().length != 0) {
				for (int id : saleLedger.getFileUploadId()) {
					filerepo.update(lid, id);

				}

			}
			if(saleLedger.getBankdetails()!=null) {
				List<LedgerBankDetails> bankdetails= saleLedger.getBankdetails();
				for(LedgerBankDetails bank : saleLedger.getBankdetails()) {
					bank.setLedgerid(lid);
					bankrepo.save(bank);
				}
			}
		 

		
		return new ResponseEntity<>(saleLedger, HttpStatus.CREATED);
	}

	public ResponseEntity<SalesLedger> getSalesLedgerById(int saleLedgerId) {
		Optional<SalesLedger> salesLedgerData = ledgerRepository.findById(saleLedgerId);
		int fileDetails[] = filerepo.getByModuleId(saleLedgerId);
		Optional<List<LedgerBankDetails>> bankdetails=bankrepo.findByLedgerid(saleLedgerId);
		System.out.println(fileDetails.toString());
		for (int i : fileDetails) {
			System.out.println(i);
		}
		if (salesLedgerData.isPresent()) {
			if(bankdetails.isPresent()) {
				salesLedgerData.get().setBankdetails(bankdetails.get());
			}
			salesLedgerData.get().setFileUploadId(fileDetails);
			System.out.println(salesLedgerData.get().getFileUploadId());
			
			return new ResponseEntity<>(salesLedgerData.get(), HttpStatus.ACCEPTED);
			
		} else {

			throw new SalesLedgerNotFoundException(saleLedgerId);

		}
	}

	public ResponseEntity<List<LedgerDetails>> getLedgerByCatagegory(int catLedgerId) {
		try {
			System.out.println(catLedgerId);
			List<LedgerDetails> salesLedges;
			List<AUCBuyerLedger> buyerledger=new ArrayList<AUCBuyerLedger>();
			List<AUCGrowerLedger> growerledger=new ArrayList<AUCGrowerLedger>();
			
			salesLedges = ledgerdetailsRepository.getAllLedgerDetails(catLedgerId);
			buyerledger=buyerRepo.findAll();
			//growerledger=growerRepo.findAll();
			System.out.println(salesLedges.toString());
			if(catLedgerId==1) {
			if(!buyerledger.isEmpty()) {
				for(AUCBuyerLedger buyer : buyerledger) {
					LedgerDetails buyerledger1=new LedgerDetails();
					buyerledger1.setLedgerCode(buyer.getiBuyerID());
					buyerledger1.setLedgerName("AUC-APF63"+buyer.getVcBuyerName());
					buyerledger1.setLedgerAlias("AUC-APF63"+buyer.getVcBuyerName());
					buyerledger1.setAddress1(buyer.getVcAddress());
					salesLedges.add(buyerledger1);
				}
			}
			}
			if(catLedgerId==2) {
				if(!growerledger.isEmpty()) {
					for(AUCGrowerLedger buyer : growerledger) {
						LedgerDetails buyerledger1=new LedgerDetails();
						buyerledger1.setLedgerCode("AUC-APF63"+buyer.getTbgrno());
						buyerledger1.setLedgerName("AUC-APF63"+buyer.getGrowerName());
						buyerledger1.setLedgerAlias("AUC-APF63"+buyer.getGrowerName());
						
						salesLedges.add(buyerledger1);
					}
				}
				}
			return new ResponseEntity<>(salesLedges, HttpStatus.OK);
			
			
			
			
			
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity<List<SalesLedger>> getAllSalesLedger() {
		try {
			List<SalesLedger> salesLedges = new ArrayList<SalesLedger>();
			List<AUCBuyerLedger> buyerledger=new ArrayList<AUCBuyerLedger>();
			ledgerRepository.findAll().forEach(salesLedges::add);
			//buyerledger=buyerRepo.findAll();
			
			if (salesLedges.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
//			if(!buyerledger.isEmpty()) {
//				for(AUCBuyerLedger buyer : buyerledger) {
//					SalesLedger buyerledger1=new SalesLedger();
//					buyerledger1.setLedgerCode(buyer.getiBuyerID());
//					buyerledger1.setLedgerName("AUC"+buyer.getVcBuyerName());
//					buyerledger1.setLedgerAlias("AUC"+buyer.getVcBuyerName());
//					buyerledger1.setAddress1(buyer.getVcAddress());
//					salesLedges.add(buyerledger1);
//				}
//			}
			return new ResponseEntity<>(salesLedges, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<List<SalesLedger>> getAllSalesLedgerDetails() {
		try {
			List<SalesLedger> salesLedges = new ArrayList<SalesLedger>();
			ledgerRepository.findAll().forEach(salesLedges::add);
			if (salesLedges.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(salesLedges, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<List<String>> getAllSalesLedgerName() {
		try {
			List<String> salesLedges = new ArrayList<String>();
			ledgerRepository.findSalesLedgerName().forEach(salesLedges::add);
			if (salesLedges.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(salesLedges, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<List<String>> getAllSalesLedgerAlias() {
		try {
			List<String> salesLedges = new ArrayList<String>();
			ledgerRepository.findSalesLedgerAlias().forEach(salesLedges::add);
			if (salesLedges.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(salesLedges, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<SalesLedger> updateSalesLedger(int salesLedgerId, SalesLedger salesLedger) {
		Optional<SalesLedger> updateSalesLedger = ledgerRepository.findById(salesLedgerId);
		
		System.out.println("salesLedger"+salesLedger);
		System.out.println("BankDetails"+salesLedger.getBankdetails().toString());
		if (updateSalesLedger.isPresent()) {
			salesLedger.setLedgerId(salesLedgerId);
			if (salesLedger.getFileUploadId().length != 0) {
				for (int id : salesLedger.getFileUploadId()) {
					filerepo.update(salesLedgerId, id);

				}

			}
			if(salesLedger.getBankdetails()!=null) {
				List<LedgerBankDetails> bankdetails= salesLedger.getBankdetails();
				for(LedgerBankDetails bank : salesLedger.getBankdetails()) {
					bank.setLedgerid(salesLedgerId);
					bankrepo.save(bank);
				}
			}
			ledgerRepository.save(salesLedger);
			return new ResponseEntity<>(salesLedger, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}

	public ResponseEntity<SalesLedger> updateLedgerStatus(int id, int status, int roleId) {
		Optional<SalesLedger> updateSalesLedger = ledgerRepository.findById(id);
		System.out.println(updateSalesLedger.get());
		if (updateSalesLedger.isPresent()) {

			SalesLedger ledgerStatusUpdate = new SalesLedger();
			ledgerStatusUpdate = updateSalesLedger.get();
			ledgerStatusUpdate.setRecordApprovalStatus(status);
			ledgerStatusUpdate.setModifiedBy(roleId);
			ledgerStatusUpdate = ledgerRepository.save(ledgerStatusUpdate);
			return new ResponseEntity<>(ledgerStatusUpdate, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity<SalesLedger> deleteSalesLedger(int salesLedgerId) {
		Optional<SalesLedger> updateSalesLedger = ledgerRepository.findById(salesLedgerId);
		if (updateSalesLedger.isPresent()) {
			ledgerRepository.saveSalesLedger(salesLedgerId);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity<List<InvoiceBuyerDetails>> getSalesLedger(int companyid) {
		try {
			List<InvoiceBuyerDetails> salesLedges = new ArrayList<InvoiceBuyerDetails>();
			salesLedges = invoiceledgerdetailsRepository.getAllSalesLedger(companyid);
			if (salesLedges.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(salesLedges, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<List<InvoiceBuyerDetails>> getAllPurchaseLedger(int companyid) {
		try {
			List<InvoiceBuyerDetails> salesLedges = new ArrayList<InvoiceBuyerDetails>();
			salesLedges = invoiceledgerdetailsRepository.getAllPurchaseLedger(companyid);
			if (salesLedges.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(salesLedges, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<List<LedgerGroupDetails>> getSalesLedgerGroup() {
		try {
			List<LedgerGroupDetails> salesLedges = new ArrayList<LedgerGroupDetails>();
			salesLedges = ledgergrouprepo.getLedgerGroup("salesgroup");
			if (salesLedges.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(salesLedges, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<List<LedgerGroupDetails>> getPurchaseLedgerGroup() {
		try {
			List<LedgerGroupDetails> salesLedges = new ArrayList<LedgerGroupDetails>();
			salesLedges = ledgergrouprepo.getLedgerGroup("purchasegroup");
			if (salesLedges.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(salesLedges, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<List<LedgerSubGroupDetails>> getLedgerSubGroup(int groupid) {
		try {
			List<LedgerSubGroupDetails> salesLedges = new ArrayList<LedgerSubGroupDetails>();
			salesLedges = ledgersubgrouprepo.getLedgerSubGroup("salespurchasesubgroup", groupid);
			if (salesLedges.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(salesLedges, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public String getGeneratedFileName(String name) {
		LocalDateTime date = LocalDateTime.now();
		Random rd = new Random();
		int randvalu = rd.nextInt(100000);
		System.out.println(randvalu);
		String randValue = Integer.toString(randvalu);
		String modDate = date.toString().replace("-", "").replace(":", "").replace(".", "");
		String genName = modDate + randValue + name;
		System.out.println(date);
		return genName;
	}

}
