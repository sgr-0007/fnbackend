package com.fna.controller;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.BalanceSheetDetails;
import com.fna.model.BranchInfavourDetails;
import com.fna.model.BranchVoucher;
import com.fna.model.Cashbook;
import com.fna.model.CreditHsn;
import com.fna.model.CreditLedgerDetails;
import com.fna.model.DayBookDetails;
import com.fna.model.DaybookBind;
import com.fna.model.Daybookopeningclosing;
import com.fna.model.DebitHsn;
import com.fna.model.DebitLedgerDetails;
import com.fna.model.EmployeeBank;
import com.fna.model.Group;
import com.fna.model.GstView;
import com.fna.model.HsnSacDetails;
import com.fna.model.InvoiceMasterView;
import com.fna.model.ItView;
import com.fna.model.Ledgermapping;
import com.fna.model.Ledgeropeningtemp;
import com.fna.model.OfficeAccount;
import com.fna.model.PaymentBankCover;
import com.fna.model.PaymentDetailsVoucher;
import com.fna.model.Pensioner;
import com.fna.model.PensionerFamily;
import com.fna.model.ProfitLossDetails;
import com.fna.model.SaleNotePaymentFailure;
import com.fna.model.SalenoteReconcile;
import com.fna.model.SubLedger;
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
import com.fna.model.gstBuyerVendorDdl;
import com.fna.model.itBuyerVendorDdl;
import com.fna.service.VoucherService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")

public class VoucherController {
	@Autowired
	private VoucherService voucherservice;

	@PostMapping("/vouchers")
	public ResponseEntity<Voucher> addVoucher(@RequestBody Voucher voucher) {

		return voucherservice.saveVoucher(voucher);
	}

	@PostMapping("/voucherdetails/{id}/{cid}")
	public ResponseEntity<VoucherDetails> addVoucherDetails(@PathVariable(value = "id") int voucherid,
			@PathVariable(value = "cid") int cid, @RequestBody VoucherDetails voucherdetails[]) {
		return voucherservice.saveVoucherDetails(voucherid, cid, voucherdetails);
	}

//	@Transactional
//	@PostMapping("/aucvouchers")
//    public ResponseEntity<List<Voucher>> addAuctionVoucher() {
//		
//        return voucherservice.saveAucVoucher(); 
//    }
//	

	@GetMapping("/vouchers")
	public ResponseEntity<List<Voucher>> findAllVouchers() {
		return voucherservice.getVouchers();
	}

	@GetMapping("/voucherdetails/{id}")
	public ResponseEntity<List<VoucherDetails>> findAllVoucherDetails(@PathVariable(value = "id") int voucherid) {
		return voucherservice.getVoucherDetails(voucherid);
	}

	@GetMapping("/voucherstable/{id}/{uid}")
	public ResponseEntity<List<Voucher>> findAllVouchersTable(@PathVariable(value = "id") int vouchertypeid,
			@PathVariable(value = "uid") int uid) {
		return voucherservice.getVouchersTable(vouchertypeid, uid);
	}

	@GetMapping("/selectedvoucherstable/{id}")
	public ResponseEntity<List<Voucher>> findAllSelectedVouchersTable(@PathVariable(value = "id") int voucherid) {
		return voucherservice.getSelectedVoucherInfo(voucherid);
	}

	@GetMapping("/getdaybook")
	public ResponseEntity<List<VoucherDetails>> getDayBook(@RequestParam("vouchertypeid") int vouchertypeid,
			@RequestParam("companyid") int companyid, @RequestParam("vouchernumber") String vouchernumber,
			@RequestParam("fromdate") Date fromdate, @RequestParam("todate") Date todate) {
		return voucherservice.getDayBookView(vouchertypeid, companyid, vouchernumber, fromdate, todate);
	}

	@PutMapping("/vouchers/{id}")
	public ResponseEntity<Voucher> updateVoucherAmount(@PathVariable(value = "id") int voucherid,
			@RequestBody Voucher voucher) {
		return voucherservice.updateVoucherAmount(voucherid, voucher);
	}

	@PutMapping("/dayBookCloseByCompany/{id}/{date}")
	public int dayBookCloseByCompany(@PathVariable(value = "id") int companyid,
			@PathVariable(value = "date") Date date) {
		return voucherservice.dayBookCloseByCompany(companyid, date);
	}

