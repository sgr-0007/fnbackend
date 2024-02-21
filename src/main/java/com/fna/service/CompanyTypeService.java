package com.fna.service;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.fna.model.CompanyType;
import com.fna.repository.CompanyTypeRepository;
 
@Service
public class CompanyTypeService {
	
	@Autowired
	private CompanyTypeRepository companyTypeRepository;
	public ResponseEntity<List<CompanyType>> getCompanyTypes() {
		 try 
		   {
			List<CompanyType> companytype = new ArrayList<CompanyType>();        
			companyTypeRepository.findAll().forEach(companytype::add);
	        if(companytype.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(companytype,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	

}
