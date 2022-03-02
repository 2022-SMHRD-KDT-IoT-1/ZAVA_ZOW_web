package org.zavazow.model;

public class AdminVO {
	
	private String a_id;
	private String a_pw;
	private String a_code;
	
	public AdminVO(String a_id, String a_pw, String a_code) {
		
		this.a_id = a_id;
		this.a_pw = a_pw;
		this.a_code = a_code;
	}
	public String getA_id() {
		return a_id;
	}
	public void setA_id(String a_id) {
		this.a_id = a_id;
	}
	public String getA_pw() {
		return a_pw;
	}
	public void setA_pw(String a_pw) {
		this.a_pw = a_pw;
	}
	public String getA_code() {
		return a_code;
	}
	public void setA_code(String a_code) {
		this.a_code = a_code;
	}
	
	
	

}
