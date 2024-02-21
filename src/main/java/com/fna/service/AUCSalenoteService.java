package com.fna.service;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.AUCInvoiceTaxes;
import com.fna.model.AUCSaleNoteTaxes;
import com.fna.model.AUCSalenoteDetail;
import com.fna.model.AUCSalenoteDetails;
import com.fna.model.AUCSalenoteLoan;
import com.fna.model.AucInvoiceDetails;
import com.fna.model.AucInvoiceHeader;
import com.fna.model.AucInvoiceHeaderDetails;
import com.fna.model.Company;
import com.fna.model.FinancialYearDetails;
import com.fna.model.InvoiceDetails;
import com.fna.model.InvoiceItemDetails;
import com.fna.model.OfficeBankMappingDetails;
import com.fna.model.OfficeMappingDetails;
import com.fna.model.PattaLedgerByOffice;
import com.fna.model.Payment;
import com.fna.model.PaymentTerm;
import com.fna.model.SalenoteReconcile;
import com.fna.model.SalesLedger;
import com.fna.model.ServiceLedgerByOffice;
import com.fna.model.SubledgerForLoan;
import com.fna.model.Voucher;
import com.fna.model.VoucherDetails;
import com.fna.model.VoucherType;
import com.fna.repository.AUCSalenotedetailrepo;
import com.fna.repository.CompanyRepository;
import com.fna.repository.CompanyTypeRepository;
import com.fna.repository.FinancialPeriodeRepository;
import com.fna.repository.LedgerRepository;
import com.fna.repository.OfficeBankMappingRepo;
import com.fna.repository.OfficeLedgerMappingRepo;
import com.fna.repository.OfficeMappingRepo;
import com.fna.repository.PattaLedgerMappingRepo;
import com.fna.repository.SalenoteLoan;
import com.fna.repository.SalenoteReconcileRepo;
import com.fna.repository.Salenotedetailsrepo;
import com.fna.repository.Salenotetaxrepo;
import com.fna.repository.ServiceLedgerMappingRepo;
import com.fna.repository.SubledgerForLoanRepo;
import com.fna.repository.VoucherDetailsRepository;
import com.fna.repository.VoucherRepository;
import com.fna.repository.VoucherTypeRepository;

@Service
public class AUCSalenoteService {

	@Autowired
	private Salenotedetailsrepo sheaderrepo;

	@Autowired
	private AUCSalenotedetailrepo sdetailrepo;

	@Autowired
	private Salenotetaxrepo staxrepo;
	@Autowired
	private SalenoteLoan loanrepo;
	@Autowired
	private LedgerRepository ledgerRepository;
	@Autowired
	private VoucherRepository voucherRepo;
	@Autowired
	private VoucherDetailsRepository voucherDetailsRepo;
	@Autowired
	private VoucherTypeRepository voucherTypeRepository;
	@Autowired
	private CompanyRepository companyRepository;
	@Autowired
	private CompanyTypeRepository companyTypeRepository;
	@Autowired
	private FinancialPeriodeRepository financialPeriodRepo;
	@Autowired
	private OfficeLedgerMappingRepo ledgermappingrepo;
	@Autowired
	private OfficeMappingRepo officeRepo;
	@Autowired
	private OfficeBankMappingRepo bankRepo;
	@Autowired
	private ServiceLedgerMappingRepo servicecrgRepo;
	@Autowired
	private PattaLedgerMappingRepo pattacrgRepo;

	@Autowired
	private SalenoteReconcileRepo reconcileRepo;
	
	@Autowired
	private SubledgerForLoanRepo subledgerloanRepo;
	
	public ResponseEntity<List<AUCSalenoteDetails>> getAucInvoiceHeaderByDate(Date from, Date to,Integer cmpid)
			throws ParseException {
		List<AUCSalenoteDetails> auctlist = new ArrayList<AUCSalenoteDetails>();
		List<AUCSalenoteDetails> auctlistwithdetails = new ArrayList<AUCSalenoteDetails>();

		auctlist = sheaderrepo.getByDate(from, to,cmpid);
		if (auctlist != null)
			for (AUCSalenoteDetails aucpuc : auctlist) {

				Optional<List<AUCSalenoteDetail>> details = sdetailrepo.findBysaleNoteNo(aucpuc.getSaleNote_No());
				Optional<List<AUCSaleNoteTaxes>> taxes = staxrepo.findBySaleNoteNo(aucpuc.getSaleNote_No());
				SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd");

				Date datetrans = DateFor.parse(DateFor.format(aucpuc.getSaleNote_Date()));
				

				Optional<List<AUCSalenoteLoan>> loan = loanrepo.findByTBGRNowithDate(aucpuc.getTBGRNO(), datetrans);
				if (details.isPresent())
					aucpuc.setAucsalenoteDetail(details.get());
				if (taxes.isPresent())
					aucpuc.setAucsalenoteTaxes(taxes.get());
				if (loan.isPresent())
					aucpuc.setAucsalenoteLoan(loan.get());
				auctlistwithdetails.add(aucpuc);

			}
		return ResponseEntity.ok(auctlistwithdetails);
	}

