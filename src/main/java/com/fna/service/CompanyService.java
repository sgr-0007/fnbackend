package com.fna.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.fna.model.Company;
import com.fna.model.CompanyDetails;
import com.fna.repository.CompanyDetailsRepository;
import com.fna.repository.CompanyRepository;

@Service
public class CompanyService {
	@Autowired
	private CompanyRepository companyRepository;
	@Autowired
	private CompanyDetailsRepository companyDetailsRepository;

	public ResponseEntity<Company> saveCompany(Company company) {
		try {
			System.out.println("Branch added "+company);
			companyRepository.save(company);
			return new ResponseEntity<>(company, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<List<Company>> getCompanys() {
		try {
			List<Company> company = new ArrayList<Company>();
			companyRepository.findAll().forEach(company::add);
			if (company.isEmpty()) {
				System.out.println("empty");
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(company, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	} 
	public ResponseEntity<List<CompanyDetails>> getCompanysNative() {
		try {
			List<CompanyDetails> company = new ArrayList<CompanyDetails>();
			companyDetailsRepository.findCompanies().forEach(company::add);
			if (company.isEmpty()) {
				System.out.println("empty");
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(company, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<Company> getCompanyById(int Companyid) {
		Optional<Company> groupData = companyRepository.findById(Companyid);
		if (groupData.isPresent()) {
			return new ResponseEntity<>(groupData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity<Company> updateCompany(int Companyid, Company company) {
		Optional<Company> existingGroup = companyRepository.findById(Companyid);
		if (existingGroup.isPresent()) {
			Company _company = existingGroup.get();
			_company.setCityid(company.getCityid());
			_company.setCompanyaddress1(company.getCompanyaddress1());
			_company.setCompanyaddress2(company.getCompanyaddress2());
			_company.setCompanyid(company.getCompanyid());
			_company.setCompanyname(company.getCompanyname());
			_company.setCompanytypeid(company.getCompanytypeid());
			_company.setBranchid(company.getBranchid());
			_company.setTannumber(company.getTannumber());
			_company.setCreatedby(company.getCreatedby());
			_company.setCreateddate(company.getCreateddate());
			_company.setEmailid(company.getEmailid());
			_company.setGsttin(company.getGsttin());
			_company.setIsactive(company.isIsactive());
			_company.setModifiedby(company.getModifiedby());
			_company.setModifieddate(company.getModifieddate());
			_company.setPan(company.getPan());
			_company.setMobile(company.getMobile());
			_company.setPhoneama(company.getPhoneama());
			_company.setPhoneas(company.getPhoneas());
			_company.setPin(company.getPin());
			_company.setRegionaloffice(company.getRegionaloffice());
			_company.setStateid(company.getStateid());
			_company.setWebsite(company.getWebsite());
			return new ResponseEntity<>(companyRepository.save(_company), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}
	public Boolean checkUnique(int id,String name) {
		   return companyRepository.checkUnique("checkifuniquecompanyname", id, name);
			}

	public ResponseEntity<List<Company>> getCompanyBytype(int Companyid,int branchid) {
		List<Company> groupData = companyRepository.findBytype(Companyid,branchid);
		if (groupData!=null) {
			return new ResponseEntity<>(groupData, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	public ResponseEntity<List<Company>> getCompanyBycompanytype (int Companyid) {
		List<Company> groupData = companyRepository.findByCompanytype(Companyid);
		if (groupData!=null) {
			return new ResponseEntity<>(groupData, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	public ResponseEntity<List<Company>> getCompanyid (int Companyid) {
		List<Company> groupData = companyRepository.findByCompanyId(Companyid);
		if (groupData!=null) {
			return new ResponseEntity<>(groupData, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	public ResponseEntity<List<Company>> getCompanyByUid (int uid) {
		List<Company> groupData = companyRepository.findByUserID(uid);
		if (groupData!=null) {
			return new ResponseEntity<>(groupData, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
		}
	}
	public ResponseEntity<Company> getCompanyByUidCid(int uid,int cid) {
	    Company groupData = companyRepository.findByUserIDCompanyID(uid,cid);
		if (groupData!=null) {
			return new ResponseEntity<>(groupData, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
		}
	}
	
}
