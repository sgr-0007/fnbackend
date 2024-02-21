package com.fna.common;

import org.springframework.stereotype.Component;

@Component
public class PaymentCalculation {

	public float calBalance(float initialamount,float paidamount) {
		
		return initialamount-paidamount;
	} 
}
