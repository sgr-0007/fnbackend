package com.fna.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class SalesLedgerNotFoundAdvice {
	@ResponseBody
	@ExceptionHandler(SalesLedgerNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String employeeNotFoundHandler(SalesLedgerNotFoundException ex) {
	    return ex.getMessage();
	  }
}
