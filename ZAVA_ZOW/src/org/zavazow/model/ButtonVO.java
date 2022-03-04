package org.zavazow.model;

public class ButtonVO {

	private String Buttonnum;
	private String status;
	
	
	
	public ButtonVO(String buttonnum, String status) {
		super();
		Buttonnum = buttonnum;
		this.status = status;
	}



	public String getButtonnum() {
		return Buttonnum;
	}



	public void setButtonnum(String buttonnum) {
		Buttonnum = buttonnum;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
