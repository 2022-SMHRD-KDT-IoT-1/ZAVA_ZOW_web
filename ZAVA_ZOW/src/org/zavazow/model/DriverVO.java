package org.zavazow.model;

public class DriverVO {

	private String driver_id;
	private String dirver_pw;
	private String driver_name;
	private String driver_nick;
	private int company_seq;
	private String driver_joindate;
	private String driver_birthdate;
	private String bus_id;
	private String bus_full;
	
	public DriverVO(String driver_id, String dirver_pw, String driver_name, String driver_nick, String bus_id,
			String bus_full) {
		this.driver_id = driver_id;
		this.dirver_pw = dirver_pw;
		this.driver_name = driver_name;
		this.driver_nick = driver_nick;
		this.bus_id = bus_id;
		this.bus_full = bus_full;
	}

	public String getDriver_id() {
		return driver_id;
	}

	public void setDriver_id(String driver_id) {
		this.driver_id = driver_id;
	}

	public String getDirver_pw() {
		return dirver_pw;
	}

	public void setDirver_pw(String dirver_pw) {
		this.dirver_pw = dirver_pw;
	}

	public String getDriver_name() {
		return driver_name;
	}

	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
	}

	public String getDriver_nick() {
		return driver_nick;
	}

	public void setDriver_nick(String driver_nick) {
		this.driver_nick = driver_nick;
	}

	public int getCompany_seq() {
		return company_seq;
	}

	public void setCompany_seq(int company_seq) {
		this.company_seq = company_seq;
	}

	public String getDriver_joindate() {
		return driver_joindate;
	}

	public void setDriver_joindate(String driver_joindate) {
		this.driver_joindate = driver_joindate;
	}

	public String getDriver_birthdate() {
		return driver_birthdate;
	}

	public void setDriver_birthdate(String driver_birthdate) {
		this.driver_birthdate = driver_birthdate;
	}

	public String getBus_id() {
		return bus_id;
	}

	public void setBus_id(String bus_id) {
		this.bus_id = bus_id;
	}

	public String getBus_full() {
		return bus_full;
	}

	public void setBus_full(String bus_full) {
		this.bus_full = bus_full;
	}
	
	
}
