package com.akash.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.akash.bean.UserRoles;
import com.akash.bean.Users;
import com.akash.bo.UserRolesBO;

public class UserRolesBOIMP implements UserRolesBO {
	
	@Autowired
	HibernateTemplate hibernateTemplateBean;
	
	@Override
	public List<UserRoles> getUsersRolesList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRoles getUserRolesInfo(int id) {
		// TODO Auto-generated method stub
		UserRoles userRole = hibernateTemplateBean.get(UserRoles.class, id);
		return userRole;
	}

	@Override
	public UserRoles createUserRoles(UserRoles userRole) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRoles updateUserRole(UserRoles userRole, int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