	@PostMapping("/dayBookOpenByCompany")
	public ResponseEntity<DayBookDetails> dayBookOpenByCompany(@RequestBody DayBookDetails daybookdetails) {
		return voucherservice.dayBookOpenByCompany(daybookdetails);
	}

	@GetMapping("/daybookopenclosebind")
	public ResponseEntity<List<DaybookBind>> dayBookBind(@RequestParam("fromdate") Date fromdate,@RequestParam("userid") int userid) {
		return voucherservice.dayBookBind(fromdate,userid);
	}

	@GetMapping("/getcashbook")
	public ResponseEntity<List<Cashbook>> getCashBook(@RequestParam("daybookfromdate") Date fromdate,
			@RequestParam("daybooktodate") Date todate,@RequestParam("aid") int aid)

	{
		return voucherservice.getCashbook(fromdate, todate,aid);
	}

	@GetMapping("/trailbalanceledger")
	public ResponseEntity<List<TrailBalanceLedgerDetails>> trailBalanceLedger(@RequestParam("fromdate") Date fromdate,
			@RequestParam("todate") Date todate) {
		return voucherservice.getTrailBalanceLegderWise(fromdate, todate);
	}

	@GetMapping("/trailbalancedetailed")
	public ResponseEntity<List<TrailBalanceDetailedWiseDetails>> trailBalanceDetailed(
			@RequestParam("fromdate") Date fromdate, @RequestParam("todate") Date todate) {
		return voucherservice.getTrailBalanceDetailed(fromdate, todate);
	}

	@GetMapping("/trailbalancegroup")
	public ResponseEntity<List<TrailBalanceGroupWiseDetails>> trailBalanceGroup(@RequestParam("fromdate") Date fromdate,
			@RequestParam("todate") Date todate) {
		return voucherservice.getTrailBalanceGroup(fromdate, todate);
	}

	@GetMapping("/trailbalancedetailedgroup")
	public ResponseEntity<List<TrailBalanceDetailedGroupWiseDetails>> trailDetailedBalanceGroup(
			@RequestParam("fromdate") Date fromdate, @RequestParam("todate") Date todate) {
		return voucherservice.getTrailBalanceDetailedGroup(fromdate, todate);
	}

	@GetMapping("/profitloss")
	public ResponseEntity<List<ProfitLossDetails>> profitLossBind(@RequestParam("fromdate") Date fromdate,
			@RequestParam("todate") Date todate) {
		return voucherservice.getProfitLoss(fromdate, todate);
	}

	@GetMapping("/cashbankbalance/{id}")
	public Double getCashBankBalance(@PathVariable(value = "id") int ledgerid) {
		return voucherservice.getCashOrBankBalance(ledgerid);
	}

	@GetMapping("/expincomebalance/{id}")
	public Double getExpIncomeBalance(@PathVariable(value = "id") int ledgerid) {
		return voucherservice.getExpOrIncBalance(ledgerid);
	}

	@GetMapping("/balancesheet")
	public ResponseEntity<List<BalanceSheetDetails>> balanceSheetBind(@RequestParam("fromdate") Date fromdate,
			@RequestParam("todate") Date todate) {
		return voucherservice.getBalanceSheet(fromdate, todate);
	}

	@PutMapping("/updatestatusvoucher/{vid}/{stid}/{approvedby}/{checkedby}/{vdatee}")
	public int updateStatus(@PathVariable int vid, @PathVariable int stid, @PathVariable int approvedby,
			@PathVariable int checkedby, @RequestBody(required = false) String remarks, @PathVariable String vdatee) {
		return voucherservice.updateStatus(vid, stid, approvedby, checkedby, remarks, vdatee);
	}

	@GetMapping("/officeledgers/{cid}")
	public ResponseEntity<Ledgermapping> getOfficeLedgers(@PathVariable(value = "cid") int companyid) {
		return voucherservice.getLedgerByOffice(companyid);
	}

	@GetMapping("/drledgers")
	public ResponseEntity<List<DebitLedgerDetails>> findAllDr() {
		return voucherservice.getDrLedgers();
	}

