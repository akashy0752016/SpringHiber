package com.akash.bo;

import java.util.List;

import com.akash.bean.Country;

public interface CountryBO {
	//Get Country List
	public List<Country> getCountryList();
	//Get User Info by id
	public Country getCountryInfo(int id);
	//Create New User
	public Country createCountry(Country country);
	//Update User by user Id
	public Country updateCountry(Country country, int id);
}
