package com.fna.service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.AUCInvoiceTaxes;
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
import com.fna.model.SalesLedger;
import com.fna.model.ServiceLedgerByOffice;
import com.fna.model.Voucher;
import com.fna.model.VoucherDetails;
import com.fna.model.VoucherType;
import com.fna.repository.AUCInvoiceTaxRepo;
import com.fna.repository.AucInvoiceDetailsRepo;
import com.fna.repository.AucInvoiceHeaderRepo;
import com.fna.repository.BalanceSheetRepository;
import com.fna.repository.BranchVoucherRepo;
import com.fna.repository.Cashbookrepository;
import com.fna.repository.CompanyLedgerDetailsRepository;
import com.fna.repository.CompanyRepository;
import com.fna.repository.CompanyTypeRepository;
import com.fna.repository.CreditHsnRepo;
import com.fna.repository.CreditLedgerDetailsRepo;
import com.fna.repository.DayBookBindRepository;
import com.fna.repository.DayBookCreditLedgerRepository;
import com.fna.repository.DayBookDebitLedgerRepository;
import com.fna.repository.DayBookDetailsRepo;
import com.fna.repository.DebitHsnRepo;
import com.fna.repository.DebitLedgerDetailsRepo;
import com.fna.repository.FinancialPeriodeRepository;
import com.fna.repository.HsnSacRepo;
import com.fna.repository.InvoiceHeaderDetailsRepo;
import com.fna.repository.InvoiceInfoRepo;
import com.fna.repository.InvoiceItemRepository;
import com.fna.repository.InvoiceMasterViewRepo;
import com.fna.repository.InvoiceRepository;
import com.fna.repository.LedgerRepository;
import com.fna.repository.OfficeAccountRepo;
import com.fna.repository.OfficeBankMappingRepo;
import com.fna.repository.OfficeLedgerMappingRepo;
import com.fna.repository.OfficeMappingRepo;
import com.fna.repository.PattaLedgerMappingRepo;
import com.fna.repository.PaymentDetailsVoucherRepo;
import com.fna.repository.PaymentRepository;
import com.fna.repository.PaymentTermRepository;
import com.fna.repository.ProfitLossRepository;
import com.fna.repository.ServiceLedgerMappingRepo;
import com.fna.repository.TrailBalanceDetailedGroupWiseRepository;
import com.fna.repository.TrailBalanceDetailedWiseRepository;
import com.fna.repository.TrailBalanceGroupWiseRepository;
import com.fna.repository.TrailBalanceLedgerDetailsRepository;
import com.fna.repository.VoucherDetailsRepository;
import com.fna.repository.VoucherGstRepo;
import com.fna.repository.VoucherReportViewRepo;
import com.fna.repository.VoucherRepository;
import com.fna.repository.VoucherTypeRepository;
import com.fna.repository.YearlyBudgetDetailsViewRepository;
import com.fna.repository.gstBuyerVendorDdlRepo;
import com.fna.repository.itBuyerVendorDdlRepo;

@Service
public class AucInvoiceService {

	@Autowired
	private AucInvoiceHeaderRepo headerRepo;
	
	@Autowired
	private AucInvoiceDetailsRepo detailsRepo;
	
	@Autowired
	private InvoiceHeaderDetailsRepo headerDetailsRepo;
	
	
	@Autowired
	private AUCInvoiceTaxRepo invTaxRepo;
	@Autowired
	private LedgerRepository ledgerRepository;
	
