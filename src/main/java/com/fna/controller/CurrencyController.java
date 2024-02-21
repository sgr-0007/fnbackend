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

import com.fna.model.Currency;
import com.fna.service.CurrencyService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class CurrencyController {
	
	@Autowired
	private CurrencyService currencyservice;
	
	@PostMapping("/currency")
    public ResponseEntity<Currency> addCurrency(@RequestBody Currency currency) {
        return currencyservice.saveCurrency(currency); 
    }
	
	@GetMapping("/currency")
    public ResponseEntity<List<Currency>> findAllCurrency() {     
	return currencyservice.getCurrency();
    }
	
	@GetMapping("/currency/{id}")
    public ResponseEntity<Currency> findCurrencyById(@PathVariable(value = "id") int currencyid) {     
	return currencyservice.getCurrencyById(currencyid);
    }

    @PutMapping("/currency/{id}")
   public ResponseEntity<Currency> updateProduct(@PathVariable(value = "id") int currencyid,
	         @RequestBody Currency currency) {    	
       return currencyservice.updateCurrency(currencyid,currency);
   }

}