	@GetMapping("/crledgers")
	public ResponseEntity<List<CreditLedgerDetails>> findAllCr() {
		return voucherservice.getCrLedgers();
	}

	@PostMapping("/paymentdetailsvoucher")
	public ResponseEntity<PaymentDetailsVoucher> addPaymentDetailsVoucher(@RequestBody PaymentDetailsVoucher pdetails) {

		return voucherservice.savePaymentDetails(pdetails);
	}

	@GetMapping("/getallhsnsac")
	public ResponseEntity<List<HsnSacDetails>> findAllHsnSac() {
		return voucherservice.getHsnsac();
	}

	@GetMapping("/getcrhsnsac")
	public ResponseEntity<List<CreditHsn>> findCrHsnSac() {
		return voucherservice.getCrHsnsac();
	}

	@GetMapping("/getdrhsnsac")
	public ResponseEntity<List<DebitHsn>> findDrHsnSac() {
		return voucherservice.getDrHsnsac();
	}

	@PutMapping("/voucherdetailsupdate/{id}")
	public ResponseEntity<VoucherDetails> updateVoucherDetails(@PathVariable(value = "id") int vdid,
			@RequestBody VoucherDetails voucherdetails) {
		return voucherservice.updateVoucherDetails(vdid, voucherdetails);
	}

	@GetMapping("/getvouchersreportview")
	public ResponseEntity<List<VoucherReportView>> getVoucherReportView(
			@RequestParam("vouchertypeid") int vouchertypeid, @RequestParam("companyid") int companyid,
			@RequestParam("vouchernumber") String vouchernumber, @RequestParam("fromdate") Date fromdate,
			@RequestParam("todate") Date todate, @RequestParam("aid") int aid) {
		return voucherservice.getVoucherReportView(vouchertypeid, companyid, vouchernumber, fromdate, todate, aid);
	}

	@GetMapping("/officeaccounts/{uid}")
	public ResponseEntity<List<OfficeAccount>> getofficeAccounts(@PathVariable(value = "uid") int uid) {
		return voucherservice.getOfficeAccount(uid);
	}

	@GetMapping("/gstbuyervendor/{cid}")
	public ResponseEntity<List<gstBuyerVendorDdl>> gstBuyerVendor(@PathVariable(value = "cid") int cid) {
		return voucherservice.getgstBuyerVendorDdl(cid);
	}

	@GetMapping("/itbuyervendor/{cid}")
	public ResponseEntity<List<itBuyerVendorDdl>> getitBuyerVendor(@PathVariable(value = "cid") int cid) {
		return voucherservice.getiTBuyerVendorDdl(cid);
	}

	@GetMapping("/vouchers/invoicemasterview")
	public ResponseEntity<List<InvoiceMasterView>> findAllInvoiceMasterView() {
		return voucherservice.InvMaster();
	}

	@PostMapping("/voucherdetails/gstit/{id}")
	public ResponseEntity<VoucherGst> addGstV(@PathVariable(value = "id") int voucherid,
			@RequestBody VoucherGst voucherdetails) {
		return voucherservice.saveGst(voucherdetails, voucherid);
	}

	@GetMapping("/vouchers/branches")
	public ResponseEntity<List<BranchVoucher>> findAllBranches() {
		return voucherservice.getBranches();
	}

	@GetMapping("/vouchers/getlastvoucherdetails/{compid}/{aid}")
	public ResponseEntity<List<VoucherDetails>> findLastVoucherDetails(@PathVariable(value = "compid") int compid,@PathVariable(value = "aid") int aid) {
		return voucherservice.getLastVoucherDetails(compid,aid);
	}

	@PostMapping("/vouchers/openingbalance")
	public ResponseEntity<Ledgeropeningtemp> addOpeningBalance(@RequestBody Ledgeropeningtemp op) {
		return voucherservice.saveOpBalance(op);
	}

	@GetMapping("/vouchers/getopeningbalance")
	public ResponseEntity<List<Ledgeropeningtemp>> findAllLedgeropeningTemp() {
		return voucherservice.getOpBalances();
	}

	@GetMapping("/accounts/{oid}")
	public ResponseEntity<List<OfficeAccount>> getAccounts(@PathVariable(value = "oid") int oid) {
		return voucherservice.getAccount(oid);
	}

