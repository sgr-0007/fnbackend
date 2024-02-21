package com.fna.exceptions;



@SuppressWarnings("serial")
public class SalesLedgerNotFoundException extends RuntimeException{

	public SalesLedgerNotFoundException(final int id) {
		super("Could not find SalesLedger of id " + id);
	}
}
