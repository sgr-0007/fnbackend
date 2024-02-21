package com.fna.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.FinancialYearDetails;
import com.fna.model.InvoiceDetails;
import com.fna.model.InvoiceInfo;
import com.fna.model.InvoiceItemDetails;
import com.fna.model.Payment;
import com.fna.model.PaymentTerm;
import com.fna.repository.FinancialPeriodeRepository;
import com.fna.repository.InvoiceInfoRepo;
import com.fna.repository.InvoiceItemRepository;
import com.fna.repository.InvoiceRepository;
import com.fna.repository.PaymentRepository;
import com.fna.repository.PaymentTermRepository;

@Service
public class InvoiceService {

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
	public ResponseEntity<InvoiceDetails> insertInvoiceNumber(int officeid){
		InvoiceDetails invoiceDetails=new InvoiceDetails();
		int incrementValue=1;
		Calendar cal = Calendar.getInstance();
		FinancialYearDetails financialPeriod =financialPeriodRepo.getInvoicePeriod();
		Date startDate= financialPeriod.getFinancialyearstartdate();
		
		cal.setTime(startDate);
		int strat=cal.get(Calendar.YEAR);
		
		Date endDate= financialPeriod.getFinancialyearenddate();
		cal.setTime(endDate);
		int end=cal.get(Calendar.YEAR);
		String officeName= invoiceRepo.getOfficeName(officeid);
		String invoicePattern=strat+"-"+end+"-"+officeName;
		String invoiceNumber= invoiceRepo.getInvoiceNumber(invoicePattern);
		System.out.println(invoiceNumber);
		if(invoiceNumber!=null) {
		String[] arryinvoiceNumber=invoiceNumber.split("-");
		incrementValue=Integer.parseInt(arryinvoiceNumber[arryinvoiceNumber.length-1])+incrementValue;
		}
		
		String newInvoiceNumber=invoicePattern+"-"+incrementValue;
		invoiceDetails.setInvoicenumber(newInvoiceNumber);
		InvoiceDetails invoice= invoiceRepo.save(invoiceDetails);
		 return new ResponseEntity<>(invoice, HttpStatus.CREATED);
	}
//	public ResponseEntity<InvoiceDetails> insertInvoice(InvoiceDetails invoiceDetails){
//		PaymentTerm payterm=new PaymentTerm();
//		Payment pay=new Payment();
//		Optional<PaymentTerm> payterms=paymentTermsRepo.findById(invoiceDetails.getPaymenttermsid());
//		 pay=paymentRepo.findByinvoiceId(invoiceDetails.getInvoiceid());
//		
//		payterm=payterms.get();
//		payterm.getNoofCreditDays();
//		Calendar cal= Calendar.getInstance();
//		cal.setTime(invoiceDetails.getInvoicedate());
//		cal.add(Calendar.DATE,payterm.getNoofCreditDays());
//		System.out.println(cal);
//		invoiceDetails.setDuedate(cal.getTime());
//		 pay.setPaymentDueDate(cal.getTime());
//		System.out.println(invoiceDetails.getDuedate());
//		InvoiceDetails invoice= invoiceRepo.save(invoiceDetails);
//		 return new ResponseEntity<>(invoice, HttpStatus.CREATED);
//	}
	public ResponseEntity<InvoiceDetails> insertInvoice(InvoiceDetails invoiceDetails){
		PaymentTerm payterm=new PaymentTerm();
		Payment pay=new Payment();
		Optional<PaymentTerm> payterms=paymentTermsRepo.findById(invoiceDetails.getPaymenttermsid());
		 pay=paymentRepo.findByinvoiceId(invoiceDetails.getInvoiceid());
		
			int incrementValue=1;
			Calendar cal = Calendar.getInstance();
			FinancialYearDetails financialPeriod =financialPeriodRepo.getInvoicePeriod();
			Date startDate= financialPeriod.getFinancialyearstartdate();
			
			cal.setTime(startDate);
			int strat=cal.get(Calendar.YEAR);
			
			Date endDate= financialPeriod.getFinancialyearenddate();
			cal.setTime(endDate);
			int end=cal.get(Calendar.YEAR);
			String officeName= invoiceRepo.getOfficeName(invoiceDetails.getCompanyid());
			String invoicePattern=strat+"-"+end+"-"+officeName;
			String invoiceNumber= invoiceRepo.getInvoiceNumber(invoicePattern);
			System.out.println(invoiceNumber);
			if(invoiceNumber!=null) {
			String[] arryinvoiceNumber=invoiceNumber.split("-");
			incrementValue=Integer.parseInt(arryinvoiceNumber[arryinvoiceNumber.length-1])+incrementValue;
			}
			if(invoiceDetails.getInvoiceid()==0) {
			String newInvoiceNumber=invoicePattern+"-"+incrementValue;
			invoiceDetails.setInvoicenumber(newInvoiceNumber);}
		payterm.getNoofCreditDays();
		cal.setTime(invoiceDetails.getInvoicedate());
		cal.add(Calendar.DATE,payterm.getNoofCreditDays());
		System.out.println(cal);
		invoiceDetails.setDuedate(cal.getTime());
		if(pay!=null) {
		payterm=payterms.get();
		 pay.setPaymentDueDate(cal.getTime());
		System.out.println(invoiceDetails.getDuedate());
		}
		InvoiceDetails invoice= invoiceRepo.save(invoiceDetails);
		 return new ResponseEntity<>(invoice, HttpStatus.CREATED);
	}
	