	public ResponseEntity<Boolean> updateAucSalenoteHeaderList(List<AUCSalenoteDetails> header) {
		// TODO Auto-generated method stub

		// Render selected sale note details

		for (AUCSalenoteDetails hd : header) {
			AUCSalenoteDetails saleHeader = new AUCSalenoteDetails();
			List<AUCSalenoteDetail> saleDetail = new ArrayList<AUCSalenoteDetail>();
			List<AUCSaleNoteTaxes> saleTaxes = new ArrayList<AUCSaleNoteTaxes>();
			List<AUCSalenoteLoan> saleLoan = new ArrayList<AUCSalenoteLoan>();
			SalesLedger grower = new SalesLedger();
			Optional<List<AUCSalenoteDetail>> retrieveSaleDetails;
			// retrieveby saleniteid
			saleHeader = sheaderrepo.getById(hd.getShid());
			retrieveSaleDetails = sdetailrepo.findBysaleNoteNo(saleHeader.getSaleNote_No());
			Optional<SalesLedger> growerdetails = ledgerRepository.findByLedgerCode("" + saleHeader.getTBGRNO());
			System.out.println("Growqer Details");
			System.out.println(saleHeader.getTBGRNO());
			if (retrieveSaleDetails.isPresent() && growerdetails.isPresent()) {
				saleDetail = retrieveSaleDetails.get();
				
				grower = growerdetails.get();
				double  totaldetailamounbt=0.0;
				for(AUCSalenoteDetail s: saleDetail) {
					totaldetailamounbt=totaldetailamounbt+s.getTotalAmount();
					System.out.println("summation"+totaldetailamounbt);
				}
				Optional<List<AUCSaleNoteTaxes>> taxdetails = staxrepo.findBySaleNoteNo(saleHeader.getSaleNote_No());
				// SalesVoucher Creation

				// step 1: create the voucher.
				int inctype = 1;

				Voucher voucher = new Voucher();
				voucher.setCompanyid(22);
				voucher.setNarration("Voucher for SaleNote No:" + saleHeader.getSaleNote_No() + " for Growers '"
						+ grower.getLedgerAlias() + "'.");
				voucher.setStatusid(1);
				voucher.setVouchertypeid(6);
				voucher.setAccounttypeid(8);
				voucher.setVoucherdate(hd.getAuction_Date());
				voucher.setInvoiceNo("AUC-" + saleHeader.getSaleNote_No());

				int companyid = voucher.getCompanyid();
				Integer countCompanyType = 0;
				String CompanyCode = "";
				FinancialYearDetails financialPeriod = financialPeriodRepo.getInvoicePeriod();
				List<Company> companyData = companyRepository.findByCompanyId(companyid);			
					for (Company company : companyData) {
						//combination of companytype and vouchertype
						
					     countCompanyType = voucherRepo.getCountOfCompanyType(company.getCompanytypeid(),voucher.getVouchertypeid(),companyid);
					     CompanyCode=  company.getVcode();
					}
					VoucherType vt = voucherTypeRepository.findByvouchertypeid(voucher.getVouchertypeid());
				
					String subFinancial = financialPeriod.getFinancialyearname().substring(2,4);
					
					//0s format-upto lakh
					Integer OCountincrement = countCompanyType+1;
					DecimalFormat df = new DecimalFormat("000000");
					String countincrement = df.format(OCountincrement); 
					
					String vtypename = vt.getVouchertypename();
					if(vtypename.equals("Payment")) {
						voucher.setVouchernumber("V"+"-"+CompanyCode+subFinancial+(countincrement));

					}
	                if(vtypename.equals("Contra")) {
	    				voucher.setVouchernumber("C"+"-"+CompanyCode+subFinancial+(countincrement));

					}
	                if(vtypename.equals("Receipt")) {
	    				voucher.setVouchernumber("R"+"-"+CompanyCode+subFinancial+(countincrement));

					}
	                if(vtypename.equals("Journal")) {
	    				voucher.setVouchernumber("J"+"-"+CompanyCode+subFinancial+(countincrement));

					}
	                if(vtypename.equals("Sales")) {
	    				voucher.setVouchernumber("G"+"-"+CompanyCode+subFinancial+(countincrement));
	 
					}
	                if(vtypename.equals("Purchase")) {
	    				voucher.setVouchernumber("B"+"-"+CompanyCode+subFinancial+(countincrement));

					}
	                if(vtypename.equals("DrNote")) {
	    				voucher.setVouchernumber("DR"+"-"+CompanyCode+subFinancial+(countincrement));

					}
	                if(vtypename.equals("CrNote")) {
	    				voucher.setVouchernumber("CR"+"-"+CompanyCode+subFinancial+(countincrement));

					}
				

				voucher.setStatusid(4);

				voucherRepo.save(voucher);
				inctype++;
				
				// creation of voucherdetails
				List<VoucherDetails> voucherDetailList = new ArrayList<VoucherDetails>();

				VoucherDetails drvoucherdetails = new VoucherDetails();
				VoucherDetails crvoucherdetails = new VoucherDetails();
				AucInvoiceHeader invoiceHeader = new AucInvoiceHeader();

				Integer seq = 0;
				Integer maxVseq = voucherDetailsRepo.findMaxVSeqByCompany(22,8);
				if(maxVseq == null)
            	{
					seq = 1;
            	}
				else 
				{
					seq = maxVseq+1;
				}
				List<OfficeMappingDetails> office = new ArrayList<OfficeMappingDetails>();
				List<OfficeBankMappingDetails> bankDetails = new ArrayList<>();
				List<PattaLedgerByOffice> pattacharge = new ArrayList<>();
				List<ServiceLedgerByOffice> servicecharge = new ArrayList<>();
				List<SubledgerForLoan> loansubledger	= new ArrayList<>();
				office = officeRepo.findAll();
				//loansubledger=subledgerloanRepo.findByauctionoradmin(1);
				bankDetails = bankRepo.findByofficeid(22);
				pattacharge = pattacrgRepo.findByofficeid(22);
				servicecharge = servicecrgRepo.findByofficeid(22);
				
				OfficeMappingDetails selectedoffice = new OfficeMappingDetails();
				List<OfficeBankMappingDetails> selectedBank = new ArrayList<OfficeBankMappingDetails>();
				if (!office.isEmpty() || !bankDetails.isEmpty()) {
					for (OfficeMappingDetails office1 : office) {
						if (office1.getOfficeid() == 22) {
							selectedoffice = office1;
						}
					}
					for (OfficeBankMappingDetails bank : bankDetails) {
						if (bank.getBankid() != null) {
							selectedBank.add(bank);
						}
					}

					System.out.println("" + selectedBank);
					System.out.println("Total Debitamount"+totaldetailamounbt);
					drvoucherdetails.setVoucherseq(seq);
					drvoucherdetails.setVoucherid(voucher.getVoucherid());
					//GROWERS PROCEEDS 89 - 15560 - FNA
					                  //98- 13661 - FNA190423					
					SalesLedger creditaliasdr=ledgerRepository.getById(15559);
					drvoucherdetails.setLedgeralias(creditaliasdr.getLedgerAlias());
					drvoucherdetails.setDebitledger(15559);
					drvoucherdetails.setNarration("SaleNote No:" + saleHeader.getSaleNote_No());
					drvoucherdetails.setDebitamount(totaldetailamounbt);
					crvoucherdetails.setVoucherseq(seq);
					crvoucherdetails.setVoucherid(voucher.getVoucherid());
					crvoucherdetails.setCreditamount(totaldetailamounbt);
					crvoucherdetails.setNarration("SaleNote No:" + saleHeader.getSaleNote_No());
					crvoucherdetails.setCreditledger(grower.getLedgerId());
					crvoucherdetails.setLedgeralias(grower.getLedgerAlias());
					voucherDetailList.add(crvoucherdetails);
					voucherDetailList.add(drvoucherdetails);

					if (taxdetails.isPresent()) {
						saleTaxes = taxdetails.get();
						
						for (AUCSaleNoteTaxes tax : saleTaxes) {
							seq+=1;
							VoucherDetails drtaxvoucherdetails = new VoucherDetails();
							VoucherDetails crtaxvoucherdetails = new VoucherDetails();

							drtaxvoucherdetails.setVoucherseq(seq);
							drtaxvoucherdetails.setVoucherid(voucher.getVoucherid());
							System.out.println(grower.getLedgerId());
							drtaxvoucherdetails.setDebitledger(grower.getLedgerId());
							drtaxvoucherdetails.setLedgeralias(grower.getLedgerAlias());
							drtaxvoucherdetails.setNarration("SaleNote No:" + saleHeader.getSaleNote_No());
							drtaxvoucherdetails.setDebitamount(Double.valueOf(tax.getVALUE()));

							crtaxvoucherdetails.setVoucherseq(seq);
							crtaxvoucherdetails.setVoucherid(voucher.getVoucherid());
							crtaxvoucherdetails.setCreditamount(Double.valueOf(tax.getVALUE()));
							crtaxvoucherdetails.setNarration("SaleNote No:" + saleHeader.getSaleNote_No());
							System.out.println("tax description"+tax.getTax_Desc());
							
							if (tax.getTax_Id() == 6) {
								SalesLedger creditalias=ledgerRepository.getById(selectedoffice.getSgstledgerofofficeid());
								crtaxvoucherdetails.setLedgeralias(creditalias.getLedgerAlias());
								crtaxvoucherdetails.setCreditledger(selectedoffice.getSgstledgerofofficeid());
							} else if (tax.getTax_Id() == 5) {
								SalesLedger creditalias=ledgerRepository.getById(selectedoffice.getCgstledgerofofficeid());
								crtaxvoucherdetails.setLedgeralias(creditalias.getLedgerAlias());
								crtaxvoucherdetails.setCreditledger(selectedoffice.getCgstledgerofofficeid());
							} else if (tax.getTax_Id() == 7) {
								SalesLedger creditalias=ledgerRepository.getById(selectedoffice.getIgstledgerofofficeid());
								crtaxvoucherdetails.setCreditledger(selectedoffice.getIgstledgerofofficeid());
								crtaxvoucherdetails.setLedgeralias(creditalias.getLedgerAlias());
							} else if (tax.getTax_Id() == 2 && tax.getTax_Type()=='P') {
								// pattacharge
								SalesLedger creditalias=ledgerRepository.getById(servicecharge.get(0).getSledgerid());
								crtaxvoucherdetails.setCreditledger(servicecharge.get(0).getSledgerid());
								crtaxvoucherdetails.setLedgeralias(creditalias.getLedgerAlias());
							}else if ( tax.getTax_Type()=='L') {
								// Bale Patta
								SubledgerForLoan loanledger=new SubledgerForLoan();
								loanledger=subledgerloanRepo.findByloancode(tax.getTax_Id());
								//SalesLedger creditalias=ledgerRepository.getById(pattacharge.get(0).getBpattacharges());
								crtaxvoucherdetails.setCreditledger(loanledger.getLedgerid());
								crtaxvoucherdetails.setSubledgerid(loanledger.getSubledgerid());
								crtaxvoucherdetails.setSubledgername(loanledger.getSubledgername());
							} else if (tax.getTax_Id() == 0) {
								// pattacharges
								SalesLedger creditalias=ledgerRepository.getById(pattacharge.get(0).getPledgerid());
								drtaxvoucherdetails.setLedgeralias(creditalias.getLedgerAlias());
								drtaxvoucherdetails.setDebitledger(pattacharge.get(0).getPledgerid());
								crtaxvoucherdetails.setCreditledger(grower.getLedgerId());
								crtaxvoucherdetails.setLedgeralias(grower.getLedgerAlias());
								
							}
							System.out.println("DLedger"+drtaxvoucherdetails);
							System.out.println("CLedger"+crtaxvoucherdetails);
							voucherDetailList.add(drtaxvoucherdetails);
							voucherDetailList.add(crtaxvoucherdetails);
							
						}
					}

				}
				voucherDetailsRepo.saveAll(voucherDetailList);
				//creation of salemnote reconcilation
				if(voucher!=null) {
					SalenoteReconcile reconcileapprover=new SalenoteReconcile();
					SalesLedger bank=ledgerRepository.getById(selectedoffice.getBankledgerofofficeid());
					reconcileapprover.setSalenoteno(saleHeader.getSaleNote_No());
					reconcileapprover.setTbgrno(saleHeader.getTBGRNO());
					reconcileapprover.setVoucherid(voucher.getVoucherid());
					reconcileapprover.setVoucherno(voucher.getVouchernumber());
					reconcileapprover.setGrowername(grower.getLedgerName());
					reconcileapprover.setBankid(selectedoffice.getBankledgerofofficeid());
					reconcileapprover.setBankname(bank.getLedgerName());
					reconcileapprover.setNetamount(saleHeader.getNet_Amount_Payable());
					reconcileapprover.setSalenotedate(saleHeader.getSaleNote_Date());
					reconcileapprover.setApprovalstatus(0);
					reconcileRepo.save(reconcileapprover);
				}
				sheaderrepo.updateStatus(saleHeader.getSaleNote_No());

			} else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
				
			}

		}

		return ResponseEntity.ok(true);

	}

}
