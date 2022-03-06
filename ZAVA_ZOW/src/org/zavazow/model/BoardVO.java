package org.zavazow.model;

public class BoardVO {

	private String bus;
	private String request;
	
	
	public BoardVO(String bus, String request) {
		super();
		this.bus = bus;
		this.request = request;
	}


	public String getBus() {
		return bus;
	}


	public void setBus(String bus) {
		this.bus = bus;
	}


	public String getRequest() {
		return request;
	}


	public void setRequest(String request) {
		this.request = request;
	}
	
	
}
