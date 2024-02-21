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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fna.model.Company ;
import com.fna.model.CompanyDetails;
import com.fna.service.CompanyService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class CompanyController {
	@Autowired
	private CompanyService companyService;
	
	@PostMapping("/companies")
    public ResponseEntity<Company> addCompany(@RequestBody Company company) {
        return companyService.saveCompany(company); 
    }
	
	@GetMapping("/companies")
    public ResponseEntity<List<Company>> findCompanies() {     
	return companyService.getCompanys();
    }
	
	@GetMapping("/companiesnative")
    public ResponseEntity<List<CompanyDetails>> findCompaniesNative() {     
	return companyService.getCompanysNative();
    }
	
	@GetMapping("/company/{id}")
    public ResponseEntity<Company> findCompanyById(@PathVariable(value = "id") int companyid) {     
	return companyService.getCompanyById(companyid);
    }

    @PutMapping("/Company/{id}")
   public ResponseEntity<Company> updateCompany(@PathVariable(value = "id") int companyid,
	         @RequestBody Company company) {    	
       return companyService.updateCompany(companyid,company);
   }

    @GetMapping("/company/type/{id}/{branchid}")
    public ResponseEntity<List<Company>> findCompanyBytype(@PathVariable(value = "id") int companyid,@PathVariable(value = "branchid") int branchid) {     
	return companyService.getCompanyBytype(companyid,branchid);
    }
    @GetMapping("/checkcompanyuniqueonedit")
    public Boolean checkUnique(@RequestParam("id") int id ,
            @RequestParam("name") String name ) {     
	return companyService.checkUnique(id,name);

    }
    @GetMapping("/company/companytype/{companytypeid}")
    public ResponseEntity<List<Company>> findCompanyBytype(@PathVariable(value = "companytypeid") int companyid) {     
	return companyService.getCompanyBycompanytype(companyid);
    }
    @GetMapping("/companybyuser/{id}") 
    public ResponseEntity<List<Company>> findCompanyByUId(@PathVariable(value = "id") int userid) {     
	return companyService.getCompanyByUid(userid);
    }
    @GetMapping("/companybyuseroffice/{uid}/{cid}") 
    public ResponseEntity<Company> findCompanyByUIdCid(@PathVariable(value = "uid") int userid,
    		@PathVariable(value = "cid") int companyid) {     
	return companyService.getCompanyByUidCid(userid,companyid);
    }
    
}
