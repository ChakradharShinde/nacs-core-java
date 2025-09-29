package com.nacs.collection.list.entities;

public class BrowserHistory {
	private String site;
	private String userName;
	private String password;

	public BrowserHistory() {
		
	}

	public BrowserHistory(String site, String userName, String password) {
		this.site = site;
		this.userName = userName;
		this.password = password;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "site=" + site + ",\nuserName=" + userName + ",\npassword=" + password;
	}

}