	@Autowired
	private OfficeMappingRepo officeRepo;
	@Autowired
	private OfficeBankMappingRepo bankRepo;
	@Autowired
	private ServiceLedgerMappingRepo servicecrgRepo;
	@Autowired
	private PattaLedgerMappingRepo pattacrgRepo;
	@Autowired
	private InvoiceRepository invoiceRepo;
	@Autowired
	private InvoiceItemRepository invoiceItemRepo;
	@Autowired
	private InvoiceInfoRepo invoicedetailsRepo;
	@Autowired
	private PaymentTermRepository paymentTermsRepo;
	@Autowired
	private FinancialPeriodeRepository financialPeriodRepo;
	@Autowired
	private PaymentRepository paymentRepo;
	@Autowired	
	private VoucherRepository voucherRepo;	
	@Autowired
	private VoucherDetailsRepository voucherDetailsRepo;	
	@Autowired
	private CompanyRepository companyRepository;
	@Autowired
	private CompanyTypeRepository companyTypeRepository;
	@Autowired
	private DayBookDebitLedgerRepository daybookdebitrepo;
	@Autowired
	private DayBookCreditLedgerRepository daybookcreditrepo; 
	@Autowired
	private CompanyLedgerDetailsRepository companyledgerdetailsrepo; 	
	@Autowired
	private DayBookDetailsRepo daybookdetailsrepo; 
	@Autowired
	private DayBookBindRepository daybookbindrepo;  
	@Autowired
	private Cashbookrepository cashbookrepo;   
	@Autowired
	private TrailBalanceLedgerDetailsRepository trailbalanceledgerrepo;
	@Autowired
	private TrailBalanceDetailedWiseRepository trailbalancedetailedrepo;
	@Autowired
	private TrailBalanceGroupWiseRepository trailbalancegrouprepo; 
	@Autowired
	private TrailBalanceDetailedGroupWiseRepository trailbalancedetailedgrouprepo;
	@Autowired
	private ProfitLossRepository plrepo; 
	@Autowired
	private YearlyBudgetDetailsViewRepository ybd; 
	@Autowired
	private BalanceSheetRepository bsrepo;
	@Autowired
	private OfficeLedgerMappingRepo ledgermappingrepo;
	
	@Autowired
	private DebitLedgerDetailsRepo drrepo;
	@Autowired
	private CreditLedgerDetailsRepo crrepo;
	@Autowired
	private PaymentDetailsVoucherRepo payrepo;
	@Autowired
	private HsnSacRepo hsnrepo;
	
	@Autowired
	private DebitHsnRepo drhsnrepo;
	@Autowired
	private CreditHsnRepo crhsnrepo;
	@Autowired
	private VoucherTypeRepository voucherTypeRepository;
	@Autowired
	private VoucherReportViewRepo voucherReportViewRepository;
	@Autowired
	private OfficeAccountRepo officeAccountRepo;
	@Autowired
	private itBuyerVendorDdlRepo itBuyerVendorDdlrepo;
	@Autowired
	private gstBuyerVendorDdlRepo gstBuyerVendorDdlrepo; 
	@Autowired
	private InvoiceMasterViewRepo invoiceMasterViewRepo;  
	@Autowired
	private VoucherGstRepo vgstrepo;
	@Autowired
	private BranchVoucherRepo branchVoucherRepo; 
	
	
	
	public ResponseEntity<List<AucInvoiceHeaderDetails>> getAucInvoiceHeader(){
		List<AucInvoiceHeaderDetails> auctlist= new ArrayList<AucInvoiceHeaderDetails>();
		List<AucInvoiceHeaderDetails> auctlistwithdetails= new ArrayList<AucInvoiceHeaderDetails>();
		 auctlist=headerDetailsRepo.findAll();
		 for(AucInvoiceHeaderDetails aucinv:auctlist) {
			 Optional<List<AucInvoiceDetails>> details=detailsRepo.findByinvoiceNo(aucinv.getInvoiceNo());
			 Optional<List<AUCInvoiceTaxes>> taxes=invTaxRepo.findByInvoiceNo(aucinv.getInvoiceNo());
			 if(details.isPresent())
			 aucinv.setAucinvDetails(details.get());
			 if(taxes.isPresent())
			 aucinv.setAucinvTaxes(taxes.get());
			 auctlistwithdetails.add(aucinv);
		 }
		return ResponseEntity.ok(auctlistwithdetails);
	}
	
	public ResponseEntity<List<AucInvoiceHeaderDetails>> getAucInvoiceHeaderByDate( Date from,Date to,Integer cmpid){
		List<AucInvoiceHeaderDetails> auctlist= new ArrayList<AucInvoiceHeaderDetails>();
		List<AucInvoiceHeaderDetails> auctlistwithdetails= new ArrayList<AucInvoiceHeaderDetails>();
		
		 auctlist=headerDetailsRepo.getByDate(from,to,cmpid);
		 if(auctlist!=null)
		 for(AucInvoiceHeaderDetails aucinv:auctlist) {
			 
			 Optional<List<AucInvoiceDetails>> details=detailsRepo.findByinvoiceNo(aucinv.getInvoiceNo());
			 Optional<List<AUCInvoiceTaxes>> taxes=invTaxRepo.findByInvoiceNo(aucinv.getInvoiceNo());
			 if(details.isPresent())
			 aucinv.setAucinvDetails(details.get());
			 if(taxes.isPresent())
			 aucinv.setAucinvTaxes(taxes.get());
			 auctlistwithdetails.add(aucinv);
		 }
		return ResponseEntity.ok(auctlistwithdetails);
	}
	
public ResponseEntity<List<AucInvoiceDetails>> getAucInvoiceDetails(){
		
		return ResponseEntity.ok(detailsRepo.findAll());
	}

