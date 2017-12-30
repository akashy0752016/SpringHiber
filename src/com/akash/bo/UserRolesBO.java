package com.akash.bo;

import java.util.List;

import com.akash.bean.UserRoles;

public interface UserRolesBO {
	//Get Users Roles List
	public List<UserRoles> getUsersRolesList();
	//Get User Info by id
	public UserRoles getUserRolesInfo(int id);
	//Create New User
	public UserRoles createUserRoles(UserRoles userRole);
	//Update User by user Id
	public UserRoles updateUserRole(UserRoles userRole, int id);
}
