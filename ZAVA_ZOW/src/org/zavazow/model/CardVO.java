package org.zavazow.model;

public class CardVO {
	
	private String cardnum;
	private String status;
	
	
	public CardVO(String cardnum, String status) {
		this.cardnum = cardnum;
		this.status = status;
	}


	public String getCardnum() {
		return cardnum;
	}


	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	
}
