package com.fna.service;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.fna.model.BalanceSheetDetails;
import com.fna.model.BranchInfavourDetails;
import com.fna.model.BranchVoucher;
import com.fna.model.Cashbook;
import com.fna.model.Company;
import com.fna.model.CompanyLedgerDetails;
import com.fna.model.CompanyType;
import com.fna.model.CreditHsn;
import com.fna.model.CreditLedgerDetails;
import com.fna.model.DayBookCreditLedger;
import com.fna.model.DayBookDebitLedger;
import com.fna.model.DayBookDetails;
import com.fna.model.DaybookBind;
import com.fna.model.Daybookopeningclosing;
import com.fna.model.DebitHsn;
import com.fna.model.DebitLedgerDetails;
import com.fna.model.EmployeeBank;
import com.fna.model.FinancialYearDetails;
import com.fna.model.Group;
import com.fna.model.GstView;
import com.fna.model.HsnSacDetails;
import com.fna.model.InvoiceMasterView;
import com.fna.model.ItView;
import com.fna.model.Ledgermapping;
import com.fna.model.Ledgeropeningtemp;
import com.fna.model.Normalledger;
import com.fna.model.OfficeAccount;
import com.fna.model.PaymentBankCover;
import com.fna.model.PaymentDetailsVoucher;
import com.fna.model.Pensioner;
import com.fna.model.PensionerFamily;
import com.fna.model.ProfitLossDetails;
import com.fna.model.SaleNotePaymentFailure;
import com.fna.model.SalenoteReconcile;
import com.fna.model.StateGst;
import com.fna.model.SubLedger;
import com.fna.model.Subgroup;
import com.fna.model.TrailBalanceDetailedGroupWiseDetails;
import com.fna.model.TrailBalanceDetailedWiseDetails;
import com.fna.model.TrailBalanceGroupWiseDetails;
import com.fna.model.TrailBalanceLedgerDetails;
import com.fna.model.Voucher;
import com.fna.model.VoucherDetails;
import com.fna.model.VoucherDetailsPaymentMode;
import com.fna.model.VoucherGst;
import com.fna.model.VoucherPayment;
import com.fna.model.VoucherPaymentHeader;
import com.fna.model.VoucherPettyCash;
import com.fna.model.VoucherPettyCashView;
import com.fna.model.VoucherReportView;
import com.fna.model.VoucherType;
import com.fna.model.YearlyBudgetDetailsView;
import com.fna.model.gstBuyerVendorDdl;
import com.fna.model.itBuyerVendorDdl;
import com.fna.repository.BalanceSheetRepository;
import com.fna.repository.BranchInfavourDetailsRepo;
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
import com.fna.repository.Daybookopeningclosingrepo;
import com.fna.repository.DebitHsnRepo;
import com.fna.repository.DebitLedgerDetailsRepo;
import com.fna.repository.EmployeeBankRepo;
import com.fna.repository.FinancialPeriodeRepository;
import com.fna.repository.GstViewRepo;
import com.fna.repository.HsnSacRepo;
import com.fna.repository.InvoiceMasterViewRepo;
import com.fna.repository.ItViewRepo;
import com.fna.repository.OfficeAccountRepo;
import com.fna.repository.Ledgeropeningtemprepo;
import com.fna.repository.NormalledgerRepository;
import com.fna.repository.OfficeLedgerMappingRepo;
import com.fna.repository.PaymentBankCoverRepo;
import com.fna.repository.PaymentDetailsVoucherRepo;
import com.fna.repository.PensionerFamilyRepo;
import com.fna.repository.PensionerRepo;
import com.fna.repository.ProfitLossRepository;
import com.fna.repository.SaleNotePaymentFailureRepo;
import com.fna.repository.SalenoteReconcileRepo;
import com.fna.repository.StateGstRepo;
import com.fna.repository.SubLedgerRepository;
import com.fna.repository.TrailBalanceDetailedGroupWiseRepository;
import com.fna.repository.TrailBalanceDetailedWiseRepository;
import com.fna.repository.TrailBalanceGroupWiseRepository;
import com.fna.repository.TrailBalanceLedgerDetailsRepository;
import com.fna.repository.UserOffice;
import com.fna.repository.VoucherDetailsPaymentModeRepo;
import com.fna.repository.VoucherDetailsRepository;
import com.fna.repository.VoucherGstRepo;
import com.fna.repository.VoucherPaymentHeaderRepo;
import com.fna.repository.VoucherPaymentRepo;
import com.fna.repository.VoucherPettyCashRepo;
import com.fna.repository.VoucherPettyCashViewRepo;
import com.fna.repository.VoucherReportViewRepo;
import com.fna.repository.VoucherRepository;
import com.fna.repository.VoucherTypeRepository;
import com.fna.repository.YearlyBudgetDetailsViewRepository;
import com.fna.repository.gstBuyerVendorDdlRepo;
import com.fna.repository.itBuyerVendorDdlRepo;

@Service
public class VoucherService {
	
	@Autowired
	private NormalledgerRepository normalledgerRepository;
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
	@Autowired	
	private Ledgeropeningtemprepo ledgeropeningtempRepo;
	@Autowired
	private FinancialPeriodeRepository financialPeriodRepo;
	@Autowired
	private StateGstRepo stateGstRepo;
	@Autowired
	private GstViewRepo gstViewRepo;
	@Autowired
	private ItViewRepo itViewRepo; 
	@Autowired
	private SubLedgerRepository subLedgerRepository; 
	@Autowired
	private Ledgeropeningtemprepo openingbalRepo;
	@Autowired
	private PaymentBankCoverRepo paymentBankCoverRepo; 
	@Autowired
	private VoucherDetailsPaymentModeRepo vdPdRepo; 
	
	@Autowired
	private VoucherPaymentRepo vPayRepo; 
	@Autowired
	private VoucherPaymentHeaderRepo vPayHeaderRepo; 
	@Autowired
	private EmployeeBankRepo empbankrepo; 
	@Autowired
	private SalenoteReconcileRepo reconcileRepo;
	@Autowired
	private SaleNotePaymentFailureRepo reconcilefailureRepo;
	
	@Autowired
	private PensionerRepo pensionerrepo; 
	@Autowired
	private PensionerFamilyRepo pensionerfamilyrepo;   
	@Autowired
	private BranchInfavourDetailsRepo branchInfavourDetailsRepo;
	@Autowired
	private UserOffice uorepo;
	@Autowired
	private Daybookopeningclosingrepo dayrepo;
	@Autowired
	private VoucherPettyCashRepo vpettyrepo; 
	@Autowired
	private VoucherPettyCashViewRepo vpettyviewrepo;  
	
