package org.zavazow.model;

public class PassengerVO {
	
	
	
	private String id;
	private String pw;
	private String name;
	private String nick;
	private String birth_yy;
	private String birth_mm;
	private String birth_dd;
	private String gender;
	private String cardNum;
	private String tel;
	private String handi;
	
	public PassengerVO(String id, String pw, String name, String nick, String birth_yy, String birth_mm,
			String birth_dd, String gender, String cardNum, String tel, String handi) {
		
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nick = nick;
		this.birth_yy = birth_yy;
		this.birth_mm = birth_mm;
		this.birth_dd = birth_dd;
		this.gender = gender;
		this.cardNum = cardNum;
		this.tel = tel;
		this.handi = handi;
	}

	public PassengerVO(String id, String pw) {
		
		this.id =id;
		this.pw =pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getBirth_yy() {
		return birth_yy;
	}

	public void setBirth_yy(String birth_yy) {
		this.birth_yy = birth_yy;
	}

	public String getBirth_mm() {
		return birth_mm;
	}

	public void setBirth_mm(String birth_mm) {
		this.birth_mm = birth_mm;
	}

	public String getBirth_dd() {
		return birth_dd;
	}

	public void setBirth_dd(String birth_dd) {
		this.birth_dd = birth_dd;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHandi() {
		return handi;
	}

	public void setHandi(String handi) {
		this.handi = handi;
	}


	
	
	
	
	
	
}