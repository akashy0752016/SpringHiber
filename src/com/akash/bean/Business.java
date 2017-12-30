package com.akash.bean;

public class Business {
	private int id;
	private Users user;
	private String businessTitle;
	private String businessKeywords;
	private String aboutUs;
	private String website;
	private String banner;
	private String businessLogo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public String getBusinessTitle() {
		return businessTitle;
	}
	public void setBusinessTitle(String businessTitle) {
		this.businessTitle = businessTitle;
	}
	public String getBusinessKeywords() {
		return businessKeywords;
	}
	public void setBusinessKeywords(String businessKeywords) {
		this.businessKeywords = businessKeywords;
	}
	public String getAboutUs() {
		return aboutUs;
	}
	public void setAboutUs(String aboutUs) {
		this.aboutUs = aboutUs;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getBanner() {
		return banner;
	}
	public void setBanner(String banner) {
		this.banner = banner;
	}
	public String getBusinessLogo() {
		return businessLogo;
	}
	public void setBusinessLogo(String businessLogo) {
		this.businessLogo = businessLogo;
	}
}
