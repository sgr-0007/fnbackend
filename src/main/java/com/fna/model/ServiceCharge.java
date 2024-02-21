package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="servicechargerate")
public class ServiceCharge {

	@Id
	private int servicechargerateid;
	private int servicechargerate;
	public int getServicechargerateid() {
		return servicechargerateid;
	}
	public void setServicechargerateid(int servicechargerateid) {
		this.servicechargerateid = servicechargerateid;
	}
	public int getServicechargerate() {
		return servicechargerate;
	}
	public void setServicechargerate(int servicechargerate) {
		this.servicechargerate = servicechargerate;
	}
		      
	
}
