package com.fna.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.Currency;
import com.fna.repository.CurrencyRepository;

@Service
public class CurrencyService {
	
	@Autowired
	private CurrencyRepository currencyrepository;
	
	public ResponseEntity<Currency> saveCurrency(Currency currency) {		
		try {
			currencyrepository.save(currency);
			return new ResponseEntity<>(currency, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<List<Currency>> getCurrency() {
		   try 
		   {
			List<Currency> currency = new ArrayList<Currency>();        
			currencyrepository.findAll().forEach(currency::add);
	        if(currency.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(currency,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	
	public ResponseEntity<Currency> getCurrencyById(int currencyid) {
		Optional<Currency> currencyData = currencyrepository.findById(currencyid);
		if (currencyData.isPresent()) {
			return new ResponseEntity<>(currencyData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	    }
	
	public ResponseEntity<Currency> updateCurrency(int currencyid,Currency currency) {
		Optional<Currency> existingCurrency = currencyrepository.findById(currencyid);
		if (existingCurrency.isPresent()) {
			Currency _currency = existingCurrency.get();
			_currency.setCurrencyname(currency.getCurrencyname());
			_currency.setCurrencydisplay(currency.getCurrencydisplay());
			_currency.setIsactive(currency.isIsactive());
			return new ResponseEntity<>(currencyrepository.save(_currency), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	
    }

}
