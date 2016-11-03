package com.jsb.api.model;

public class Membership {
	
	private String id;
	private String passowrd;
	
	public Membership() {
		
	}
	
	public Membership(String id, String password) {
		this.id = id;
		this.passowrd = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassowrd() {
		return passowrd;
	}

	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}
}
