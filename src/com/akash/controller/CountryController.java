package com.akash.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.akash.bean.Country;
import com.akash.bo.impl.CountryBOIMP;

@Controller
public class CountryController {
	@Autowired
	CountryBOIMP countryBOIMP;
	
	@RequestMapping(value="/country", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<String> postUser(@RequestBody Country country) {
		Country response = countryBOIMP.createCountry(country);
		Map<String, Object> map = new HashMap<>();
		if (response != null) {
			
		} else {
			//if (response.getId() == )
		}
		return null;
	}
}
