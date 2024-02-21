package com.fna.service;

import java.sql.Date;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.common.PaymentCalculation;
import com.fna.model.AUCInvoiceTaxes;
import com.fna.model.AucInvoiceDetails;
import com.fna.model.AucInvoiceHeader;
import com.fna.model.Company;
import com.fna.model.CompanyType;
import com.fna.model.CreditLimit;
import com.fna.model.FinancialYearDetails;
import com.fna.model.InvoiceDetails;
import com.fna.model.Ledgermapping;
import com.fna.model.OfficeBankMappingDetails;
import com.fna.model.OfficeMappingDetails;
import com.fna.model.PattaLedgerByOffice;
import com.fna.model.Payment;
import com.fna.model.PaymentDetails;
import com.fna.model.PaymentDetailsView;
import com.fna.model.PaymentTerm;
import com.fna.model.PaymentView;
import com.fna.model.SalesLedger;
import com.fna.model.ServiceLedgerByOffice;
import com.fna.model.Voucher;
import com.fna.model.VoucherDetails;
import com.fna.model.VoucherType;
import com.fna.repository.AUCInvoiceTaxRepo;
import com.fna.repository.CompanyRepository;
import com.fna.repository.CompanyTypeRepository;
import com.fna.repository.CreditLimitRepo;
import com.fna.repository.FinancialPeriodeRepository;
import com.fna.repository.InvoiceHeaderDetailsRepo;
import com.fna.repository.InvoiceInfoRepo;
import com.fna.repository.InvoiceItemRepository;
import com.fna.repository.InvoiceRepository;
import com.fna.repository.LedgerRepository;
import com.fna.repository.OfficeBankMappingRepo;
import com.fna.repository.OfficeLedgerMappingRepo;
import com.fna.repository.OfficeMappingRepo;
import com.fna.repository.PattaLedgerMappingRepo;
import com.fna.repository.PaymentDetailsRepository;
import com.fna.repository.PaymentDsetailViewRepo;
import com.fna.repository.PaymentRepository;
import com.fna.repository.PaymentTermRepository;
import com.fna.repository.PaymentViewRepository;
import com.fna.repository.ServiceLedgerMappingRepo;
import com.fna.repository.VoucherDetailsRepository;
import com.fna.repository.VoucherRepository;
import com.fna.repository.VoucherTypeRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentViewRepository paymentview;
	@Autowired
	private PaymentRepository paymentRepo;
	@Autowired
	private PaymentDetailsRepository paymentDetailsRepo;
	@Autowired
	private InvoiceRepository invoiceRepo;
	@Autowired
	private PaymentTermRepository paymentTermsRepo;
	@Autowired
	private PaymentCalculation paycal;
	@Autowired
	private InvoiceService invservice;
	@Autowired
	private CreditLimitRepo limitRepo;
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
	private OfficeLedgerMappingRepo ledgermappingrepo;
	
	@Autowired
	private PaymentDsetailViewRepo detailsrepo;

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
	private InvoiceItemRepository invoiceItemRepo;
	@Autowired
	private InvoiceInfoRepo invoicedetailsRepo;
	@Autowired
	private FinancialPeriodeRepository financialPeriodRepo;
	
	public ResponseEntity<Payment> bankReconcilation(Payment payment){
	
		payment=paymentRepo.save(payment);
		return new ResponseEntity<Payment>(payment,HttpStatus.OK);	
	}
	
	public ResponseEntity<Payment> createPayment(Payment payment, int invoiceId) {
		Payment paymentOld = new Payment();
		float amountpaid;
		paymentOld = paymentRepo.getPaymentByInvoiceId(invoiceId);
		System.out.println("old Payment" + paymentOld);
		
		payment.setPaymentid(paymentOld.getPaymentid());
		payment.setInvoiceDate(paymentOld.getInvoiceDate());
		payment.setPaymentNo(paymentOld.getPaymentNo());
		payment.setInvoiceNo(paymentOld.getInvoiceNo());
		payment.setInvoiceId(paymentOld.getInvoiceId());
		payment.setPaymentAmount(paymentOld.getPaymentAmount());
		payment.setPaymentDueDate(paymentOld.getPaymentDueDate());
		if (payment.getPaymentDetails().get(0).getPaymentMode() == 1) {
			payment.setpAmountPaid(payment.getPaymentDetails().get(0).getCashAmount());
		} else if (payment.getPaymentDetails().get(0).getPaymentMode() == 2) {
			payment.setpAmountPaid(paymentOld.getpAmountPaid()+payment.getPaymentDetails().get(0).getOnlineTranAmount());
		} else if (payment.getPaymentDetails().get(0).getPaymentMode() == 3) {
			payment.setpAmountPaid(payment.getPaymentDetails().get(0).getChequeAmount());
		} else if (payment.getPaymentDetails().get(0).getPaymentMode() == 4) {
			payment.setpAmountPaid(payment.getPaymentDetails().get(0).getDdAmount());
		}
		amountpaid=payment.getpAmountPaid();
		payment.setpBalance(paycal.calBalance(paymentOld.getpBalance(), payment.getpAmountPaid()));
		payment.setpAmountPaid(paymentOld.getpAmountPaid()+payment.getpAmountPaid());
		System.out.println(payment.getpBalance());
		System.out.println("final payment"+payment);
		payment = paymentRepo.save(payment);
		
		
		
		InvoiceDetails invoiceList =new InvoiceDetails();
		Optional<InvoiceDetails>invoiceList1=invoiceRepo.findById(payment.getInvoiceId());
		invoiceList=invoiceList1.get();
//		CreditLimit limit= limitRepo.findBybuyerId(invoiceList.getBuyerid());
//		limit.setLimitBalance(limit.getLimitBalance()+amountpaid);
//		limit.setLimitUtilize(limit.getLimitUtilize()-amountpaid);
//		limitRepo.save(limit);
		
		
		Voucher paymnetVoucher=new Voucher();		
		//addSalesVoucher(paymnetVoucher,invoiceList,payment,amountpaid);
		addPaymentReciept(paymnetVoucher,invoiceList,payment,amountpaid);
		System.out.println("resposne" + payment);
		return new ResponseEntity<>(payment, HttpStatus.OK);
	}

	

	public ResponseEntity<Payment> insertInvoiceDetails(int invoiceId) {
		InvoiceDetails invoiceList = new InvoiceDetails();
		Optional<InvoiceDetails> invoiceList1 = invoiceRepo.findById(invoiceId);
		invoiceList = invoiceList1.get();
		Payment payment = new Payment();
		payment.setInvoiceId(invoiceList.getInvoiceid());
		Date invoiceDate = new Date(invoiceList.getInvoicedate().getTime());
		payment.setInvoiceDate(invoiceDate);
		payment.setInvoiceNo(invoiceList.getInvoicenumber());
		int paymenttTermId = invoiceList.getPaymenttermsid();
		PaymentTerm paymentDetails = new PaymentTerm();
		Optional<PaymentTerm> paymentDetail = paymentTermsRepo.findById(paymenttTermId);
		if (!paymentDetail.isEmpty()) {
			paymentDetails = paymentDetail.get();
			Calendar c = Calendar.getInstance();
			c.setTime(invoiceDate);
			c.add(Calendar.DATE, paymentDetails.getNoofCreditDays());
			invoiceDate = new Date(c.getTimeInMillis());
			payment.setPaymentDueDate(invoiceDate);
		}
		System.out.println(payment);
		payment.setPaymentNo("PYT"+invoiceList.getInvoicenumber());
		payment.setApproverVerifiedStatus(0);
		payment.setPaymentAmount(invoiceList.getInvoicetotal());
		payment.setpBalance(invoiceList.getInvoicetotal());
		paymentRepo.save(payment);

		return new ResponseEntity<>(payment, HttpStatus.OK);
	}

	public ResponseEntity<List<Payment>> getPayment() {
		List<Payment> paymentDetails = paymentRepo.findAll();
		return new ResponseEntity<>(paymentDetails, HttpStatus.ACCEPTED);
	}
	
	public ResponseEntity<PaymentView> getPayment(int paymentid) {
		PaymentView paymentDetails = paymentview.getPaymentviewById(paymentid);
		List<PaymentDetailsView> paymnetdetails=detailsrepo.findByPaymentid(paymentid);
		paymentDetails.setPaymentDetails(paymnetdetails);
		return new ResponseEntity<>(paymentDetails, HttpStatus.ACCEPTED);
	}
	
	public ResponseEntity<List<PaymentView>> getPaymentDetails() {
		List<PaymentView> paymentDetails = paymentview.getPaymentview();
		return new ResponseEntity<>(paymentDetails, HttpStatus.ACCEPTED);
	}
	
	public Voucher addPaymentReciept(Voucher voucher,InvoiceDetails invoicelist,Payment payment,float amountpaid) {
		
		//retrieve voucherid by invoiceList by invoiceid
		
		//Optional<Voucher> saleVoucher=voucherRepo.findById(invoicelist.getVoucherid());
		
		voucher=new Voucher();
		//Voucher voucher1=saleVoucher.get();
		voucher.setCompanyid(invoicelist.getCompanyid());
		voucher.setNarration("Reciept Voucher for Invoice No:"+invoicelist.getInvoicenumber());
		voucher.setStatusid(1);
		voucher.setVouchertypeid(3);
		if(invoicelist.getInvoicefromadminorauction()==8)
		voucher.setAccounttypeid(8);
		else
			voucher.setAccounttypeid(1);
		voucher.setVoucherdate(new java.util.Date());
		
		int companyid = voucher.getCompanyid();
		Integer countCompanyType = 0;
		String CompanyCode = "";
		List<Company> companyData = companyRepository.findByCompanyId(companyid);			
			for (Company company : companyData) {
				//combination of companytype and vouchertype
			     countCompanyType = voucherRepo.getCountOfCompanyType(company.getCompanytypeid(),voucher.getVouchertypeid(),companyid);
			     CompanyCode=  (CompanyCode== null)?"":company.getVcode();
			}
			VoucherType vt = voucherTypeRepository.findByvouchertypeid(voucher.getVouchertypeid());
			FinancialYearDetails financialPeriod = financialPeriodRepo.getInvoicePeriod();
			
			//currentfinancialyear
			String subFinancial = financialPeriod.getFinancialyearname().substring(2,4);
			 
			//0s format-upto lakh
			Integer OCountincrement = countCompanyType+1;
			DecimalFormat df = new DecimalFormat("000000");
			String countincrement = df.format(OCountincrement);
			String vtypename = vt.getVouchertypename();
			voucher.setVouchernumber("R"+"-"+CompanyCode+subFinancial+(countincrement));
		voucher.setStatusid(4);
	 
	 voucherRepo.save(voucher);
	//creation of voucherdetails
	int seq=1;
	List<OfficeBankMappingDetails> bankDetails=new ArrayList<>();
	bankDetails=bankRepo.findByofficeid(companyid);
	OfficeMappingDetails selectedoffice=new OfficeMappingDetails();
	List<OfficeBankMappingDetails> selectedBank=new ArrayList<OfficeBankMappingDetails>();
	List<OfficeMappingDetails> office= new ArrayList<OfficeMappingDetails>();
	office=officeRepo.findAll();
	if(!office.isEmpty() || !bankDetails.isEmpty()) {
		for(OfficeMappingDetails office1:office) {
			if(office1.getOfficeid()==companyid) {
				selectedoffice=office1;
			}
		}
		for(OfficeBankMappingDetails bank:bankDetails) {
			if(bank.getBankid() != null) {
				selectedBank.add(bank);
			}
		}
		
		System.out.println("selcted office id "+companyid);
	}
	 VoucherDetails v=new VoucherDetails();
	 VoucherDetails v1=new VoucherDetails();
		v.setVoucherseq(seq);
		v1.setVoucherseq(seq);
		v.setVoucherid(voucher.getVoucherid());
		v1.setVoucherid(voucher.getVoucherid());
		v.setCreditledger(invoicelist.getBuyerid());
		v.setCreditamount((double)amountpaid);
		v1.setDebitledger(selectedoffice.getBankledgerofofficeid());
		v1.setDebitamount((double)amountpaid);
		//v.setLedgeralias(vouc.getLedgeralias());
		v.setNarration("Invoice NO: "+invoicelist.getInvoicenumber());
		v1.setNarration("Invoice NO: "+invoicelist.getInvoicenumber());
		
	 
//	 int saleVoucherId=saleVoucher.get().getVoucherid();
//	List<VoucherDetails> voucherDetailList=new ArrayList<VoucherDetails>();
//	List<VoucherDetails> voucherRecieptDetailList=new ArrayList<VoucherDetails>();
//	
	//retrieve Sales Voucher Details
//	voucherDetailList=voucherDetailsRepo.findByVoucherid(saleVoucherId);
//	for(VoucherDetails vouc: voucherDetailList) {
//		System.out.println(vouc);
//		VoucherDetails v=new VoucherDetails();
//		v.setVoucherseq(vouc.getVoucherseq());
//		v.setVoucherid(voucher.getVoucherid());
//		v.setCreditledger(vouc.getCreditledger());
//		v.setCreditamount(vouc.getCreditamount());
//		v.setDebitledger(vouc.getDebitledger());
//		v.setDebitamount(vouc.getDebitamount());
//		v.setLedgeralias(vouc.getLedgeralias());
//		v.setNarration(vouc.getNarration());
//		voucherRecieptDetailList.add(v);
//	}
//	
	
	
	voucherDetailsRepo.save(v);
	voucherDetailsRepo.save(v1);
		
	voucher.setInvoiceNo("AUC-"+invoicelist.getInvoicenumber());
		
		//Reciept  voucher creation
//		
//		List<AucInvoiceHeader> invHeader= new ArrayList<AucInvoiceHeader>();
//		List<AucInvoiceDetails> invDetails=new ArrayList<AucInvoiceDetails>();
//		List<Voucher> voucherList=new ArrayList<Voucher>();
//		invHeader=headerRepo.findAll();
//		//Retrieve Ledger name by buyerid
//		invDetails=detailsRepo.findAll();
//		// step 2: create the  reciept voucher.
//		int inctype=1;
//		
//		voucher=new Voucher();
//		voucher.setCompanyid(20);
//		voucher.setNarration("Voucher for Invoice No:"+invoicelist.getInvoicenumber() +" for buyer '"+invoicelist.getBuyerid() +"'.");
//		voucher.setStatusid(1);
//		voucher.setVouchertypeid(3);
//		voucher.setAccounttypeid(8);
//		voucher.setVoucherdate(new java.util.Date());
//		voucher.setInvoiceNo("AUC-"+invoicelist.getInvoicenumber());
//		//double invtotal=aucinvoice.getValue();
//		double invtotal=headerRepo.getInvoiceValue(aucinvoice.getInvoiceNo());
//		
//		int companyid = voucher.getCompanyid();
//		Integer countCompanyType = 0;
//		String CompanyCode = "";
//		List<Company> companyData = companyRepository.findByCompanyId(companyid);			
//			for (Company company : companyData) {
//				//combination of companytype and vouchertype
//			     countCompanyType = voucherRepo.getCountOfCompanyType(company.getCompanytypeid(),voucher.getVouchertypeid());
//			     CompanyCode=  (CompanyCode== null)?"":company.getVcode();
//			}
//			VoucherType vt = voucherTypeRepository.findByvouchertypeid(voucher.getVouchertypeid());
////			int yearnow = Calendar.getInstance().get(Calendar.YEAR);
////			int yearnext = (Calendar.getInstance().get(Calendar.YEAR)+1) % 100;
//			FinancialYearDetails financialPeriod = financialPeriodRepo.getInvoicePeriod();
//			
//			//currentfinancialyear
//			String subFinancial = financialPeriod.getFinancialyearname().substring(2,4);
//			 
//			//0s format-upto lakh
//			Integer OCountincrement = countCompanyType+1;
//			DecimalFormat df = new DecimalFormat("000000");
//			String countincrement = df.format(OCountincrement);
//			String vtypename = vt.getVouchertypename();
//			voucher.setVouchernumber("G"+"-"+CompanyCode+subFinancial+(countincrement));
//		voucher.setStatusid(4);
//	 
//	 voucherRepo.save(voucher);
//	//creation of voucherdetails
//		List<VoucherDetails> voucherDetailList=new ArrayList<VoucherDetails>();
//		
//		
//			VoucherDetails drvoucherdetails =new VoucherDetails();
//			VoucherDetails crvoucherdetails =new VoucherDetails();
//			AucInvoiceHeader invoiceHeader= new AucInvoiceHeader();
//			
//			Optional<AucInvoiceHeader> headerbyinv=headerRepo.findByInvoiceNo(hd.getInvoiceNo());
//			Optional<List<AUCInvoiceTaxes>> taxbyinv=invTaxRepo.findByInvoiceNo(hd.getInvoiceNo());
//			int seq=1;
//			
//			Optional<SalesLedger> sledger = ledgerRepository.findByLedgerCode(headerbyinv.get().getBuyerId());
//			List<OfficeMappingDetails> office= new ArrayList<OfficeMappingDetails>();
//			List<OfficeBankMappingDetails> bankDetails=new ArrayList<>();
//			List<PattaLedgerByOffice> pattacharge=new ArrayList<>();
//			List<ServiceLedgerByOffice> servicecharge= new ArrayList<>();
//			
//					office=officeRepo.findAll();
//					bankDetails=bankRepo.findByofficeid(20);
//					pattacharge=pattacrgRepo.findByofficeid(20);
//					servicecharge=servicecrgRepo.findByofficeid(20);
//					
//			OfficeMappingDetails selectedoffice=new OfficeMappingDetails();
//			List<OfficeBankMappingDetails> selectedBank=new ArrayList<OfficeBankMappingDetails>();
//			if(!office.isEmpty() || !bankDetails.isEmpty()) {
//				for(OfficeMappingDetails office1:office) {
//					if(office1.getOfficeid()==20) {
//						selectedoffice=office1;
//					}
//				}
//				for(OfficeBankMappingDetails bank:bankDetails) {
//					if(bank.getBankid() != null) {
//						selectedBank.add(bank);
//					}
//				}
//				
//				System.out.println(""+selectedBank);
//				
//				
//				
//				
//			drvoucherdetails.setVoucherseq(seq);
//				drvoucherdetails.setVoucherid(voucher.getVoucherid());
//				drvoucherdetails.setDebitledger(sledger.get().getLedgerId());
//				drvoucherdetails.setNarration("Debit AUC PlatForm");
//				drvoucherdetails.setDebitamount(invtotal);
//			crvoucherdetails.setVoucherseq(seq);
//			crvoucherdetails.setVoucherid(voucher.getVoucherid());	
//			crvoucherdetails.setCreditamount(invtotal);
//			crvoucherdetails.setNarration("Credit AUC PlatForm");	
//			crvoucherdetails.setCreditledger(selectedBank.get(0).getBankid());
//				voucherDetailList.add(crvoucherdetails);
//				voucherDetailList.add(drvoucherdetails);
//				
//				
//				if(taxbyinv.isPresent()) {
//					int inc=1;
//					for(AUCInvoiceTaxes tax:taxbyinv.get()) {
//							
//							VoucherDetails drtaxvoucherdetails =new VoucherDetails();
//							VoucherDetails crtaxvoucherdetails =new VoucherDetails();
//							
//							drtaxvoucherdetails.setVoucherseq(seq+inc);
//							drtaxvoucherdetails.setVoucherid(voucher.getVoucherid());
//							System.out.println(sledger.get().getLedgerId());
//							drtaxvoucherdetails.setDebitledger(sledger.get().getLedgerId());
//							drtaxvoucherdetails.setNarration("Debit AUC TAX PlatForm ");
//							drtaxvoucherdetails.setDebitamount(Double.valueOf(tax.getValue()));
//							
//							crtaxvoucherdetails.setVoucherseq(seq+inc);
//							crtaxvoucherdetails.setVoucherid(voucher.getVoucherid());	
//							crtaxvoucherdetails.setCreditamount(Double.valueOf(tax.getValue()));
//							crtaxvoucherdetails.setNarration("Credit AUCTAX PlatForm");	
//							
//							if(tax.getTaxId()==6) {
//								crtaxvoucherdetails.setCreditledger(selectedoffice.getSgstledgerofofficeid());	
//							}else if(tax.getTaxId()==5) {
//								crtaxvoucherdetails.setCreditledger(selectedoffice.getCgstledgerofofficeid());	
//							}
//							else if(tax.getTaxId()==7) {
//								
//								crtaxvoucherdetails.setCreditledger(selectedoffice.getIgstledgerofofficeid());	
//							}else if(tax.getTaxId()==2) {
//								//servicecharges
//								crtaxvoucherdetails.setCreditledger(servicecharge.get(0).getSledgerid());	
//							}
//							else if(tax.getTaxId()==0) {
//								//pattacharges
//								crtaxvoucherdetails.setCreditledger(pattacharge.get(0).getPledgerid());	
//							}
//							voucherDetailList.add(drtaxvoucherdetails);
//							voucherDetailList.add(crtaxvoucherdetails);
//							inc=inc+1;
//					}
//				}
//				
//		}
//		voucherDetailsRepo.saveAll(voucherDetailList);
		return voucher;
	}
	
	public Voucher addSalesVoucher(Voucher voucher,InvoiceDetails invoicelist,Payment payment,float amountpaid){
		VoucherDetails vdcredit=new VoucherDetails();
		VoucherDetails vddebit=new VoucherDetails();
		VoucherDetails vdcreditcgst=new VoucherDetails();
		VoucherDetails vddebitcgst=new VoucherDetails();

		VoucherDetails vdcreditsgst=new VoucherDetails();
		VoucherDetails vddebitsgst=new VoucherDetails();
		
		VoucherDetails vdcreditigst=new VoucherDetails();
		VoucherDetails vddebitigst=new VoucherDetails();
		
		int companyid = invoicelist.getCompanyid();
		System.out.println("Get Company Id"+invoicelist.getCompanyid());
		Integer countCompanyType = 0;
		String CompanyType = "";
		Ledgermapping ledgermap= ledgermappingrepo.getByOfficeid(companyid);
		if(ledgermap!=null) {
		List<Company> companyData = companyRepository.findByCompanyId(companyid);			
			for (Company company : companyData) {
			     countCompanyType = voucherRepo.getCountOfCompanyType(company.getCompanytypeid(), voucher.getVouchertypeid(),companyid);
			     List<CompanyType> companyTypeList = companyTypeRepository.findByCompanyType(company.getCompanytypeid());
			     for (CompanyType companyTypeData : companyTypeList) {
				 CompanyType = companyTypeData.getCompanytypename();					 
			     }
			}
			int yearnow = Calendar.getInstance().get(Calendar.YEAR);
			int yearnext = Calendar.getInstance().get(Calendar.YEAR)+1;
			Integer countincrement = countCompanyType+1;
			voucher.setVouchernumber(yearnow+"-"+yearnext+"-"+CompanyType+"-"+(countincrement));
		 voucher.setVoucherdate(payment.getPaymentDate());
		 voucher.setNarration("Payment Done for Invoice NO:"+invoicelist.getInvoicenumber());
		 voucher.setVouchertypeid(5);
		 voucher.setCompanyid(invoicelist.getCompanyid());
		voucher=voucherRepo.save(voucher);
		
		// for Ledger
		vdcredit.setVoucherid(voucher.getVoucherid()); 
		vdcredit.setCreditledger(invoicelist.getBuyerid());
		vdcredit.setCreditamount((double)amountpaid);
		voucherDetailsRepo.save(vdcredit);
		vddebit.setVoucherid(voucher.getVoucherid()); 
		vddebit.setDebitledger(ledgermap.getCashid());
		vddebit.setDebitamount((double)amountpaid);
		voucherDetailsRepo.save(vddebit);

		//Cgst Ledger
		vdcreditcgst.setVoucherid(voucher.getVoucherid()); 
		vdcreditcgst.setCreditledger(invoicelist.getBuyerid());
		vdcreditcgst.setCreditamount((double)invoicelist.getCgstvalue());
		voucherDetailsRepo.save(vdcreditcgst);

		vddebitcgst.setVoucherid(voucher.getVoucherid()); 
		vddebitcgst.setDebitledger(ledgermap.getSgstid());
		vddebitcgst.setDebitamount((double)invoicelist.getCgstvalue());
		voucherDetailsRepo.save(vddebitcgst);
		
		
		// for sgst 
		vdcreditsgst.setVoucherid(voucher.getVoucherid()); 
		vdcreditsgst.setCreditledger(invoicelist.getBuyerid());
		vdcreditsgst.setCreditamount((double)invoicelist.getSgstvalue());
		voucherDetailsRepo.save(vdcreditsgst);

		vddebitsgst.setVoucherid(voucher.getVoucherid()); 
		vddebitsgst.setDebitledger(ledgermap.getSgstid());
		vddebitsgst.setDebitamount((double)invoicelist.getSgstvalue());
		voucherDetailsRepo.save(vddebitsgst);
		
		
		// for igst 
		vdcreditigst.setVoucherid(voucher.getVoucherid()); 
		vdcreditigst.setCreditledger(invoicelist.getBuyerid());
		vdcreditigst.setCreditamount((double)invoicelist.getIgstvalue());
		voucherDetailsRepo.save(vdcreditsgst);

		vddebitigst.setVoucherid(voucher.getVoucherid()); 
		vddebitigst.setDebitledger(ledgermap.getIgstid());
		vddebitigst.setDebitamount((double)invoicelist.getIgstvalue());
		voucherDetailsRepo.save(vddebitsgst); 
		
		}
		return voucher;
		
	}
}
