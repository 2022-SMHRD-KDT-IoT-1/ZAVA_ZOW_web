package org.zavazow.model;

public class ButtonVO {

	private String bus_stop;
	private String buttonnum;
	
	
	public ButtonVO(String bus_stop, String buttonnum) {
		super();
		this.bus_stop = bus_stop;
		this.buttonnum = buttonnum;
	}


	public String getBus_stop() {
		return bus_stop;
	}


	public void setBus_stop(String bus_stop) {
		this.bus_stop = bus_stop;
	}


	public String getButtonnum() {
		return buttonnum;
	}


	public void setButtonnum(String buttonnum) {
		this.buttonnum = buttonnum;
	}
	
	
}
