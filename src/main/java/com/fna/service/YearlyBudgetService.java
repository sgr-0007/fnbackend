package com.fna.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.FinancialYearDetails;
import com.fna.model.Normalledger;
import com.fna.model.YearlyBudgetDetails;
import com.fna.model.YearlyBudgetDetailsHistory;
import com.fna.model.YearlyBudgetDetailsHistoryOfHistory;
import com.fna.model.YearlyBudgetDetailsHistoryView;
import com.fna.model.YearlyBudgetDetailsView;
import com.fna.model.YearlyBudgetMaster;
import com.fna.model.YearlyBudgetMasterView;
import com.fna.repository.FinancialPeriodeRepository;
import com.fna.repository.NormalledgerRepository;
import com.fna.repository.YearlyBudgetDetailsHistoryOfHistoryRepository;
import com.fna.repository.YearlyBudgetDetailsHistoryRepository;
import com.fna.repository.YearlyBudgetDetailsHistoryViewRepository;
import com.fna.repository.YearlyBudgetDetailsRepository;
import com.fna.repository.YearlyBudgetDetailsViewRepository;
import com.fna.repository.YearlyBudgetMasterRepository;
import com.fna.repository.YearlyBudgetMasterViewRepository;

@Service
public class YearlyBudgetService {

	@Autowired
	private YearlyBudgetMasterRepository yearlymasterrepo;
	@Autowired
	private YearlyBudgetMasterViewRepository yearlymasteviewrrepo;
	@Autowired
	private YearlyBudgetDetailsRepository yearlydetailsrepo;
	@Autowired
	private YearlyBudgetDetailsHistoryRepository yearlydetailshistoryrepo;
	@Autowired
	private YearlyBudgetDetailsHistoryViewRepository yearlydetailshistoryviewrepo;
	@Autowired
	private YearlyBudgetDetailsViewRepository yearlydetailsviewrepo;
	@Autowired
	private NormalledgerRepository normalledgerrepository;
	@Autowired
	private FinancialPeriodeRepository fyrepository; 
	@Autowired
	private YearlyBudgetDetailsHistoryOfHistoryRepository yearlydetailshistoryofhistrepo;

