package com.fna.model;

import org.springframework.stereotype.Component;

@Component
public class Userpath {

	 public int userid;
	public String path;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
}
