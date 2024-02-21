package com.fna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.FinancialYearDetails;
import com.fna.model.Normalledger;
import com.fna.model.YearlyBudgetDetails;
import com.fna.model.YearlyBudgetDetailsHistoryOfHistory;
import com.fna.model.YearlyBudgetDetailsHistoryView;
import com.fna.model.YearlyBudgetDetailsView;
import com.fna.model.YearlyBudgetMaster;
import com.fna.model.YearlyBudgetMasterView;
import com.fna.service.YearlyBudgetService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class YearlyBudgetController {

	@Autowired
	private YearlyBudgetService ybservice; 
	
	@PostMapping("/yearlybudget")
    public ResponseEntity<YearlyBudgetMaster> addYearlyBudget(@RequestBody YearlyBudgetMaster yb) {
        return ybservice.saveYearlyBudgetMaster(yb); 
    }  
	
	@GetMapping("/yearlybudget/{id}")
    public ResponseEntity<List<YearlyBudgetMasterView>> findAllYearlyBudgets(@PathVariable(value = "id") int userid) {     
	return ybservice.getYearlyBudgetMaster(userid);
    }
	
	@PostMapping("/yearlybudgetdetails/{id}")
    public ResponseEntity<List<YearlyBudgetDetails>> addYearlyBudgetDetails(@PathVariable(value = "id") int yearlybudgetid,@RequestBody List<YearlyBudgetDetails> yearlybudgetdetails) {
        return ybservice.saveYearlyBudgetDetails(yearlybudgetid,yearlybudgetdetails); 
    }
	
	@GetMapping("/yearlybudgetdetails/{id}")
    public ResponseEntity<List<YearlyBudgetDetailsView>> findAllYearlyBudgetDetails(@PathVariable(value = "id") int yearlybudgetid) {     
	return ybservice.getYearlyBudgetDetails(yearlybudgetid);
    }
	@GetMapping("/expenseledgers/{id}")
    public ResponseEntity<List<Normalledger>> getExpenseLedgers(@PathVariable(value = "id") int companyid) {     
	return ybservice.expenseLedgers(companyid);
    }
	
	@GetMapping("/financialyearlybudgetdetails")
    public ResponseEntity<List<YearlyBudgetDetailsView>> findAllFinancialYearlyBudgetDetails() {     
	return ybservice.getCurrentYearlyBudgetDetails();
    }
	@GetMapping("/yearlybudgetdetailshistory/{id}/{lid}")
    public ResponseEntity<List<YearlyBudgetDetailsHistoryView>> findAllYearlyBudgetDetailsHistory(@PathVariable(value = "id") int yearlybudgetid,@PathVariable(value = "lid") int lid) {     
	return ybservice.getYearlyBudgetDetailsHiatory(yearlybudgetid,lid);
    }
 
	@GetMapping("/allfinancialyear")
    public ResponseEntity<List<FinancialYearDetails>> findAllFy() {     
	return ybservice.getFy(
			);
    }
	@PutMapping("/updatestatusbudget/{statusid}/{checkedby}/{approvedby}/{yid}")
    public int updateStatus(@PathVariable int statusid,@PathVariable int checkedby,@PathVariable int approvedby,@PathVariable int yid) {     
	return ybservice.updateStatus(statusid,checkedby,approvedby,yid);
    }
	@PutMapping("/yearlybudgetdetailsupdate/{yhid}")
    public int updateYbd(@PathVariable(value = "yhid") int yearlybudgethid,@RequestBody YearlyBudgetDetails yearlybudgetdetails) {
        return ybservice.updateBudgetDetails(yearlybudgethid,yearlybudgetdetails); 
    }
	@PutMapping("/yearlybudgetdetailsupdaterevise/{yhid}")
    public int updateYbdRevise(@PathVariable(value = "yhid") int yearlybudgethid,@RequestBody YearlyBudgetDetails yearlybudgetdetails) {
        return ybservice.updateBudgetDetailsRevise(yearlybudgethid,yearlybudgetdetails); 
    } 
	@GetMapping("/yearlybudgetdetailshistofhistory/{id}")
    public ResponseEntity<List<YearlyBudgetDetailsHistoryOfHistory>> getYearlyBudgetHistofhistory(@PathVariable(value = "id") int yearlybudgethid) {     
	return ybservice.getYearlyBudgetHOH(yearlybudgethid);
    }

}
