package com.akash.bean;

public class BusinessCategory {
	private int id;
	private BusinessCategory parent;
	private String title;
	private String description;
	private String image;
	private boolean blocked;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BusinessCategory getParent() {
		return parent;
	}
	public void setParent(BusinessCategory parent) {
		this.parent = parent;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public boolean getBlocked() {
		return blocked;
	}
	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}
}
