package org.zavazow.model;

public class PassengerVO {

	private String p_id;
	private String p_pw;
	private String p_name;
	private String p_nick;
	private String p_cardnum;
	private String p_joindate;
	private String p_handicapped;
	
	
	public PassengerVO(String p_id, String p_pw, String p_name, String p_nick, String p_cardnum, String p_handicapped) {
		this.p_id = p_id;
		this.p_pw = p_pw;
		this.p_name = p_name;
		this.p_nick = p_nick;
		this.p_cardnum = p_cardnum;
		this.p_handicapped = p_handicapped;
	}

	public String getP_id() {
		return p_id;
	}

	public void setP_id(String p_id) {
		this.p_id = p_id;
	}

	public String getP_pw() {
		return p_pw;
	}

	public void setP_pw(String p_pw) {
		this.p_pw = p_pw;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_nick() {
		return p_nick;
	}

	public void setP_nick(String p_nick) {
		this.p_nick = p_nick;
	}

	public String getP_cardnum() {
		return p_cardnum;
	}

	public void setP_cardnum(String p_cardnum) {
		this.p_cardnum = p_cardnum;
	}

	public String getP_joindate() {
		return p_joindate;
	}

	public void setP_joindate(String p_joindate) {
		this.p_joindate = p_joindate;
	}

	public String getP_handicapped() {
		return p_handicapped;
	}

	public void setP_handicapped(String p_handicapped) {
		this.p_handicapped = p_handicapped;
	}
	
	
}