	public ResponseEntity<List<InvoiceItemDetails>> insertInvoiceItem(List<InvoiceItemDetails> invoiceDetails,int pInvoiceId){
		List<InvoiceItemDetails> invoice= new ArrayList<InvoiceItemDetails>();
		for( InvoiceItemDetails invoiceitem :invoiceDetails) {
			invoiceitem.setInvoiceId(pInvoiceId);
			invoice.add(invoiceItemRepo.save(invoiceitem));
			}
		
	 return new ResponseEntity<>(invoice, HttpStatus.CREATED);
}
	public ResponseEntity<InvoiceDetails> insertInvoiceDetails(InvoiceDetails invoiceDetails){
		
		InvoiceDetails invoice= invoiceRepo.save(invoiceDetails);
	 return new ResponseEntity<>(invoice, HttpStatus.CREATED);
}
	public ResponseEntity<FinancialYearDetails> getInvoicePeriod(){
		FinancialYearDetails financialPeriod =financialPeriodRepo.getInvoicePeriod();
		return new ResponseEntity<>(financialPeriod,HttpStatus.OK);
	}
	
	public ResponseEntity<List<InvoiceInfo>> getInvoice(){
		List<InvoiceInfo> invoiceList= new ArrayList<InvoiceInfo>();
		invoiceList=invoicedetailsRepo.getInvoiceDetails();
		return new ResponseEntity<>(invoiceList,HttpStatus.OK);
	}
	public ResponseEntity<InvoiceDetails> getInvoiceById(int invoiceId){
		System.out.println("Invoice Id"+invoiceId);
		InvoiceDetails invoiceList =new InvoiceDetails();
		Optional<InvoiceDetails>invoiceList1=invoiceRepo.findById(invoiceId);
		invoiceList=invoiceList1.get();
		return new ResponseEntity<>(invoiceList,HttpStatus.OK);
	}
	public ResponseEntity<List<InvoiceItemDetails>> getInvoiceDetailsById(int invoiceId){
		List<InvoiceItemDetails> invoiceList= new ArrayList<InvoiceItemDetails>();
		invoiceList=invoiceItemRepo.getInvoiceItemDetails(invoiceId);
		return new ResponseEntity<>(invoiceList,HttpStatus.OK);
	}
	
	public String generateInvoiceNumber(String StartYear,String EndYear,String Office) {
		int autogen=0;
		autogen=autogen+1;
		String invoiceNumber=StartYear+EndYear+Office+autogen;
		return invoiceNumber;
	}
	public ResponseEntity<InvoiceDetails> UpdateApproveStatus(int invoiceId, int approververifiedstatus,int roeId) {
		// TODO Auto-generated method stub
		InvoiceDetails invoice=new InvoiceDetails();
		if(roeId==7) {
			invoiceRepo.updateCheckerStatus(invoiceId,approververifiedstatus,roeId);
		}
		if(roeId==8) {
			invoiceRepo.updateApprovalStatus(invoiceId,approververifiedstatus,roeId);
		}
		return new ResponseEntity<InvoiceDetails>(invoice, HttpStatus.OK);
	}
}