	@GetMapping("/accountsvoucher/{oid}")
	public ResponseEntity<List<OfficeAccount>> getAccountsVoucher(@PathVariable(value = "oid") int oid) {
		return voucherservice.getAccountForVoucher(oid);
	}

	@GetMapping("/voucherdetailsreconcile/{oid}/{vid}")
	public ResponseEntity<List<VoucherDetailsPaymentMode>> findAllVoucherDetailsForRecon(
			@PathVariable(value = "oid") int oid, @PathVariable(value = "vid") int vid) {
		return voucherservice.getVoucherDetailsForRecon(oid, vid);
	}

	@GetMapping("/vouchers/getgstitdetails")
	public ResponseEntity<List<VoucherGst>> findgstitDetails() {
		return voucherservice.getGstItDetails();
	}

	@PutMapping("/gstit/{id}")
	public ResponseEntity<VoucherGst> updateGstit(@PathVariable(value = "id") int id, @RequestBody VoucherGst gst) {
		return voucherservice.updateGstit(id, gst);
	}

	@GetMapping("/voucherdetailsreconcilereceipt/{oid}/{vid}")
	public ResponseEntity<List<VoucherDetailsPaymentMode>> findAllVoucherDetailsForReconRec(
			@PathVariable(value = "oid") int oid, @PathVariable(value = "vid") int vid) {
		return voucherservice.getVoucherDetailsForReceiptRecon(oid, vid);
	}

	@PutMapping("/voucherdetailsrateupdate/{rate}/{id}")
	public ResponseEntity<VoucherDetails> updateRate(@PathVariable(value = "rate") Double rate,
			@PathVariable(value = "id") int id) {
		return voucherservice.updateRate(rate, id);
	}

	@GetMapping("/fetchgstview/{vid}")
	public ResponseEntity<List<GstView>> getGstView(@PathVariable(value = "vid") int vid) {
		return voucherservice.getSelectedGst(vid);
	}

	@GetMapping("/fetchitview/{vid}")
	public ResponseEntity<List<ItView>> getItView(@PathVariable(value = "vid") int vid) {
		return voucherservice.getSelectedIT(vid);
	}

	@DeleteMapping("/deletegst/{id}")
	public void deleteGst(@PathVariable("id") int id) {
		voucherservice.deletegstById(id);
	}

	@DeleteMapping("/deletedaybook/{id}")
	public void deleteDb(@PathVariable("id") int id) {
		voucherservice.deleteDayBookById(id);
	}

	@DeleteMapping("/deletesubledger/{id}")
	public void deleteSl(@PathVariable("id") int id) {
		voucherservice.deleteSubLedgerById(id);
	}

	@PostMapping("voucher/bankcoverpayment")
	public ResponseEntity<PaymentBankCover> addBankCoverPayment(@RequestBody PaymentBankCover pb) {

		return voucherservice.saveBankCover(pb);
	}

	@PostMapping("voucher/voucherpayment")
	public ResponseEntity<VoucherPayment> addVouPayment(@RequestBody VoucherPayment pb) {

		return voucherservice.saveVouPay(pb);
	}

	@GetMapping("/getempbank")
	public ResponseEntity<List<EmployeeBank>> findEmpBank() {
		return voucherservice.getEmpsBanks();
	}

	@GetMapping("voucher/getsalenotes")
	public ResponseEntity<List<SalenoteReconcile>> findAllSaleNotes(@RequestParam("date") Date fromdate,
			@RequestParam("companyid") int companyid) {
		return voucherservice.getSaleNotesRecon(fromdate, companyid);
	}

	@PutMapping("voucher/updatesalenotes/{id}")
	public ResponseEntity<SalenoteReconcile> updateSalenote(@PathVariable(value = "id") int id) {
		return voucherservice.updateRecon(id);
	}

	@GetMapping("voucher/getsalenotesfailedview")
	public ResponseEntity<List<SaleNotePaymentFailure>> findAllSaleNotesFailedView(@RequestParam("date") Date fromdate,
			@RequestParam("companyid") int companyid) {
		return voucherservice.getSaleNotesReconFailed(fromdate, companyid);
	}