	public ResponseEntity<Voucher> saveVoucher(Voucher voucher) {		
		try {
			int companyid = voucher.getCompanyid();
			Integer countCompanyType = 0;
			String CompanyCode = "";
			FinancialYearDetails financialPeriod = financialPeriodRepo.getInvoicePeriod();
			List<Company> companyData = companyRepository.findByCompanyId(companyid);			
				for (Company company : companyData) {
					//combination of companytype and vouchertype
					//added companyid new patch
				     countCompanyType = voucherRepo.getCountOfCompanyType(company.getCompanytypeid(),voucher.getVouchertypeid(),companyid);
				     CompanyCode=  company.getVcode();
				}
				VoucherType vt = voucherTypeRepository.findByvouchertypeid(voucher.getVouchertypeid());
//				int yearnow = Calendar.getInstance().get(Calendar.YEAR);
//				int yearnext = (Calendar.getInstance().get(Calendar.YEAR)+1) % 100;
				
				//currentfinancialyear
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
                if(voucher.getStatusid()!=null)
                {
                	voucher.setStatusid(4);
                }
                else
                {
                	voucher.setStatusid(1);
                }
			 
			voucherRepo.save(voucher);
			return new ResponseEntity<>(voucher, HttpStatus.CREATED);
		} catch (Exception e) { 
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	
	public ResponseEntity<List<Voucher>> getVouchers() {
	   try  
	   {
		List<Voucher> voucher = new ArrayList<Voucher>();        
		voucherRepo.findAll().forEach(voucher::add);
        if(voucher.isEmpty())
        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
        }
        return new ResponseEntity<>(voucher,HttpStatus.OK);
	   }
	   catch (Exception e) {
		   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }
	

	public ResponseEntity<List<Voucher>> getVouchersTable(int vouchertypeid,int uid) {
	   try   
	   {
		List<Voucher> voucher = new ArrayList<Voucher>();        
		voucherRepo.VouchertableByUid(vouchertypeid,uid).forEach(voucher::add);
        if(voucher.isEmpty())
        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
        }
        return new ResponseEntity<>(voucher,HttpStatus.OK);
	   }
	   catch (Exception e) {
		   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }
	public ResponseEntity<List<Voucher>> getSelectedVoucherInfo(int voucherid) {
		   try   
		   { 
			List<Voucher> voucher = new ArrayList<Voucher>();        
			voucherRepo.SelectedVouchertableNative(voucherid).forEach(voucher::add);
	        if(voucher.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(voucher,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	
	public ResponseEntity<VoucherDetails> saveVoucherDetails(int voucherid,int cid,VoucherDetails voucherdetailsArr[]) {		
		try {
			Voucher vc = voucherRepo.findByVoucherid(voucherid);
			Integer nextseq = 0;
			Integer frontseq = 0;
			Integer prevfrontseq = 0;

			for (VoucherDetails voucherDetails : voucherdetailsArr) {
				Integer maxVseq = voucherDetailsRepo.findMaxVSeqByCompany(cid, vc.getAccounttypeid());

				System.out.println(voucherDetails.getVoucherseq()+"-"+voucherDetails.getLedgeralias());
				frontseq = voucherDetails.getVoucherseq();

				if(maxVseq == null)
                	{
                		voucherDetails.setVoucherseq(1);
                		nextseq = 1;
                	}
				else
				{
					if(prevfrontseq == voucherDetails.getVoucherseq() && nextseq!=0)
					{
						
							voucherDetails.setVoucherseq(nextseq);						

					}
					else
					{
					Integer maxVseqIn = voucherDetailsRepo.findMaxVSeqByCompany(cid,vc.getAccounttypeid());
					nextseq = maxVseqIn+1;
					voucherDetails.setVoucherseq(nextseq);
					
					}
				}
				
				voucherDetails.setVoucherid(voucherid);
				var sid = voucherDetails.getSubledgername();
				if ( sid == null || sid =="") 
				{ 
					voucherDetails.setSubledgername(null);
				}
				voucherDetailsRepo.save(voucherDetails); 
				prevfrontseq = frontseq;
			} 
			return new ResponseEntity<>(voucherdetailsArr[0], HttpStatus.CREATED);

			
		} catch (Exception e) { 
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<VoucherDetails> updateVoucherDetails(int voucherdetailid,VoucherDetails voucherdetails) {		
		Optional<VoucherDetails> existingVd = voucherDetailsRepo.findById(voucherdetailid);
		if (existingVd.isPresent()) { 
			VoucherDetails _vd = existingVd.get();
			int crdr = (voucherdetails.getCreditamount()==null)?voucherdetails.getDebitledger() : voucherdetails.getCreditledger() ;
			Normalledger nl = new Normalledger();
			nl = normalledgerRepository.findByledgerid(crdr);
			SubLedger sb = new SubLedger();
			Boolean c = (voucherdetails.getSubledgerid()!=null && voucherdetails.getSubledgerid()!=0)?true:false;
			sb = (voucherdetails.getSubledgerid()!=null && voucherdetails.getSubledgerid()!=0)? subLedgerRepository.findBysubledgerid(voucherdetails.getSubledgerid()): null;
			_vd.setCreditamount(voucherdetails.getCreditamount());
			_vd.setCreditledger(voucherdetails.getCreditledger());
			_vd.setDebitamount(voucherdetails.getDebitamount());	
			_vd.setDebitledger(voucherdetails.getDebitledger());
			_vd.setNarration(voucherdetails.getNarration());
			_vd.setHsnsacid(voucherdetails.getHsnsacid()); 
			_vd.setRate(voucherdetails.getRate());
			_vd.setLedgeralias(nl.getLedgeralias()); 
			_vd.setSubledgerid(voucherdetails.getSubledgerid()); 
			_vd.setSubledgername((sb!=null)?sb.getSubledgername():null); 
			voucherDetailsRepo.save(_vd);
			voucherRepo.updateVouchertotal(_vd.getVoucherid()); 
			return new ResponseEntity<>(_vd, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	public ResponseEntity<List<VoucherDetails>> getVoucherDetails(int voucherid) {
		   try    
		   {
			List<VoucherDetails> voucherdetails = new ArrayList<VoucherDetails>();        
			voucherDetailsRepo.findVoucherDetailsTable(voucherid).forEach(voucherdetails::add);
	        if(voucherdetails.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(voucherdetails,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	
	
	public ResponseEntity<List<VoucherDetails>> getDayBookView(int vouchertypeid,int companyid,String vouchernumber,Date fromdatedate,Date todatedate) {
		   try    
		   {
			   Format formatter = new SimpleDateFormat("yyyy-MM-dd");		  
			   String fromdate = formatter.format(fromdatedate);
			   String todate = formatter.format(todatedate);
			List<VoucherDetails> daybook = new ArrayList<VoucherDetails>();        
			voucherDetailsRepo.DayBookView(vouchertypeid,companyid,vouchernumber,fromdate,todate).forEach(daybook::add);
	        if(daybook.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(daybook,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	
	public ResponseEntity<Voucher> updateVoucherAmount(int voucherid,Voucher voucher) {
		Optional<Voucher> existingVoucher = voucherRepo.findById(voucherid);
		if (existingVoucher.isPresent()) {
			Voucher _voucher = existingVoucher.get();
			_voucher.setTotalcreditamount(voucher.getTotalcreditamount());
			_voucher.setTotaldebitamount(voucher.getTotaldebitamount());			
			return new ResponseEntity<>(voucherRepo.save(_voucher), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	
    }
	
	
	
	public DayBookDebitLedger findDebitSum(int companyid,int ledgerid,String date)
	{
		DayBookDebitLedger debitSum = daybookdebitrepo.finddebitsum(companyid,ledgerid,date,"finddebitsum");
		
		return debitSum;
		
		
	}
	public DayBookCreditLedger findPreviousCreditSum(int companyid,int ledgerid,String daybookdate)
	{
		DayBookCreditLedger creditSum = daybookcreditrepo.findpreviouscreditsum(companyid,ledgerid,daybookdate,"findpreviouscreditsum");
		
		return creditSum;	
		
	}
	
	public DayBookDebitLedger findPreviousDebitSum(int companyid,int ledgerid, String daybookdate)
	{
		DayBookDebitLedger debitSum = daybookdebitrepo.findpreviousdebitsum(companyid,ledgerid,daybookdate,"findpreviousdebitsum");
		
		return debitSum;		
		
	}
	public DayBookCreditLedger findCreditSum(int companyid,int ledgerid,String date)
	{
	    DayBookCreditLedger creditSum = daybookcreditrepo.findcreditsum(companyid,ledgerid,date,"findcreditsum");
		
		return creditSum; 
		
		
	}
	
	public List<CompanyLedgerDetails> findLedgerID(int companyid)
	{
		List<CompanyLedgerDetails> ledgerIDs = null;
		if(companyid == 1)
		{
		 ledgerIDs = companyledgerdetailsrepo.findLedgerID(companyid,"findledgeridsforopeningbalance");
		}
		else 
		{
			ledgerIDs = companyledgerdetailsrepo.findLedgerID(companyid,"findledgeridsforopeningbalancenonho");
		}
		return ledgerIDs; 
		
		
	}
	public DayBookDetails findClosingBalance(int companyid,int ledgerid)
	{
		DayBookDetails closingBalance = new DayBookDetails();
		 closingBalance = daybookdetailsrepo.findClosingBalance(companyid,ledgerid,"findpreviousdayclosingbalance");
		
		return closingBalance;  
		
		
	}
	public DayBookDetails findOpeningBalance(int companyid,int ledgerid, String date)
	{
		DayBookDetails openingBalance = new DayBookDetails();
		openingBalance = daybookdetailsrepo.findOpeningBalance(companyid,ledgerid,date,"findcurrentdayopeningbalance");
		
		return openingBalance;  
		
		
	}
	public DayBookDetails findPreviousDayOpeningBalance(int companyid,String daybookdate,int ledgerid)
	{
		DayBookDetails openingBalance = new DayBookDetails();
		openingBalance = daybookdetailsrepo.findPreviousOpeningBalance(companyid,daybookdate,ledgerid,"findpreviousdayopeningbalance");
		
		return openingBalance;  
		
		
	}

	public int dayBookCloseByCompany(int companyid, Date date) {
		
		Format formatter = new SimpleDateFormat("yyyy-MM-dd");
	    String daybookdate = formatter.format(date);	
		Double closingBalance = 0.0;
		int updateDayBookClosing = 0; 
		List<CompanyLedgerDetails> ledgerIDs = findLedgerID(companyid);
		for (CompanyLedgerDetails companyLedgerDetails : ledgerIDs) {
			DayBookDebitLedger dSum = findDebitSum(companyid,companyLedgerDetails.getLedgerid(),daybookdate);
		    DayBookCreditLedger cSum = findCreditSum(companyid,companyLedgerDetails.getLedgerid(),daybookdate);
		    DayBookDetails compledger = new DayBookDetails();
			compledger = findOpeningBalance(companyid, companyLedgerDetails.getLedgerid(),daybookdate);
			Double openingBalance = compledger.getOpeningbalance();
			Double sumDebit = (dSum==null)?0.0: dSum.getSumdebit(); 
			Double sumCredit = (cSum==null)?0.0:cSum.getSumcredit();
			closingBalance =openingBalance +( sumDebit - sumCredit) ;
			updateDayBookClosing = daybookdetailsrepo.updateClosingBalance(companyid,companyLedgerDetails.getLedgerid(), closingBalance,daybookdate, "updateclosingbalance");
		}
		
		
		return updateDayBookClosing;
	} 
	

	public void dayBookPreviousCloseByCompany(int companyid,Date daybookdatetime) {
		
		Format formatter = new SimpleDateFormat("yyyy-MM-dd");
	    String daybookdate = formatter.format(daybookdatetime);		

		Double closingBalance = 0.0;
		@SuppressWarnings("unused")
		int updateDayBookClosing = 0; 
		List<CompanyLedgerDetails> ledgerIDs = findLedgerID(companyid);
		for (CompanyLedgerDetails companyLedgerDetails : ledgerIDs) {
			DayBookDebitLedger dSum = findPreviousDebitSum(companyid,companyLedgerDetails.getLedgerid(),daybookdate);
		    DayBookCreditLedger cSum = findPreviousCreditSum(companyid,companyLedgerDetails.getLedgerid(),daybookdate);
		    DayBookDetails compledger = new DayBookDetails();
			compledger = findPreviousDayOpeningBalance(companyid,daybookdate,companyLedgerDetails.getLedgerid());
			Double openingBalance = compledger.getOpeningbalance();
			Double sumDebit = (dSum==null)?0.0: dSum.getSumdebit(); 
			Double sumCredit = (cSum==null)?0.0:cSum.getSumcredit();
			closingBalance =openingBalance +( sumDebit - sumCredit) ;
			updateDayBookClosing = daybookdetailsrepo.updatePreviousClosingBalance(companyid,daybookdate,companyLedgerDetails.getLedgerid(), closingBalance, "updatepreviousclosingbalance");
		}
		
		
	} 
	public ResponseEntity<DayBookDetails> dayBookOpenByCompany(DayBookDetails daybookdetails) {
		//TO do : Fetch from cashbankoffice
		try {
		List<CompanyLedgerDetails> ledgerIDs = findLedgerID(daybookdetails.getCompanyid());
		for (CompanyLedgerDetails companyLedgerDetails : ledgerIDs) {
			DayBookDetails dbd = new DayBookDetails();	
			dbd.setDaybookdate(daybookdetails.getDaybookdate()); 

			dbd.setLedgerid(companyLedgerDetails.getLedgerid()); 
			dbd.setCompanyid(daybookdetails.getCompanyid());
			DayBookDetails compledger = new DayBookDetails();
			compledger = findClosingBalance(dbd.getCompanyid(), dbd.getLedgerid());
			if(compledger.getClosingbalance()!=null)
			{				
			dbd.setOpeningbalance(compledger.getClosingbalance());
			daybookdetailsrepo.save(dbd); 
			} 
			else if(compledger.getClosingbalance()==null)
			{
				dayBookPreviousCloseByCompany(companyLedgerDetails.getCompanyid(),compledger.getDaybookdate());
				
				return new ResponseEntity<>(daybookdetails, HttpStatus.CREATED);
			}
		 
		}
		return new ResponseEntity<>(daybookdetails, HttpStatus.CREATED);
		}
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}		
		
	}

	
	public ResponseEntity<List<DaybookBind>> dayBookBind(Date fromdatedate,int userid) {
		   try  
		   {
			   Format formatter = new SimpleDateFormat("yyyy-MM-dd");		  
			   String fromdaybookdate = formatter.format(fromdatedate);
			List<DaybookBind> db = new ArrayList<DaybookBind>();   
			List<Company> company = new ArrayList<Company>();
			companyRepository.findAll().forEach(company::add);
			//for (Company companydetail : company) {
			DaybookBind dbo = new DaybookBind();
			Integer oid = uorepo.Selectedoffice(userid);
		    dbo = daybookbindrepo.dayBookBind(oid,fromdaybookdate,userid);
			db.add(dbo);
			//}
			
			
	        if(db.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(db,HttpStatus.OK);
		   } 
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	public ResponseEntity<List<Cashbook>> getCashbook(Date fromdatedate , Date todatedate, int aid) {
		   try   
		   { 
			  
		   Format formatter = new SimpleDateFormat("yyyy-MM-dd");		  
		   String fromdaybookdate = formatter.format(fromdatedate);
		   String todaybookdate = formatter.format(todatedate);
			List<Cashbook> cashbook = new ArrayList<Cashbook>(); 
			System.out.print(aid); 
			cashbookrepo.findCashBook(fromdaybookdate,todaybookdate,aid).forEach(cashbook::add);
	        if(cashbook.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(cashbook,HttpStatus.OK);
		   } 
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }

	public ResponseEntity<List<TrailBalanceLedgerDetails>> getTrailBalanceLegderWise(Date fromdatedate,Date todatedate) {
		   try   
		   {
			   Format formatter = new SimpleDateFormat("yyyy-MM-dd");		  
			   String fromdate = formatter.format(fromdatedate);
			   String todate = formatter.format(todatedate);
			List<TrailBalanceLedgerDetails> trailledger = new ArrayList<TrailBalanceLedgerDetails>();        
			trailbalanceledgerrepo.trailBalanceLedger("ledgerwise",fromdate,todate).forEach(trailledger::add);
	        if(trailledger.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(trailledger,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }

	public ResponseEntity<List<TrailBalanceDetailedWiseDetails>> getTrailBalanceDetailed(Date fromdatedate,Date todatedate) {
		   try   
		   {
			   Format formatter = new SimpleDateFormat("yyyy-MM-dd");		  
		   String fromdate = formatter.format(fromdatedate);
		   String todate = formatter.format(todatedate);
			List<TrailBalanceDetailedWiseDetails> traildetailed = new ArrayList<TrailBalanceDetailedWiseDetails>();        
			trailbalancedetailedrepo.trailBalanceDetailed("detailed",fromdate,todate).forEach(traildetailed::add);
	        if(traildetailed.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(traildetailed,HttpStatus.OK);
		   } 
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }

	public ResponseEntity<List<TrailBalanceGroupWiseDetails>> getTrailBalanceGroup(Date fromdatedate,Date todatedate) {
		   try   
		   { 
			   Format formatter = new SimpleDateFormat("yyyy-MM-dd");		  
		   String fromdate = formatter.format(fromdatedate);
		   String todate = formatter.format(todatedate);
			List<TrailBalanceGroupWiseDetails> trailgroup = new ArrayList<TrailBalanceGroupWiseDetails>();        
			trailbalancegrouprepo.trailBalanceGroupWise("groupwise",fromdate,todate).forEach(trailgroup::add);
	        if(trailgroup.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(trailgroup,HttpStatus.OK);
		   } 
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    } 
	public ResponseEntity<List<TrailBalanceDetailedGroupWiseDetails>> getTrailBalanceDetailedGroup(Date fromdatedate,Date todatedate) {
		   try   
		   { 
			   Format formatter = new SimpleDateFormat("yyyy-MM-dd");		  
		   String fromdate = formatter.format(fromdatedate);
		   String todate = formatter.format(todatedate);
			List<TrailBalanceDetailedGroupWiseDetails> trailgroup = new ArrayList<TrailBalanceDetailedGroupWiseDetails>();        
			trailbalancedetailedgrouprepo.trailBalanceDetailedGroupWise("groupwisedetails",fromdate,todate).forEach(trailgroup::add);
	        if(trailgroup.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(trailgroup,HttpStatus.OK);
		   } 
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    } 
	public ResponseEntity<List<ProfitLossDetails>> getProfitLoss(Date fromdatedate,Date todatedate) {
		   try   
		   {
			   Format formatter = new SimpleDateFormat("yyyy-MM-dd");		  
			   String fromdate = formatter.format(fromdatedate);
			   String todate = formatter.format(todatedate);
			List<ProfitLossDetails> pl = new ArrayList<ProfitLossDetails>();        
			plrepo.profitLossBind("profitlossbind",fromdate,todate).forEach(pl::add);
	        if(pl.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(pl,HttpStatus.OK);
		   } 
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    } 
	public Double getCashOrBankBalance(int ledgerid) {
		   try   
		   {
			Double balance = calcIncExpBankCashBalance(ledgerid,"cashbank");
			return balance;
		   } 
		   catch (Exception e) {
			   return null;
		}
	    }  
	public Double getExpOrIncBalance(int ledgerid) {
		   try   
		   {
			Double balance = calcIncExpBankCashBalance(ledgerid,"expincome");
			return balance;
		   } 
		   catch (Exception e) {
			   return null;
		}
	    }  
	
	
	public Double calcIncExpBankCashBalance(int ledgerid,String action)
	{
		Double balance = voucherRepo.getCashBankBalance( action,ledgerid);		
		return balance;	
		
	}
	public ResponseEntity<List<BalanceSheetDetails>> getBalanceSheet(Date fromdatedate,Date todatedate) {
		   try   
		   {
			   Format formatter = new SimpleDateFormat("yyyy-MM-dd");		  
			   String fromdate = formatter.format(fromdatedate);
			   String todate = formatter.format(todatedate);
			List<BalanceSheetDetails> pl = new ArrayList<BalanceSheetDetails>();        
			bsrepo.balanceSheetBind("balancesheetbind",fromdate,todate).forEach(pl::add);
	        if(pl.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(pl,HttpStatus.OK);
		   } 
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	
	public int  updateStatus(int vid,int statusid , int approvedby , int checkedby,String remarks,String vdate ) {
		   try   
		   {
			   List<VoucherDetails> vd = voucherDetailsRepo.findVoucherDetailsTable(vid);
			   int validationCount = 0;
			   for(VoucherDetails vdetails : vd)
			   {
					int _ledgerid = (vdetails.getCreditledger()==null)?vdetails.getDebitledger():vdetails.getCreditledger();
					Double _ledgeramount = (vdetails.getCreditledger()==null)?vdetails.getDebitamount():vdetails.getCreditamount();
					Double _expbalance = 0.0;
					YearlyBudgetDetailsView yview = new YearlyBudgetDetailsView();
					yview = ybd.CheckFinancialYearlyBudgetDetailsView("checkifexistscurrentfinancialyearlybudgetdetailsview",_ledgerid);

					if(yview != null)
					{
						_expbalance= ybd.ledgerBalanceBudget("checkledgerbalancebudgetamount",_ledgerid);

						if(_ledgeramount <= _expbalance) {
							validationCount++;
						}
						else
						{

							//validationCount = -1;
							validationCount = 1;
							break;
						}				
					}		
			   }
			   System.out.println("validationcount is"+validationCount);
			   if(validationCount != -1)
			   {		   
				   for(VoucherDetails vdetails : vd) 
				   {
						int _ledgerid = (vdetails.getCreditledger()==null)?vdetails.getDebitledger():vdetails.getCreditledger();
						Double _ledgeramount = (vdetails.getCreditledger()==null)?vdetails.getDebitamount():vdetails.getCreditamount();
						YearlyBudgetDetailsView yview = new YearlyBudgetDetailsView();
						yview = ybd.CheckFinancialYearlyBudgetDetailsView("checkifexistscurrentfinancialyearlybudgetdetailsview",_ledgerid);
						if(yview!=null)
						{
						int updateBudget = ybd.updateUsedBalance("updateusedandbalancebudgetamount", yview.getYearlybudgetdetailsid(), _ledgeramount);
						}
				   }	
				   int upd  = voucherRepo.updateVoucherStatus(vid, statusid, approvedby, checkedby,remarks,vdate);
    			   System.out.println("upd is"+upd);

                   return upd;                   
		       }
			   else
			   {
					return 0;

			   }
		   }
		   catch (Exception e) {
			   	return 0;
		   } 
	    } 
	
	public ResponseEntity<Ledgermapping> getLedgerByOffice(int cid) {
		   try  
		   {
			        
			 Ledgermapping ledgers = ledgermappingrepo.getByOfficeid(cid);
	        if(ledgers==null)
	        {  return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(ledgers,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	public ResponseEntity<List<DebitLedgerDetails>> getDrLedgers() {
		   try  
		   {
			List<DebitLedgerDetails> voucher = new ArrayList<DebitLedgerDetails>();        
			drrepo.getDrLedgers().forEach(voucher::add);
	        if(voucher.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(voucher,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	
	public ResponseEntity<List<CreditLedgerDetails>> getCrLedgers() {
		   try  
		   {
			List<CreditLedgerDetails> voucher = new ArrayList<CreditLedgerDetails>();        
			crrepo.getCrLedgers().forEach(voucher::add);
	        if(voucher.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(voucher,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	public ResponseEntity<PaymentDetailsVoucher> savePaymentDetails(PaymentDetailsVoucher pd) {		
		try {
			pd.setPaymentId(0);		
			payrepo.save(pd);
			return new ResponseEntity<>(pd, HttpStatus.CREATED);
		} catch (Exception e) { 
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<List<HsnSacDetails>> getHsnsac() {
		   try  
		   {
			List<HsnSacDetails> hsn = new ArrayList<HsnSacDetails>();        
			hsnrepo.findAll().forEach(hsn::add);
	        if(hsn.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(hsn,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	public ResponseEntity<List<CreditHsn>> getCrHsnsac() {
		   try  
		   {
			List<CreditHsn> hsn = new ArrayList<CreditHsn>();        
			crhsnrepo.getCrHsn().forEach(hsn::add);
	        if(hsn.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(hsn,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	public ResponseEntity<List<DebitHsn>> getDrHsnsac() {
		   try  
		   {
			List<DebitHsn> hsn = new ArrayList<DebitHsn>();        
			drhsnrepo.getDrHsn().forEach(hsn::add);
	        if(hsn.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(hsn,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	

	public ResponseEntity<List<VoucherReportView>> getVoucherReportView(int vouchertypeid,int companyid,String vouchernumber,Date fromdatedate,Date todatedate,int aid) {
		   try    
		   {
			   Format formatter = new SimpleDateFormat("yyyy-MM-dd");		  
			   String fromdate = formatter.format(fromdatedate);
			   String todate = formatter.format(todatedate);
			List<VoucherReportView> vouchers = new ArrayList<VoucherReportView>();        

			vouchers = voucherReportViewRepository.voucherView(vouchertypeid,companyid,vouchernumber,fromdate,todate,aid);
	        if(vouchers.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(vouchers,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	
	
	public ResponseEntity<Voucher> updateJournalVoucher(Voucher voucher) {		
		try {
			int companyid = voucher.getCompanyid();
			Integer countCompanyType = 0;
			String CompanyType = "";
			List<Company> companyData = companyRepository.findByCompanyId(companyid);			
				for (Company company : companyData) {
				     countCompanyType = voucherRepo.getCountOfCompanyType(company.getCompanytypeid(),voucher.getVouchertypeid(),companyid);
				     List<CompanyType> companyTypeList = companyTypeRepository.findByCompanyType(company.getCompanytypeid());
				     for (CompanyType companyTypeData : companyTypeList) {
					 CompanyType = companyTypeData.getCompanytypename();					 
				     }
				}
				int yearnow = Calendar.getInstance().get(Calendar.YEAR);
				int yearnext = Calendar.getInstance().get(Calendar.YEAR)+1;
				Integer countincrement = countCompanyType+1;
				voucher.setVouchernumber(yearnow+"-"+yearnext+"-"+"VOU"+"-"+"Payment/Sales"+"-"+CompanyType+"-"+(countincrement));
			 voucher.setStatusid(1);
			voucherRepo.save(voucher);
			return new ResponseEntity<>(voucher, HttpStatus.CREATED);
		} catch (Exception e) { 
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<List<OfficeAccount>> getOfficeAccount(int uid) {
		   try  
		   { 
			List<OfficeAccount> uoa = new ArrayList<OfficeAccount>();        
			officeAccountRepo.getOfficeAccount(uid).forEach(uoa::add);
	        if(uoa.isEmpty()) 
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(uoa,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    } 
	
	public ResponseEntity<List<OfficeAccount>> getAccount(int oid) {
		   try  
		   { 
			List<OfficeAccount> uoa = new ArrayList<OfficeAccount>();        
			officeAccountRepo.getAccount(oid).forEach(uoa::add);
	        if(uoa.isEmpty()) 
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(uoa,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    } 
	public ResponseEntity<List<OfficeAccount>> getAccountForVoucher(int oid) {
		   try  
		   { 
			List<OfficeAccount> uoa = new ArrayList<OfficeAccount>();        
			officeAccountRepo.getAccountForVoucher(oid).forEach(uoa::add);
	        if(uoa.isEmpty()) 
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(uoa,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    } 
	public ResponseEntity<List<gstBuyerVendorDdl>> getgstBuyerVendorDdl(int companyid) {
		   try  
		   { 
			List<gstBuyerVendorDdl> uoa = new ArrayList<gstBuyerVendorDdl>();        
			gstBuyerVendorDdlrepo.findgstBuyerVendor(companyid).forEach(uoa::add);
	        if(uoa.isEmpty())  
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(uoa,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    } 
	public ResponseEntity<List<itBuyerVendorDdl>> getiTBuyerVendorDdl(int companyid) {
		   try  
		   {  
			List<itBuyerVendorDdl> uoa = new ArrayList<itBuyerVendorDdl>();        
			itBuyerVendorDdlrepo.finditBuyerVendor(companyid).forEach(uoa::add);
	        if(uoa.isEmpty())  
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(uoa,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    } 
	public ResponseEntity<List<InvoiceMasterView>> InvMaster() {
		   try  
		   {  
			List<InvoiceMasterView> uoa = new ArrayList<InvoiceMasterView>();        
			invoiceMasterViewRepo.findAllIM().forEach(uoa::add);
	        if(uoa.isEmpty())  
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(uoa,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    } 
	public ResponseEntity<VoucherGst> saveGst(VoucherGst gst,int vid) {		
		try {
			StateGst sg = new StateGst();
			gst.setVoucherid(vid); 
			int a = (gst.getGstbvgsttin()!=null)?Integer.parseInt(gst.getGstbvgsttin().substring(0,2)):0 ;
			sg = stateGstRepo.StatesByGst(a);
			if(sg!=null)
				{gst.setPlace(sg.getStatename());
				}
			
			gst.setCess(0.0);
			vgstrepo.save(gst); 
			return new ResponseEntity<>(gst, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<List<BranchVoucher>> getBranches() {
		   try   
		   {
			List<BranchVoucher> voucher = new ArrayList<BranchVoucher>();        
			branchVoucherRepo.getBranches().forEach(voucher::add);
	        if(voucher.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(voucher,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	
	public ResponseEntity<List<VoucherDetails>> getLastVoucherDetails(int compid,int aid) {
		   try    
		   {
			List<VoucherDetails> voucherdetails = new ArrayList<VoucherDetails>();        
			voucherDetailsRepo.findLastVoucherDetails(compid,aid).forEach(voucherdetails::add);
	        if(voucherdetails.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(voucherdetails,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	
	public ResponseEntity<Ledgeropeningtemp> saveOpBalance(Ledgeropeningtemp lo) {	  	
		try {
			ledgeropeningtempRepo.save(lo);
			return new ResponseEntity<>(lo, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<List<Ledgeropeningtemp>> getOpBalances() {
		   try 
		   {
			List<Ledgeropeningtemp> role = new ArrayList<Ledgeropeningtemp>();        
			ledgeropeningtempRepo.getAllOp().forEach(role::add);
	        if(role.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(role,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	
	public ResponseEntity<List<VoucherDetailsPaymentMode>> getVoucherDetailsForRecon(int officeid,int voucherid) {
		   try    
		   {
			List<VoucherDetails> voucherbankdetails = new ArrayList<VoucherDetails>();        
			voucherDetailsRepo.findBankVseq(officeid,voucherid).forEach(voucherbankdetails::add);
			
			List<VoucherDetails> vouchercashdetails = new ArrayList<VoucherDetails>();
			voucherDetailsRepo.findCashVseq(officeid,voucherid).forEach(vouchercashdetails::add);
			
			List<VoucherDetailsPaymentMode> vRec = new ArrayList<VoucherDetailsPaymentMode>();
			for (VoucherDetails voucherDetails : voucherbankdetails) {
				List<VoucherDetailsPaymentMode> vouchdetails = new ArrayList<VoucherDetailsPaymentMode>();        
				vouchdetails = vdPdRepo.findVoucherDetailsForReconcilation(voucherDetails.getVoucherseq(),voucherDetails.getVoucherid());
			   vRec.addAll(vouchdetails);
			}
			for (VoucherDetails vouchercDetails : vouchercashdetails) {
				List<VoucherDetailsPaymentMode> vouchcdetails = new ArrayList<VoucherDetailsPaymentMode>();        
				vouchcdetails = vdPdRepo.findVoucherDetailsForReconcilation(vouchercDetails.getVoucherseq(),vouchercDetails.getVoucherid());
			   vRec.addAll(vouchcdetails);
			}
			
			
	        if(vRec.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(vRec,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	
	public ResponseEntity<List<VoucherDetailsPaymentMode>> getVoucherDetailsForReceiptRecon(int officeid,int voucherid) {
		   try    
		   { 
			List<VoucherDetails> voucherbankdetails = new ArrayList<VoucherDetails>();        
			voucherDetailsRepo.RecfindBankVseq(officeid,voucherid).forEach(voucherbankdetails::add);
			
			List<VoucherDetails> vouchercashdetails = new ArrayList<VoucherDetails>();
			voucherDetailsRepo.RecfindCashVseq(officeid,voucherid).forEach(vouchercashdetails::add);
			
			List<VoucherDetailsPaymentMode> vRec = new ArrayList<VoucherDetailsPaymentMode>();
			for (VoucherDetails voucherDetails : voucherbankdetails) {
				List<VoucherDetailsPaymentMode> vouchdetails = new ArrayList<VoucherDetailsPaymentMode>();        
				vouchdetails = vdPdRepo.findVoucherDetailsForReconcilationRec(voucherDetails.getVoucherseq(),voucherDetails.getVoucherid());
			   vRec.addAll(vouchdetails);
			}
			for (VoucherDetails vouchercDetails : vouchercashdetails) {
				List<VoucherDetailsPaymentMode> vouchcdetails = new ArrayList<VoucherDetailsPaymentMode>();        
				vouchcdetails = vdPdRepo.findVoucherDetailsForReconcilationRec(vouchercDetails.getVoucherseq(),vouchercDetails.getVoucherid());
			   vRec.addAll(vouchcdetails);
			}
			
			
	        if(vRec.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(vRec,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	
	public ResponseEntity<List<VoucherGst>> getGstItDetails() {
		   try 
		   {
			List<VoucherGst> gst = new ArrayList<VoucherGst>();        
			vgstrepo.getgstIT().forEach(gst::add);
	        if(gst.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(gst,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	public ResponseEntity<VoucherGst> updateGstit(int vgstdetailsid,VoucherGst group) {
		Optional<VoucherGst> existingGroup = vgstrepo.findById(vgstdetailsid);
		if (existingGroup.isPresent()) {
			VoucherGst _group = existingGroup.get();
			_group.setNaturetransac(group.getNaturetransac());
			_group.setTdsremitted(group.getTdsremitted());
			_group.setChallanno(group.getChallanno());
			_group.setChallandate(group.getChallandate());
			_group.setNameofthebank(group.getNameofthebank());	
			
			_group.setBankbranch(group.getBankbranch());
			_group.setBsrcode(group.getBsrcode());
			_group.setTdsreturnform(group.getTdsreturnform());
//			_group.setYear(group.getYear());
//			_group.setQuarter(group.getQuarter());	
			
			_group.setBranchapf(group.getBranchapf());
			_group.setDuedate(group.getDuedate());
			_group.setDateoffiling(group.getDateoffiling());
			_group.setOgreturnackform(group.getOgreturnackform());
			return new ResponseEntity<>(vgstrepo.save(_group), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	
    }
	
	public ResponseEntity<VoucherDetails> updateRate(Double rate, int vdetId) {
		Optional<VoucherDetails> existingVoucher = voucherDetailsRepo.findById(vdetId);
		if (existingVoucher.isPresent()) {
			VoucherDetails voucherDetails = existingVoucher.get();
			voucherDetails.setRate(rate);  
			return new ResponseEntity<>(voucherDetailsRepo.save(voucherDetails), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
		}
	 
    }
	
	public ResponseEntity<List<GstView>> getSelectedGst(int voucherid) {
		   try   
		   { 
			List<GstView> voucher = new ArrayList<GstView>();        
			gstViewRepo.getGstList(voucherid).forEach(voucher::add);
	        if(voucher.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(voucher,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	public ResponseEntity<List<ItView>> getSelectedIT(int voucherid) {
		   try   
		   { 
			List<ItView> voucher = new ArrayList<ItView>();        
			itViewRepo.getItList(voucherid).forEach(voucher::add);
	        if(voucher.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(voucher,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	
	 public void deletegstById(int id) {
		 vgstrepo.deleteById(id);
	   }
	 public void deleteDayBookById(int id) {
		 daybookdetailsrepo.deleteById(id);
	   }
	 public void deleteSubLedgerById(int id) {
		 openingbalRepo.deleteById(id);
	   } 
	 
	 public ResponseEntity<PaymentBankCover> saveBankCover(PaymentBankCover pb) {		
			try {		
				Optional<PaymentBankCover> existingGroup = paymentBankCoverRepo.findByvoucherdetailid(pb.getVoucherdetailid());
				if (existingGroup.isPresent()) {
					PaymentBankCover pen = existingGroup.get();
					pen.setVoucherid(pb.getVoucherid());
					pen.setAmount(pb.getAmount());
					pen.setBuyerinfavourof(pb.getBuyerinfavourof());
					pen.setEmployeeinfavourof(pb.getEmployeeinfavourof());
					pen.setPensionerinfavourof(pb.getPensionerinfavourof());	
					pen.setPensionerfamilyinfavourof(pb.getPensionerfamilyinfavourof());	
 
					return new ResponseEntity<>(paymentBankCoverRepo.save(pen), HttpStatus.OK);
				} else {
					paymentBankCoverRepo.save(pb);
					return new ResponseEntity<>(pb, HttpStatus.CREATED);				}
				
				
			} catch (Exception e) { 
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	 
	 public ResponseEntity<VoucherPayment> saveVouPay(VoucherPayment pb) {		
		 try {	
				Optional<VoucherPayment> existObj = vPayRepo.findByvoucherdetailid(pb.getVoucherdetailid());
				if(existObj.isPresent())
				{
					VoucherPayment vh = existObj.get();
					vh.setPaymentmode(pb.getPaymentmode());
					vh.setChequebankname(pb.getChequebankname());
                    vh.setChequedate(pb.getChequedate());
                    vh.setChequeamount(pb.getChequeamount());
                    vh.setChequepaidto(pb.getChequepaidto());
                    
                    vh.setDdamount(pb.getDdamount());
                    vh.setDdbankname(pb.getDdbankname());
                    vh.setDddate(pb.getDddate());
                    vh.setDdnumber(pb.getDdnumber());
                    vh.setDdpaidto(pb.getDdpaidto());
                    
                    vh.setOnlineamount(pb.getOnlineamount());
                    vh.setOnlinebankingcharges(pb.getOnlinebankingcharges());
                    vh.setOnlinebankname(pb.getOnlinebankname());
                    vh.setOnlinedate(pb.getOnlinedate());
                    vh.setOnlinetransactionid(pb.getOnlinetransactionid());
                    
                    vh.setCashamount(pb.getCashamount());
                    vh.setCashdate(pb.getCashdate());
                    vh.setCashpaidto(pb.getCashpaidto());
                    
                    return new ResponseEntity<>(vPayRepo.save(vh),HttpStatus.OK);					
				}
				else
				{
					vPayRepo.save(pb);
				return new ResponseEntity<>(pb, HttpStatus.CREATED);
				}
				
			} catch (Exception e) { 
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	 public ResponseEntity<List<EmployeeBank>> getEmpsBanks() {
		   try  
		   {
			List<EmployeeBank> emp = new ArrayList<EmployeeBank>();        
			empbankrepo.findAll().forEach(emp::add);
	        if(emp.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(emp,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	 
	 public ResponseEntity<List<SalenoteReconcile>> getSaleNotesRecon(Date fromdatedate, int companyid) {
		   try  
		   { 
			   Format formatter = new SimpleDateFormat("yyyy-MM-dd");		  
			   String fromdate = formatter.format(fromdatedate);
			List<SalenoteReconcile> sale = new ArrayList<SalenoteReconcile>(); 
			reconcileRepo.SalenoteReconView(companyid,fromdate).forEach(sale::add);
			List<SalenoteReconcile> salefilter = sale.stream().filter(s->s.getApprovalstatus()==0).collect(Collectors.toList());

	        if(salefilter.isEmpty())  
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(salefilter,HttpStatus.OK);
		   }
		   catch (Exception e) { 
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	 public ResponseEntity<List<SaleNotePaymentFailure>> getSaleNotesReconFailed(Date fromdatedate, int companyid) {
		   try  
		   { 
			   Format formatter = new SimpleDateFormat("yyyy-MM-dd");		  
			   String fromdate = formatter.format(fromdatedate);
			List<SaleNotePaymentFailure> sale = new ArrayList<SaleNotePaymentFailure>(); 
			reconcilefailureRepo.getpfView(companyid,fromdate).forEach(sale::add);
			List<SaleNotePaymentFailure> salefilter = sale;
	        if(salefilter.isEmpty())  
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(salefilter,HttpStatus.OK);
		   }
		   catch (Exception e) { 
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	 
	 public ResponseEntity<SalenoteReconcile> updateRecon(int id) {
			Optional<SalenoteReconcile> existingGroup = reconcileRepo.findById(id);
			if (existingGroup.isPresent()) {
				SalenoteReconcile _group = existingGroup.get();
				_group.setApprovalstatus(1);
				return new ResponseEntity<>(reconcileRepo.save(_group), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		
	    }
	 public ResponseEntity<SalenoteReconcile> updateReconFailed(int id) {
			Optional<SalenoteReconcile> existingGroup = reconcileRepo.findById(id);
			if (existingGroup.isPresent()) { 
				SalenoteReconcile _group = existingGroup.get();
				_group.setApprovalstatus(2); 
				return new ResponseEntity<>(reconcileRepo.save(_group), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		
	    }
	 public ResponseEntity<SalenoteReconcile> updateReconSuccess(int id) {
			Optional<SalenoteReconcile> existingGroup = reconcileRepo.findById(id);
			if (existingGroup.isPresent()) { 
				SalenoteReconcile _group = existingGroup.get();
				_group.setApprovalstatus(3); 
				return new ResponseEntity<>(reconcileRepo.save(_group), HttpStatus.OK);
			} else { 
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		
	    }
	 
	 
	 public ResponseEntity<List<Pensioner>> getPensioners() {
		   try  
		   {
			List<Pensioner> emp = new ArrayList<Pensioner>();        
			pensionerrepo.findAll().forEach(emp::add);
	        if(emp.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(emp,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	 public ResponseEntity<List<PensionerFamily>> getPensionersFamily() {
		   try  
		   {
			List<PensionerFamily> emp = new ArrayList<PensionerFamily>();        
			pensionerfamilyrepo.findAll().forEach(emp::add);
	        if(emp.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(emp,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	 
	 public ResponseEntity<Pensioner> savePensioner(Pensioner pen) {		
			try {
				pensionerrepo.save(pen);
				return new ResponseEntity<>(pen, HttpStatus.CREATED);
			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	 public ResponseEntity<Pensioner> updatePensioner(int id,Pensioner pen) {
			Optional<Pensioner> existingGroup = pensionerrepo.findById(id);
			if (existingGroup.isPresent()) {
				Pensioner _group = existingGroup.get();
				_group.setAnnuityno(pen.getAnnuityno());
				_group.setPensioner(pen.getPensioner());
				_group.setDesignationpensioner(pen.getDesignationpensioner());
				_group.setAccnopensioner(pen.getAccnopensioner());
				_group.setIfscpensioner(pen.getIfscpensioner());		
				return new ResponseEntity<>(pensionerrepo.save(_group), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		
	    }
	 
	 public ResponseEntity<PensionerFamily> updatePensionerFamily(int id,PensionerFamily pen) {
			Optional<PensionerFamily> existingGroup = pensionerfamilyrepo.findById(id);
			if (existingGroup.isPresent()) {
				PensionerFamily _group = existingGroup.get();
				_group.setAnnuitynofamily(pen.getAnnuitynofamily()); 
				_group.setPensionerfamily(pen.getPensionerfamily());
				_group.setDesignationpensionerfamily(pen.getDesignationpensionerfamily());
				_group.setAccnopensionerfamily(pen.getAccnopensionerfamily());
				_group.setIfscpensionerfamily(pen.getIfscpensionerfamily());
				_group.setWo(pen.getWo());	

				return new ResponseEntity<>(pensionerfamilyrepo.save(_group), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		
	    } 
	 
	 public ResponseEntity<PensionerFamily> savePensionerFam(PensionerFamily pen) {		
			try {
				pensionerfamilyrepo.save(pen);
				return new ResponseEntity<>(pen, HttpStatus.CREATED);
			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	 
	 public ResponseEntity<EmployeeBank> saveEmp(EmployeeBank pen) {		
			try {
				empbankrepo.save(pen);
				return new ResponseEntity<>(pen, HttpStatus.CREATED);
			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	 
	 public ResponseEntity<EmployeeBank> updateEmp(int id,EmployeeBank pen) {
			Optional<EmployeeBank> existingGroup = empbankrepo.findById(id);
			if (existingGroup.isPresent()) {
				EmployeeBank _group = existingGroup.get();
				_group.setEmployeecode(pen.getEmployeecode()); 
				_group.setEmployeename(pen.getEmployeename());
				_group.setDesignation(pen.getDesignation());
				_group.setBank(pen.getBank());
				_group.setAccountno(pen.getAccountno());
				_group.setIfsc(pen.getIfsc());	

				return new ResponseEntity<>(empbankrepo.save(_group), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		
	    } 
	 
	 
	 public ResponseEntity<BranchInfavourDetails> saveBranchInFavour(BranchInfavourDetails pen) {		
			try {
				branchInfavourDetailsRepo.save(pen);
				return new ResponseEntity<>(pen, HttpStatus.CREATED);
			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	 
	 public ResponseEntity<BranchInfavourDetails> updateBranchInFavour(int id,BranchInfavourDetails pen) {
			Optional<BranchInfavourDetails> existingGroup = branchInfavourDetailsRepo.findById(id);
			if (existingGroup.isPresent()) {
				BranchInfavourDetails _group = existingGroup.get();
				_group.setApfname(pen.getApfname()); 
				_group.setAccno(pen.getAccno());
				_group.setAcctype(pen.getAcctype());
				_group.setBank(pen.getBank()); 
				_group.setIfsc(pen.getIfsc());
				_group.setInfavourof(pen.getInfavourof());	
				_group.setPlace(pen.getPlace());	

				return new ResponseEntity<>(branchInfavourDetailsRepo.save(_group), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		
	    }
	 
	 public ResponseEntity<List<BranchInfavourDetails>> getBranchInFavour() {
		   try  
		   {
			List<BranchInfavourDetails> branch = new ArrayList<BranchInfavourDetails>();        
			branchInfavourDetailsRepo.findAll().forEach(branch::add);
	        if(branch.isEmpty()) 
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(branch,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	 
	 public ResponseEntity<Daybookopeningclosing> saveDaybook(Daybookopeningclosing db) {
		 try  
		   {
		 Format formatter = new SimpleDateFormat("yyyy-MM-dd");
		    String daybookdate = formatter.format(db.getDaybookdate());	
			
			Optional<Daybookopeningclosing> existingd = dayrepo.findbookdate(db.getLedgerid(),db.getCompanyid(),daybookdate);

			if (existingd.isPresent()) {
				return new ResponseEntity<>(null,HttpStatus.NOT_ACCEPTABLE);
			} else {
				dayrepo.save(db);
				return new ResponseEntity<>(db, HttpStatus.CREATED);
			}
		   }
		 catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	 
	 public ResponseEntity<VoucherPaymentHeader> saveVouPayHeader(VoucherPaymentHeader pb) {		
			try {	
				Optional<VoucherPaymentHeader> existObj = vPayHeaderRepo.findByvoucherid(pb.getVoucherid());
				if(existObj.isPresent())
				{
					VoucherPaymentHeader vh = existObj.get();
					vh.setBank(pb.getBank());
					return new ResponseEntity<>(vPayHeaderRepo.save(vh),HttpStatus.OK);					
				}
				else
				{
				vPayHeaderRepo.save(pb);
				return new ResponseEntity<>(pb, HttpStatus.CREATED);
				}
				
			} catch (Exception e) { 
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	 
	 public ResponseEntity<VoucherPettyCash> saveVouPettyCash(VoucherPettyCash pb) {		
		 try {	
				Optional<VoucherPettyCash> existObj = vpettyrepo.findByvoucherdetailid(pb.getVoucherdetailid());
				if(existObj.isPresent())
				{
					VoucherPettyCash vh = existObj.get();
					if(pb.getSubmit()==true)
					{
					vh.setEnclosures(pb.getEnclosures());
					vh.setSubmit(true);
					return new ResponseEntity<>(vpettyrepo.save(vh),HttpStatus.OK);	
					}
					else
					{
						return new ResponseEntity<>(null,HttpStatus.OK);	
					}
				} 
				else 
				{
					vpettyrepo.save(pb);
				return new ResponseEntity<>(pb, HttpStatus.CREATED);
				}
				
			} catch (Exception e) { 
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		} 
	 
	 public ResponseEntity<VoucherPettyCash> updVouPettyCashStatus(int vdetid,VoucherPettyCash pb) {		
		 try {	
				Optional<VoucherPettyCash> existObj = vpettyrepo.findByvoucherdetailid(vdetid);
				if(existObj.isPresent())
				{
					VoucherPettyCash vh = existObj.get();
					if(pb.getStatusid()!=4)
					{
					vh.setStatuspetty(pb.getStatuspetty());
					vh.setStatusid(pb.getStatusid());
					vh.setSubmit(true);
					}
					else if(pb.getStatusid()==4 && (vh.getStatusid()==2 ||vh.getStatusid()==3))
					{
						vh.setSubmit(false);
					}
					else if(pb.getStatusid()==4 && (vh.getStatusid()!=2 ||vh.getStatusid()!=3))
					{
						if(vh.getStatusid()==1)
						{
							vh.setStatuspetty(vh.getStatuspetty());
							vh.setStatusid(vh.getStatusid());
							vh.setSubmit(true);
						}
						else
						{
						vh.setStatuspetty(pb.getStatuspetty());
						vh.setStatusid(pb.getStatusid());
						vh.setSubmit(true);
						}
					}
				
					return new ResponseEntity<>(vpettyrepo.save(vh),HttpStatus.OK);	
				}		
					return new ResponseEntity<>(null,HttpStatus.OK);
				}
				
			catch (Exception e) { 
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		} 
	 
	 
	 public ResponseEntity<List<VoucherPettyCashView>> getVouPettycash(Date fromdatedate, Date todate) {
		   try  
		   { 
			   Format formatter = new SimpleDateFormat("yyyy-MM-dd");		  
			   String fromdate = formatter.format(fromdatedate);
			   String tdate = formatter.format(todate);

			List<VoucherPettyCashView> pcash = new ArrayList<VoucherPettyCashView>(); 
			vpettyviewrepo.VoucherPettycashView(fromdate,tdate).forEach(pcash::add);
 
	        if(pcash.isEmpty())   
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(pcash,HttpStatus.OK);
		   }
		   catch (Exception e) { 
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	 
	 
}