	public ResponseEntity<Boolean> updateAucInvoiceHeader(AucInvoiceHeader header){
	
		// insert in invocie table 
		
		InvoiceDetails invoiceDetails =new InvoiceDetails();
		List<InvoiceItemDetails> invoiceItem = new ArrayList<InvoiceItemDetails>();
		AucInvoiceHeader aucinvoice=new AucInvoiceHeader();
		List<AucInvoiceDetails> aucinvoicedetails=new ArrayList<AucInvoiceDetails>();
		List<AUCInvoiceTaxes> invoiceTax=new ArrayList<AUCInvoiceTaxes>();
		 aucinvoice=headerRepo.getById(header.getInvid());
		Optional<List<AucInvoiceDetails>> aucdetailsretrieved=detailsRepo.findByinvoiceNo(aucinvoice.getInvoiceNo());
		if(aucdetailsretrieved.isPresent()) {
			aucinvoicedetails=aucdetailsretrieved.get();
			Optional<List<AUCInvoiceTaxes>>  invoicetaxretrieve=invTaxRepo.findByInvoiceNo(aucinvoice.getInvoiceNo());
			if(invoicetaxretrieve.isPresent()) {
				invoiceTax=invoicetaxretrieve.get();
				//check Buyer for related invoice exist or not
				
				Optional<SalesLedger> buyerdetails= ledgerRepository.findByLedgerCode(aucinvoice.getBuyerId());
				if(buyerdetails.isPresent()) {
				//Transformation of invocie
				//create invocie
				invoiceDetails.setInvoicenumber("AUC-"+aucinvoice.getInvoiceNo());
				invoiceDetails.setCompanyid(16);
				invoiceDetails.setInvoicedate(aucinvoice.getInvoiceDate());
				invoiceDetails.setBuyerid(buyerdetails.get().getLedgerId());
				invoiceDetails.setDuedate(aucinvoice.getPaymentDueDate());
				invoiceDetails.setInvoicetotal(aucinvoice.getValue());
				invoiceDetails.setApproververifiedstatus(4);
				invoiceDetails.setInvoicefromadminorauction(8);
				// add all the taxes in the main table 
				
				for(AUCInvoiceTaxes tax :invoiceTax) {
					if(tax.getTaxId()==6) {
						invoiceDetails.setSgstvalue(tax.getValue());
						invoiceDetails.setSgstrate(tax.getTaxCharges());
						
					}else if(tax.getTaxId()==5) {
						invoiceDetails.setCgstvalue(tax.getValue());
						invoiceDetails.setCgstrate(tax.getTaxCharges());
						
					} else if(tax.getTaxId()==2) { //service chagre
						invoiceDetails.setServiceValue(tax.getValue());
						invoiceDetails.setServiceRate(tax.getTaxCharges());
						
					}  else if(tax.getTaxId()==0) { //patta chagres
						invoiceDetails.setPattavalue(tax.getValue());
						invoiceDetails.setPattaRate(tax.getTaxCharges());
					} else if(tax.getTaxId()==7) { //patta chagres
						invoiceDetails.setIgstvalue(tax.getValue());
						invoiceDetails.setIgstrate(tax.getTaxCharges());
					} 
					
				}
				// save invocie
				invoiceRepo.save(invoiceDetails);
				
				
				//create Invociedetails 
				for(AucInvoiceDetails details:aucinvoicedetails) {
					InvoiceItemDetails invoiceDetail=new InvoiceItemDetails();
					invoiceDetail.setInvoiceId(details.getInvoiceNo());
					invoiceDetail.setItemid(10714);
					invoiceDetail.setInvoiceId(invoiceDetails.getInvoiceid());
					invoiceDetail.setItemdescription("BALE PATTA CHARGES - GROWERS(AP)");
					invoiceDetail.setQty((int)aucinvoice.getQuantityPurchased());
					invoiceDetail.setTotal(aucinvoice.getValue());
					invoiceItem.add(invoiceDetail);
				}
				
				}else {
					ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
				}
				
			}else {
				ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
			
			//save the transformation
			
			
			// invoicedetails save
			invoiceItemRepo.saveAll(invoiceItem);
		
			
		}else {
			ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
		
		// Update invoice auction
		int s=headerRepo.approveaucinvoice(header.getInvid());
		System.out.println("update response"+s);
		if(s==1) {
		return ResponseEntity.ok(true);
		}
		else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
			
	}

	public ResponseEntity<Boolean> updateAucInvoiceHeaderList(List<AucInvoiceHeader> header) {
		// TODO Auto-generated method stub
		
		//grid has Multiple Unique Invoices with STatus of approval  and also status of selected check box
		//do only for status not approved 
		
		//see in a loop for all checkbox of check for approval
		//only one checkbox for all (the checked records) where checkbox is selected
		//save only them this handles one or all
		
		//cretae the invoice for each approval 
		//create the invociedetails for eash approved invoice
		//
		
		for(AucInvoiceHeader hd: header) {
			
			System.out.println("Request "+hd);

			// insert in invocie table 
			
			InvoiceDetails invoiceDetails =new InvoiceDetails();
			List<InvoiceItemDetails> invoiceItem = new ArrayList<InvoiceItemDetails>();
			AucInvoiceHeader aucinvoice=new AucInvoiceHeader();
			List<AucInvoiceDetails> aucinvoicedetails=new ArrayList<AucInvoiceDetails>();
			List<AUCInvoiceTaxes> invoiceTax=new ArrayList<AUCInvoiceTaxes>();
			 aucinvoice=headerRepo.getById(hd.getInvid());
			Optional<List<AucInvoiceDetails>> aucdetailsretrieved=detailsRepo.findByinvoiceNo(aucinvoice.getInvoiceNo());
			if(aucdetailsretrieved.isPresent()) {
				System.out.println("Auction details"+aucdetailsretrieved.get());
				aucinvoicedetails=aucdetailsretrieved.get();
				Optional<List<AUCInvoiceTaxes>>  invoicetaxretrieve=invTaxRepo.findByInvoiceNo(aucinvoice.getInvoiceNo());
				if(invoicetaxretrieve.isPresent()) {
					System.out.println("Auction taxes"+invoicetaxretrieve.get());
					invoiceTax=invoicetaxretrieve.get();
					//check Buyer for related invoice exist or not
					
					Optional<SalesLedger> buyerdetails= ledgerRepository.findByLedgerCode(aucinvoice.getBuyerId());
					if(buyerdetails.isPresent()) {
						System.out.println("Auction Buyer"+buyerdetails.get());
					//Transformation of invocie
					//create invocie
					invoiceDetails.setInvoicenumber("AUC-"+aucinvoice.getInvoiceNo());
					invoiceDetails.setCompanyid(aucinvoice.getCompanyid());
					invoiceDetails.setInvoicedate(aucinvoice.getInvoiceDate());
					invoiceDetails.setBuyerid(buyerdetails.get().getLedgerId());
					invoiceDetails.setInvoicetotal(aucinvoice.getValue());
					invoiceDetails.setDuedate(aucinvoice.getPaymentDueDate());
					invoiceDetails.setInvoicefromadminorauction(8);
					invoiceDetails.setInvoicestatus(1);
					invoiceDetails.setApproververifiedstatus(3);
					// add all the taxes in the main table 
					
					for(AUCInvoiceTaxes tax :invoiceTax) {
						if(tax.getTaxId()==6) {
							invoiceDetails.setSgstvalue(tax.getValue());
							invoiceDetails.setSgstrate(tax.getTaxCharges());
							
						}else if(tax.getTaxId()==5) {
							invoiceDetails.setCgstvalue(tax.getValue());
							invoiceDetails.setCgstrate(tax.getTaxCharges());
							
						} else if(tax.getTaxId()==2) { //service chagre
							invoiceDetails.setServiceValue(tax.getValue());
							invoiceDetails.setServiceRate(tax.getTaxCharges());
							
						}  else if(tax.getTaxId()==0) { //patta chagres
							invoiceDetails.setPattavalue(tax.getValue());
							invoiceDetails.setPattaRate(tax.getTaxCharges());
						} else if(tax.getTaxId()==7) { //patta chagres
							invoiceDetails.setIgstvalue(tax.getValue());
							invoiceDetails.setIgstrate(tax.getTaxCharges());
						} 
						
					}
					// save invocie
					invoiceRepo.save(invoiceDetails);
					
					// create payment for invoice
					InvoiceDetails invoiceList = new InvoiceDetails();
					Optional<InvoiceDetails> invoiceList1 = invoiceRepo.findById(invoiceDetails.getInvoiceid());
					invoiceList = invoiceList1.get();
					Payment payment = new Payment();
					payment.setInvoiceId(invoiceList.getInvoiceid());
					Date invoiceDate = new Date(invoiceList.getInvoicedate().getTime());
					payment.setInvoiceDate(invoiceDate);
					payment.setInvoiceNo(invoiceList.getInvoicenumber());
					int paymenttTermId = invoiceList.getPaymenttermsid();
					PaymentTerm paymentDetails = new PaymentTerm();
					Optional<PaymentTerm> paymentDetail = paymentTermsRepo.findById(paymenttTermId);
					payment.setPaymentDueDate(aucinvoice.getPaymentDueDate());
					System.out.println(payment);
					payment.setPaymentNo("PYT"+invoiceList.getInvoicenumber());
					
					payment.setApproverVerifiedStatus(0);
					payment.setPaymentAmount(invoiceList.getInvoicetotal());
					payment.setpBalance(invoiceList.getInvoicetotal());
					payment.setAdminorauction(8);
					paymentRepo.save(payment);
					//create Invociedetails 
					for(AucInvoiceDetails details:aucinvoicedetails) {
						InvoiceItemDetails invoiceDetail=new InvoiceItemDetails();
						invoiceDetail.setInvoiceId(details.getInvoiceNo());
						invoiceDetail.setItemid(10714);
						invoiceDetail.setInvoiceId(invoiceDetails.getInvoiceid());
						invoiceDetail.setItemdescription("BALE PATTA CHARGES - GROWERS(AP)");
						invoiceDetail.setQty((int)aucinvoice.getQuantityPurchased());
						invoiceDetail.setTotal(aucinvoice.getValue());
						invoiceItem.add(invoiceDetail);
					}
					
					}else {
						ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
					}
					
				}else {
					ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
				}
				
				//save the transformation
				
				
				// invoicedetails save
				invoiceItemRepo.saveAll(invoiceItem);
			
				//sales voucher creation
				// step 1 : take list of invoice no which status is  approved and voucher is not created
				List<AucInvoiceHeader> invHeader= new ArrayList<AucInvoiceHeader>();
				List<AucInvoiceDetails> invDetails=new ArrayList<AucInvoiceDetails>();
				List<Voucher> voucherList=new ArrayList<Voucher>();
				invHeader=headerRepo.findAll();
				
				invDetails=detailsRepo.findAll();
				// step 2: create the voucher.
				int inctype=1;
				
				Voucher voucher=new Voucher();
				voucher.setCompanyid(22);
				voucher.setNarration("Voucher for Invoice No:"+invoiceDetails.getInvoicenumber() +" for buyer '"+hd.getBuyerName() +"'.");
				voucher.setStatusid(1);
				voucher.setVouchertypeid(5);
				voucher.setAccounttypeid(8);
				voucher.setVoucherdate(new Date());
				voucher.setInvoiceNo("AUC-"+hd.getInvoiceNo());
				double invtotal=headerRepo.getInvoiceValue(aucinvoice.getInvoiceNo());
				
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
			 //update  invoice with voucher id
			 System.out.println("Invoiceid="+invoiceDetails.getInvoiceid()+"VoucherId"+voucher.getVoucherid());
			 invoiceRepo.updateVoucheridStatus(invoiceDetails.getInvoiceid(),voucher.getVoucherid());
			//creation of voucherdetails
				List<VoucherDetails> voucherDetailList=new ArrayList<VoucherDetails>();
				
				
					VoucherDetails drvoucherdetails =new VoucherDetails();
					VoucherDetails crvoucherdetails =new VoucherDetails();
					AucInvoiceHeader invoiceHeader= new AucInvoiceHeader();
					Optional<AucInvoiceHeader> headerbyinv=headerRepo.findByInvoiceNo(hd.getInvoiceNo());
					Optional<List<AUCInvoiceTaxes>> taxbyinv=invTaxRepo.findByInvoiceNo(hd.getInvoiceNo());
									
					Optional<SalesLedger> sledger = ledgerRepository.findByLedgerCode(headerbyinv.get().getBuyerId());
					List<OfficeMappingDetails> office= new ArrayList<OfficeMappingDetails>();
					List<OfficeBankMappingDetails> bankDetails=new ArrayList<>();
					List<PattaLedgerByOffice> pattacharge=new ArrayList<>();
					List<ServiceLedgerByOffice> servicecharge= new ArrayList<>();
					
							office=officeRepo.findAll();
							bankDetails=bankRepo.findByofficeid(aucinvoice.getCompanyid());
							pattacharge=pattacrgRepo.findByofficeid(aucinvoice.getCompanyid());
							servicecharge=servicecrgRepo.findByofficeid(aucinvoice.getCompanyid());
							
					OfficeMappingDetails selectedoffice=new OfficeMappingDetails();
					List<OfficeBankMappingDetails> selectedBank=new ArrayList<OfficeBankMappingDetails>();
					if(!office.isEmpty() || !bankDetails.isEmpty()) {
						for(OfficeMappingDetails office1:office) {
							if(office1.getOfficeid()==(aucinvoice.getCompanyid())) {
								selectedoffice=office1;
							}
						}
						for(OfficeBankMappingDetails bank:bankDetails) {
							if(bank.getBankid() != null) {
								selectedBank.add(bank);
							}
						}
						
						System.out.println("Selected office "+(aucinvoice.getCompanyid()));
						
						
						
						
					drvoucherdetails.setVoucherseq(seq);
						drvoucherdetails.setVoucherid(voucher.getVoucherid());
						drvoucherdetails.setDebitledger(sledger.get().getLedgerId());
						drvoucherdetails.setLedgeralias(sledger.get().getLedgerAlias());
						drvoucherdetails.setNarration("Invoice No: "+invoiceDetails.getInvoicenumber());
						drvoucherdetails.setDebitamount(invtotal);
					crvoucherdetails.setVoucherseq(seq);
					crvoucherdetails.setVoucherid(voucher.getVoucherid());	
					crvoucherdetails.setCreditamount(invtotal);
					crvoucherdetails.setNarration("Invoice No: "+invoiceDetails.getInvoicenumber());
					// buyer proceeds
					crvoucherdetails.setCreditledger(15572);
					crvoucherdetails.setLedgeralias("BUYER PROCEEDS(AP)");
						voucherDetailList.add(crvoucherdetails);
						voucherDetailList.add(drvoucherdetails);
						
						
						if(taxbyinv.isPresent()) {
							
							for(AUCInvoiceTaxes tax:taxbyinv.get()) {
								seq+=1;
									VoucherDetails drtaxvoucherdetails =new VoucherDetails();
									VoucherDetails crtaxvoucherdetails =new VoucherDetails();
									
									drtaxvoucherdetails.setVoucherseq(seq);
									drtaxvoucherdetails.setVoucherid(voucher.getVoucherid());
									System.out.println(sledger.get().getLedgerId());
									drtaxvoucherdetails.setDebitledger(sledger.get().getLedgerId());
									drtaxvoucherdetails.setNarration("Invoice No: "+invoiceDetails.getInvoicenumber());
									drtaxvoucherdetails.setDebitamount(Double.valueOf(tax.getValue()));
									
									crtaxvoucherdetails.setVoucherseq(seq);
									crtaxvoucherdetails.setVoucherid(voucher.getVoucherid());	
									crtaxvoucherdetails.setCreditamount(Double.valueOf(tax.getValue()));
									crtaxvoucherdetails.setNarration("Invoice No: "+invoiceDetails.getInvoicenumber());	
									
									if(tax.getTaxId()==6) {
										crtaxvoucherdetails.setCreditledger(selectedoffice.getSgstledgerofofficeid());	
									}else if(tax.getTaxId()==5) {
										crtaxvoucherdetails.setCreditledger(selectedoffice.getCgstledgerofofficeid());	
									}
									else if(tax.getTaxId()==7) {
										
										crtaxvoucherdetails.setCreditledger(selectedoffice.getIgstledgerofofficeid());	
									}else if(tax.getTaxId()==2) {
										//servicecharges
										crtaxvoucherdetails.setCreditledger(servicecharge.get(0).getSledgerid());	
									}
									else if(tax.getTaxId()==0) {
										//pattacharges
										crtaxvoucherdetails.setCreditledger(pattacharge.get(0).getPledgerid());	
									}
									voucherDetailList.add(drtaxvoucherdetails);
									voucherDetailList.add(crtaxvoucherdetails);
									
							}
						}
						
				}
				voucherDetailsRepo.saveAll(voucherDetailList);
				
				headerRepo.approveaucinvoice(headerbyinv.get().getInvid());
				
			}else {
				ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
			
			
			
			
		}
		
		return ResponseEntity.ok(true);
		
	}
	
	



}