	public ResponseEntity<YearlyBudgetMaster> saveYearlyBudgetMaster(YearlyBudgetMaster yearlybudgetmaster) {
		try {

			yearlymasterrepo.save(yearlybudgetmaster);
			return new ResponseEntity<>(yearlybudgetmaster, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

	public ResponseEntity<List<YearlyBudgetMasterView>> getYearlyBudgetMaster(int uid) {
		try { 
			List<YearlyBudgetMasterView> yearlybudgetmaster = new ArrayList<YearlyBudgetMasterView>();
			yearlymasteviewrrepo.ybMasterView("fetchyearlybudgetmasterview",uid).forEach(yearlybudgetmaster::add);
			if (yearlybudgetmaster.isEmpty()) {
				System.out.println("empty");
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(yearlybudgetmaster, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

	public ResponseEntity<List<YearlyBudgetDetails>> saveYearlyBudgetDetails( int yearlybudgetid,List<YearlyBudgetDetails> yearlybudgetdetailslist) {
		try {
			
			for( YearlyBudgetDetails yearlybudgetdetails :yearlybudgetdetailslist)
			{
			saveYearlyBudgetDetailsHistory(yearlybudgetid,yearlybudgetdetails);
			  System.out.println("updatestbudgetentered");
			int checkUpdate = checkUpdateYbd(yearlybudgetdetails.getLedgerid(), yearlybudgetdetails.getCompanyid(), yearlybudgetdetails.getFinancialyear());
			  System.out.println("updatestbudget"+checkUpdate);
			
			yearlybudgetdetails.setYearlybudgetid(yearlybudgetid);            
            yearlybudgetdetails.setBalancebudgetamount(0.0); 
            yearlybudgetdetails.setBalancecarriedforwardforledger(0.0); 
            yearlybudgetdetails.setSanctionedbudget(yearlybudgetdetails.getEstimatedbudget()); 

            if(checkUpdate ==0)
			{
			yearlydetailsrepo.save(yearlybudgetdetails); 
			System.out.println("updatestbudgetenteredsaved");

			}
			else
			{
				yearlydetailsrepo.updateSanctionedBalance("updateestimatebudgetamount", yearlybudgetdetails.getLedgerid(), yearlybudgetdetails.getCompanyid(), yearlybudgetdetails.getFinancialyear(), yearlybudgetdetails.getEstimatedbudget());
				
			}
			
			}
			return new ResponseEntity<>(yearlybudgetdetailslist, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public void saveYearlyBudgetDetailsHistory( int yearlybudgetid,YearlyBudgetDetails yearlybudgetdetails) {
		
		try {
			YearlyBudgetDetailsHistory yh = new YearlyBudgetDetailsHistory();
			yh.setYearlybudgetid(yearlybudgetid);
			yh.setFinancialyear(yearlybudgetdetails.getFinancialyear());
			yh.setCompanyid(yearlybudgetdetails.getCompanyid()); 
			yh.setLedgerid(yearlybudgetdetails.getLedgerid());
			yh.setStatusid(1);
			yh.setEstimatedbudget(yearlybudgetdetails.getEstimatedbudget());
			yh.setSanctionedbudget(yearlybudgetdetails.getEstimatedbudget());
            yearlydetailshistoryrepo.save(yh); 
            
 

		} catch (Exception e) {
		System.err.println(e);
		}
	} 
	
	public ResponseEntity<List<YearlyBudgetDetailsView>> getYearlyBudgetDetails(int yearlybudgetid) {
		try {
			List<YearlyBudgetDetailsView> yearlybudgetdetails = new ArrayList<YearlyBudgetDetailsView>();
			yearlydetailsviewrepo.yearlyBudgetDetailsView(yearlybudgetid, "fetchyearlybudgetdetailsview").forEach(yearlybudgetdetails::add);
			if (yearlybudgetdetails.isEmpty()) {
				System.out.println("empty");
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(yearlybudgetdetails, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<List<Normalledger>> expenseLedgers(int companyid) {		
		 try 
		   {
			List<Normalledger> normalledger = new ArrayList<Normalledger>();        
			normalledger= normalledgerrepository.expenseLedgers("fetchexpenseledgers", 0);
	        if(normalledger.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(normalledger,HttpStatus.OK);
		   }
		   catch (Exception e) { 
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public Double balanceBudget(int cid , int lid) {		
		
		return yearlydetailsrepo.yearlyBalanceBudgetAmount(cid, lid, "fetchyearlybalancebudgetamount");	
		
	}
	
	public ResponseEntity<List<YearlyBudgetDetailsView>> getCurrentYearlyBudgetDetails() {
		try {
			List<YearlyBudgetDetailsView> yearlybudgetdetails = new ArrayList<YearlyBudgetDetailsView>();
			yearlydetailsviewrepo.CurrentFinancialYearlyBudgetDetailsView("fetchcurrentfinancialyearlybudgetdetailsview").forEach(yearlybudgetdetails::add);
			if (yearlybudgetdetails.isEmpty()) {
				System.out.println("empty");
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(yearlybudgetdetails, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<List<YearlyBudgetDetailsHistoryView>> getYearlyBudgetDetailsHiatory(int yearlybudgetid,int ledgerid) {
		try { 
			List<YearlyBudgetDetailsHistoryView> yearlybudgetdetails = new ArrayList<YearlyBudgetDetailsHistoryView>();
			yearlydetailshistoryviewrepo.yearlyBudgetDetailsViewHistory(yearlybudgetid, ledgerid,"fetchyearlybudgetdetailshistoryview").forEach(yearlybudgetdetails::add);
			if (yearlybudgetdetails.isEmpty()) {
				System.out.println("empty");
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(yearlybudgetdetails, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


	public int  checkUpdateYbd(int lid,int cid,String financialyear)
	{
		
		return yearlydetailsrepo.checkYbdUpdate("ifupdateyearlybudgetdetails", lid, cid, financialyear);
		
	}
	
	public ResponseEntity<List<FinancialYearDetails>> getFy() {
		try {
			List<FinancialYearDetails> financialyear = new ArrayList<FinancialYearDetails>();
			fyrepository.getAllFY().forEach(financialyear::add);
			if (financialyear.isEmpty()) {
				System.out.println("empty");
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(financialyear, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
    public int updateStatus( int statusid,int checkedby,int approvedby,int yid) {
		
		try {
			System.out.println(statusid);
		return	yearlydetailshistoryrepo.updateStatus("updatestatus",statusid,checkedby,approvedby,yid); 
		} catch (Exception e) {
			return 0;
		}
	}
    
public int updateBudgetDetails( int yearlybudgetdetailshistid, YearlyBudgetDetails ybd) {
		
		try {
		 updateBudgetHistory(ybd.getEstimatedbudget(),ybd.getSanctionedbudget(),yearlybudgetdetailshistid);
		Double estbudgetsum = yearlydetailshistoryrepo.getEst("sumestimated",ybd.getYearlybudgetid(),ybd.getLedgerid());
		Double sancbudgetsum = yearlydetailshistoryrepo.getSanct("sumsanctioned",ybd.getYearlybudgetid(),ybd.getLedgerid());
		 return	yearlydetailsrepo.updateBudgetDetails("updatebudgetdetails",estbudgetsum,sancbudgetsum,ybd.getYearlybudgetid(),ybd.getLedgerid()); 
		} catch (Exception e) {
			return 0;
		}
	}
public int updateBudgetHistory( Double estamount, Double sanamount,int yearlybudgetdetailshistoryid) {
		
		try {
		return	yearlydetailshistoryrepo.updateBudgetHistory("updatebudgethistory",estamount,sanamount,yearlybudgetdetailshistoryid); 
		} catch (Exception e) {
			return 0;
		}
	}

public int updateBudgetDetailsRevise( int yearlybudgetdetailshistid, YearlyBudgetDetails ybd) {
	
	try {
		updateBudgetHistoryRevise(ybd.getSanctionedbudget(),ybd.getRevise(),ybd.getAdditional(),yearlybudgetdetailshistid);
	Double sancbudgetsum = yearlydetailshistoryrepo.getSanct("sumsanctioned",ybd.getYearlybudgetid(),ybd.getLedgerid());
	Double revisesum = yearlydetailshistoryrepo.getRevise("sumerevised",ybd.getYearlybudgetid(),ybd.getLedgerid());
	Double addtnsum = yearlydetailshistoryrepo.getAddtn("sumaddtn",ybd.getYearlybudgetid(),ybd.getLedgerid());

	
	 return	yearlydetailsrepo.updateBudgetDetailsRev("updatebudgetdetailsrevise",revisesum,addtnsum,sancbudgetsum,ybd.getYearlybudgetid(),ybd.getLedgerid()); 
	} catch (Exception e) {
		return 0;
	}
}
public int updateBudgetHistoryRevise( Double sanamount, Double revise, Double additional,int yearlybudgetdetailshistoryid) {
	
	try {
	return	yearlydetailshistoryrepo.updateBudgetHistoryRevise("updatebudgethistoryrevise",sanamount,revise,additional,yearlybudgetdetailshistoryid); 
	} catch (Exception e) {
		return 0;
	}
}

public ResponseEntity<List<YearlyBudgetDetailsHistoryOfHistory>> getYearlyBudgetHOH(int yearlybudgetdetailshistoryid) {
	try { 
		List<YearlyBudgetDetailsHistoryOfHistory> yearlybudget = new ArrayList<YearlyBudgetDetailsHistoryOfHistory>();
		yearlydetailshistoryofhistrepo.findByHid(yearlybudgetdetailshistoryid).forEach(yearlybudget::add);
		if (yearlybudget.isEmpty()) {
			System.out.println("empty");
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(yearlybudget, HttpStatus.OK);
	} catch (Exception e) {
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
	
}
