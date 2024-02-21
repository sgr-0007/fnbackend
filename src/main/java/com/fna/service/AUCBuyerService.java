package com.fna.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.AUCBuyerLedger;
import com.fna.model.SalesLedger;
import com.fna.repository.AUCNBuyerLedgerRepo;
import com.fna.repository.LedgerRepository;

@Service
public class AUCBuyerService {

	@Autowired
	private AUCNBuyerLedgerRepo buyerRepo;
	
	@Autowired
	private LedgerRepository ledgerRepository;
	
	public ResponseEntity<List<SalesLedger>> getBuyerTransformed(){
		//retrieve buyer details from auction platform
		List<AUCBuyerLedger>  aucbuyerLedger= new ArrayList<>();
		List<AUCBuyerLedger>  aucbuyerList= new ArrayList<>();
		List<SalesLedger> salebuyer=new ArrayList<SalesLedger>();
		aucbuyerLedger=buyerRepo.findAll();
		for(AUCBuyerLedger buyer: aucbuyerLedger) {
			if(buyer.getStatus()==1 && buyer.getCstatus()==2){
				System.out.println(buyer);
				SalesLedger sales=new SalesLedger(); 
				sales.setLedgerCode(buyer.getiBuyerID());
				sales.setLedgerName("AUC-"+buyer.getiBuyerID()+"-"+buyer.getVcBuyerName());
				sales.setLedgerAlias(buyer.getVcBuyerName());
				sales.setAddress1(buyer.getVcAddress());
				sales.setActive((byte)1);
				sales.setCompanyId(buyer.getCompanyid());
				sales.setAssociateHomeBranch(3);				
				sales.setGroupId(13); 
				sales.setSubGroupId(87);
				sales.setAffectInventory(0);
				sales.setRecordApprovalStatus(3);
				sales.setUndergroups("sales");
				sales.setAccounttypeid(8);
				salebuyer.add(sales);
				aucbuyerList.add(buyer);
			}
		}
		
		ledgerRepository.saveAll(salebuyer);
		for(AUCBuyerLedger buyer: aucbuyerList) {
			buyer.setCstatus(3);
			
		}
		buyerRepo.saveAll(aucbuyerList);
		
		return ResponseEntity.ok(salebuyer);
	}
}
