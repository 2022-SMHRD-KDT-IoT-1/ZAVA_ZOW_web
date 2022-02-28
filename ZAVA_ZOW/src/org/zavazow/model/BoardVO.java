package org.zavazow.model;

public class BoardVO {

	private int article_seq;
	private String article_kind;
	private String article_subject;
	private String article_content;
	private String article_file;
	private String article_date;
	private String p_id;
	
	public BoardVO(String article_kind, String article_subject, String article_content, String article_file,
			String p_id) {
		super();
		this.article_kind = article_kind;
		this.article_subject = article_subject;
		this.article_content = article_content;
		this.article_file = article_file;
		this.p_id = p_id;
	}

	public BoardVO(int article_seq, String article_kind, String article_subject, String article_content,
			String article_file, String article_date, String p_id) {
		super();
		this.article_seq = article_seq;
		this.article_kind = article_kind;
		this.article_subject = article_subject;
		this.article_content = article_content;
		this.article_file = article_file;
		this.article_date = article_date;
		this.p_id = p_id;
	}

	public int getArticle_seq() {
		return article_seq;
	}

	public void setArticle_seq(int article_seq) {
		this.article_seq = article_seq;
	}

	public String getArticle_kind() {
		return article_kind;
	}

	public void setArticle_kind(String article_kind) {
		this.article_kind = article_kind;
	}

	public String getArticle_subject() {
		return article_subject;
	}

	public void setArticle_subject(String article_subject) {
		this.article_subject = article_subject;
	}

	public String getArticle_content() {
		return article_content;
	}

	public void setArticle_content(String article_content) {
		this.article_content = article_content;
	}

	public String getArticle_file() {
		return article_file;
	}

	public void setArticle_file(String article_file) {
		this.article_file = article_file;
	}

	public String getArticle_date() {
		return article_date;
	}

	public void setArticle_date(String article_date) {
		this.article_date = article_date;
	}

	public String getP_id() {
		return p_id;
	}

	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	
	
}
