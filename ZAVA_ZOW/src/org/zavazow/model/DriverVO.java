package org.zavazow.model;

public class DriverVO {

	private String d_id;
	private String d_pw;
	private String d_name;
	private String d_nick;
	private String dbirth_yy;
	private String dbirth_mm;
	private String dbirth_dd;
	private String d_gender;
	private String d_company;
	private String d_tel;
	private String d_joindate;
	private String bus_id;
	private String bus_full;
	
	public DriverVO(String d_id, String d_pw, String d_name, String d_nick, String dbirth_yy, String dbirth_mm,
			String dbirth_dd, String d_gender, String d_company, String d_tel, String d_joindate, String bus_id,
			String bus_full) {
		
		this.d_id = d_id;
		this.d_pw = d_pw;
		this.d_name = d_name;
		this.d_nick = d_nick;
		this.dbirth_yy = dbirth_yy;
		this.dbirth_mm = dbirth_mm;
		this.dbirth_dd = dbirth_dd;
		this.d_gender = d_gender;
		this.d_company = d_company;
		this.d_tel = d_tel;
		this.d_joindate = d_joindate;
		this.bus_id = bus_id;
		this.bus_full = bus_full;
	}

	public DriverVO(String d_id, String d_pw, String d_name, String d_nick, String dbirth_yy, String dbirth_mm,
			String dbirth_dd, String d_gender, String d_company, String d_tel, String d_joindate) {
		this.d_id = d_id;
		this.d_pw = d_pw;
		this.d_name = d_name;
		this.d_nick = d_nick;
		this.dbirth_yy = dbirth_yy;
		this.dbirth_mm = dbirth_mm;
		this.dbirth_dd = dbirth_dd;
		this.d_gender = d_gender;
		this.d_company = d_company;
		this.d_tel = d_tel;
		this.d_joindate = d_joindate;
	}

	public DriverVO(String d_id, String d_pw) {
		this.d_id = d_id;
		this.d_pw = d_pw;
	}

	public String getD_id() {
		return d_id;
	}

	public void setD_id(String d_id) {
		this.d_id = d_id;
	}

	public String getD_pw() {
		return d_pw;
	}

	public void setD_pw(String d_pw) {
		this.d_pw = d_pw;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public String getD_nick() {
		return d_nick;
	}

	public void setD_nick(String d_nick) {
		this.d_nick = d_nick;
	}

	public String getD_birth_yy() {
		return dbirth_yy;
	}

	public void setD_birth_yy(String d_birth_yy) {
		this.dbirth_yy = d_birth_yy;
	}

	public String getD_birth_mm() {
		return dbirth_mm;
	}

	public void setD_birth_mm(String d_birth_mm) {
		this.dbirth_mm = d_birth_mm;
	}

	public String getD_birth_dd() {
		return dbirth_dd;
	}

	public void setD_birth_dd(String d_birth_dd) {
		this.dbirth_dd = d_birth_dd;
	}

	public String getD_gender() {
		return d_gender;
	}

	public void setD_gender(String d_gender) {
		this.d_gender = d_gender;
	}

	public String getD_company() {
		return d_company;
	}

	public void setD_company(String d_company) {
		this.d_company = d_company;
	}

	public String getD_tel() {
		return d_tel;
	}

	public void setD_tel(String d_tel) {
		this.d_tel = d_tel;
	}

	public String getD_joindate() {
		return d_joindate;
	}

	public void setD_joindate(String d_joindate) {
		this.d_joindate = d_joindate;
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