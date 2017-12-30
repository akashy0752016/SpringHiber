package com.akash.bean;

import org.springframework.beans.factory.annotation.Autowired;

import com.akash.bo.impl.UserRolesBOIMP;

public class Users {
	private int id;
	private UserRoles userRole;
	private String salutation;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private String email;
	private String password;
	private String addharNumber;
	private String mobileNumber;
	private String addressLine1;
	private String addressLine2;
	private City city;
	private State state;
	private Country country;
	private String pinCode;
	private int user_role;
	
	@Autowired
	UserRolesBOIMP userRolesBOIMP;
	
	public UserRoles getUserRole() {
		return userRole;
	}
	public void setUserRole(int user_role) {System.out.println(user_role);
		this.userRole = userRolesBOIMP.getUserRolesInfo(user_role);
	}
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddharNumber() {
		return addharNumber;
	}
	public void setAddharNumber(String addharNumber) {
		this.addharNumber = addharNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public int getUser_role() {
		return user_role;
	}
	public void setUser_role(int user_role) {
		System.out.println(user_role);
		this.user_role = user_role;
		setUserRole(user_role);
	}
}
