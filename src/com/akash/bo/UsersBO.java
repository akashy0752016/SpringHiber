package com.akash.bo;

import java.util.List;

import com.akash.bean.Users;

public interface UsersBO {
	//Get Users List
	public List<Users> getUsersList();
	//Get User Info by id
	public Users getUserInfo(int id);
	//Create New User
	public Users createUser(Users user);
	//Update User by user Id
	public Users updateUser(Users user, int id);
}
