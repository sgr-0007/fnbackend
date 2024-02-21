package com.fna.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.VoucherType;
import com.fna.repository.VoucherTypeRepository;

@Service
public class VoucherTypeService {
	
	
	@Autowired
	private VoucherTypeRepository vouchertypeRepository;

	

	public ResponseEntity<List<VoucherType>> getVoucherTypes(int vouchertypeid) {
		try {
			List<VoucherType> vouchertype = new ArrayList<VoucherType>();
			vouchertypeRepository.findByIdNative(vouchertypeid).forEach(vouchertype::add);
			if (vouchertype.isEmpty()) { 
				System.out.println("empty"); 
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(vouchertype, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	public ResponseEntity<List<VoucherType>> getAllVoucherTypes() {
		try {
			List<VoucherType> vouchertype = new ArrayList<VoucherType>();
			vouchertypeRepository.findAll().forEach(vouchertype::add);
			if (vouchertype.isEmpty()) { 
				System.out.println("empty"); 
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(vouchertype, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


}
