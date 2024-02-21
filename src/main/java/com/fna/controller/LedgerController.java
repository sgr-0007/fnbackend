package com.fna.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.InvoiceBuyerDetails;
import com.fna.model.LedgerDetails;
import com.fna.model.LedgerGroupDetails;
import com.fna.model.LedgerSubGroupDetails;
import com.fna.model.SalesLedger;
import com.fna.service.LedgerServices;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class LedgerController {

	@Autowired
	private LedgerServices ledgerService;
	
	
	@Transactional(rollbackFor = {Exception.class})
	@PostMapping("/create/salesledger")
	
	public ResponseEntity<SalesLedger> addSalesLedgers(@Valid @RequestBody SalesLedger slaeLedger) throws Exception {
		return ledgerService.saveSalesLedger(slaeLedger);
	}
	
	@GetMapping("/sales/ledger/{id}")
	public ResponseEntity<SalesLedger> getSalesLedger(@PathVariable int id) {
		return ledgerService.getSalesLedgerById(id);
	}
	@GetMapping("/sales/ledger")
	public ResponseEntity<List<SalesLedger>> getAllSalesLedger() {
		return ledgerService.getAllSalesLedger();
	}
	@GetMapping("/sales/ledgername")
	public ResponseEntity<List<String>> getAllLedgerName() {
		return ledgerService.getAllSalesLedgerName();
	}
	@GetMapping("/sales/ledgeralias")
	public ResponseEntity<List<String>> getAllLedgerAlias() {
		return ledgerService.getAllSalesLedgerAlias();
	}
	@GetMapping("/ledger/category/{cat}")
	public ResponseEntity<List<LedgerDetails>> getAllLedgerByCat(@PathVariable int cat) {
		return ledgerService.getLedgerByCatagegory(cat);
	}
	@Transactional
	@PutMapping("/sale/ledger/{id}")
	public ResponseEntity<SalesLedger> updateSalesLedger(@PathVariable int id , @RequestBody SalesLedger salesLedger){
		
		return ledgerService.updateSalesLedger(id,salesLedger);
	}
	@PutMapping("/ledger/status/{id}/{status}/{roleId}")
	public ResponseEntity<SalesLedger> updateLedgerStatus(@PathVariable int id,@PathVariable int status,@PathVariable int roleId){
		System.out.println(id + status);
		return ledgerService.updateLedgerStatus(id,status,roleId);
	}
	
	@DeleteMapping("/sales/ledger/{id}")
	public ResponseEntity<SalesLedger> deleteSalesLedgerById(@PathVariable int id){
		return ledgerService.deleteSalesLedger(id);
	}

	@GetMapping("/ledger/sales/{companyid}")
	public ResponseEntity<List<InvoiceBuyerDetails>> getSalesLedgerByCompanyId(@PathVariable int companyid) {
		return ledgerService.getSalesLedger(companyid);
	}
	@GetMapping("/ledger/purchase/{companyid}")
	public ResponseEntity<List<InvoiceBuyerDetails>> getPurchaseLedger(@PathVariable int companyid) {
		return ledgerService.getAllPurchaseLedger(companyid);
	}
	

	@GetMapping("/ledger/salesgroup")
	public ResponseEntity<List<LedgerGroupDetails>> getSalesLedgerGroup() {
		return ledgerService.getSalesLedgerGroup();
	}
	@GetMapping("/ledger/purchasegroup")
	public ResponseEntity<List<LedgerGroupDetails>> getPurchaseLedgerGroup() {
		return ledgerService.getPurchaseLedgerGroup();
	}
	
	@GetMapping("/ledger/salespurchasesubgroup/{groupid}")
	public ResponseEntity<List<LedgerSubGroupDetails>> getLedgerSubGroup(@PathVariable int groupid) {
		return ledgerService.getLedgerSubGroup(groupid);
	}
}