	@PutMapping("voucher/updatesalenotesfailed/{id}")
	public ResponseEntity<SalenoteReconcile> updateSalenoteFailed(@PathVariable(value = "id") int id) {
		return voucherservice.updateReconFailed(id);
	}

	@PutMapping("voucher/updatesalenotessuccess/{id}")
	public ResponseEntity<SalenoteReconcile> updateSalenoteSuccess(@PathVariable(value = "id") int id) {
		return voucherservice.updateReconSuccess(id);
	}

	@GetMapping("/getpensioners")
	public ResponseEntity<List<Pensioner>> findPensioner() {
		return voucherservice.getPensioners();
	}

	@GetMapping("/getpensionersfamily")
	public ResponseEntity<List<PensionerFamily>> findPensionerFamily() {
		return voucherservice.getPensionersFamily();
	}

	@PostMapping("/addpensioners")
	public ResponseEntity<Pensioner> addPensioner(@RequestBody Pensioner pen) {
		return voucherservice.savePensioner(pen);
	}

	@PostMapping("/addpensionersfam")
	public ResponseEntity<PensionerFamily> addPensionerfam(@RequestBody PensionerFamily pen) {
		return voucherservice.savePensionerFam(pen);
	}

	@PutMapping("/updatepensioners/{id}")
	public ResponseEntity<Pensioner> updatePensioner(@PathVariable(value = "id") int id, @RequestBody Pensioner pen) {
		return voucherservice.updatePensioner(id, pen);
	}

	@PutMapping("/updatepensionersfamily/{id}")
	public ResponseEntity<PensionerFamily> updatePensionerFam(@PathVariable(value = "id") int id,
			@RequestBody PensionerFamily pen) {
		return voucherservice.updatePensionerFamily(id, pen);
	}

	@PostMapping("/addemp")
	public ResponseEntity<EmployeeBank> addEmployee(@RequestBody EmployeeBank pen) {
		return voucherservice.saveEmp(pen);
	}

	@PutMapping("/updateemp/{id}")
	public ResponseEntity<EmployeeBank> updateEmployee(@PathVariable(value = "id") int id,
			@RequestBody EmployeeBank pen) {
		return voucherservice.updateEmp(id, pen);
	}

	@PostMapping("/addbranchinfavour")
	public ResponseEntity<BranchInfavourDetails> addBranchInFavour(@RequestBody BranchInfavourDetails pen) {
		return voucherservice.saveBranchInFavour(pen);
	}

	@PutMapping("/updatebranchinfavour/{id}")
	public ResponseEntity<BranchInfavourDetails> updateBranchInFavour(@PathVariable(value = "id") int id,
			@RequestBody BranchInfavourDetails pen) {
		return voucherservice.updateBranchInFavour(id, pen);
	}

	@GetMapping("/getbranchinfavour")
	public ResponseEntity<List<BranchInfavourDetails>> findBranchInFavour() {
		return voucherservice.getBranchInFavour();
	}
	@PostMapping("/savedaybook")
    public ResponseEntity<Daybookopeningclosing> addSubgroup(@RequestBody Daybookopeningclosing db) {
        return voucherservice.saveDaybook(db); 
    }
	@PostMapping("voucher/voucherpaymentheader")
	public ResponseEntity<VoucherPaymentHeader> addVouPaymentHeader(@RequestBody VoucherPaymentHeader pb) {

		return voucherservice.saveVouPayHeader(pb); 
	}
	@PostMapping("voucher/savevoupettycash")
	public ResponseEntity<VoucherPettyCash> addVoupettycash(@RequestBody VoucherPettyCash pb) {

		return voucherservice.saveVouPettyCash(pb); 
	}
	@PutMapping("voucher/updatevoupettycashstatus/{id}")
	public ResponseEntity<VoucherPettyCash> updateVoupettycash(@PathVariable(value = "id") int voucherdetailsid,
			@RequestBody VoucherPettyCash pc) {
		return voucherservice.updVouPettyCashStatus(voucherdetailsid, pc);
	}
	
	@GetMapping("voucher/getvoupettycash")
	public ResponseEntity<List<VoucherPettyCashView>> getvouPettycash(@RequestParam("fromdate") Date fromdate,
			@RequestParam("todate") Date todate) {
		return voucherservice.getVouPettycash(fromdate, todate);
	}  
	
}
