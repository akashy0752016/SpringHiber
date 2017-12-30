package com.akash.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.akash.bean.Users;
import com.akash.bo.impl.UserBOIMP;
import com.akash.bo.impl.UserRolesBOIMP;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class UserController {
	@Autowired
	UserBOIMP userBOIMP;
	
	@Autowired
	UserRolesBOIMP userRolesBOIMP;
	
	@RequestMapping(value="/users", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<String> getUsers(HttpServletRequest request) {
		List<Users> list = userBOIMP.getUsersList();
		Map<String, Object> map = new HashMap<>();
		if (list.size() > 0) {
			map.put("response", "success");
			map.put("list", list);
			try {
				return new ResponseEntity<String>(new ObjectMapper().writeValueAsString(map), HttpStatus.ACCEPTED);
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			map.put("response", "failure");
			map.put("message", "No User found");
			try {
				return new ResponseEntity<String>(new ObjectMapper().writeValueAsString(map), HttpStatus.BAD_REQUEST);
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	@RequestMapping(value="/users/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<String> getUserDetails(HttpServletRequest request, @PathVariable int id) {
		Map<String, Object> map = new HashMap<>();
		try {
			Users user = userBOIMP.getUserInfo(id);
			if (user != null) {
				map.put("response", "success");
				map.put("user", user);
				return new ResponseEntity<String>(new ObjectMapper().writeValueAsString(map), HttpStatus.ACCEPTED);
			} else {
				map.put("response", "failure");
				map.put("message", "No User found");
				return new ResponseEntity<String>(new ObjectMapper().writeValueAsString(map), HttpStatus.BAD_REQUEST);
			}
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping(value="/users", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<String> postUser(@RequestBody Users user) {
		System.out.println(user);
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> map = new HashMap<>();
		try {
			//map = mapper.readValue(user,  new TypeReference<Map<String, String>>());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
