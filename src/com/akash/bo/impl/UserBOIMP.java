package com.akash.bo.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.akash.bean.Users;
import com.akash.bo.UsersBO;

public class UserBOIMP implements UsersBO {
	
	@Autowired
	HibernateTemplate hibernateTemplateBean;
	
	@Override
	public List<Users> getUsersList() {
		// TODO Auto-generated method stub
		List<Users> list = null;
		try {
			list= hibernateTemplateBean.loadAll(Users.class);
			//System.out.println(list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Users getUserInfo(int id) {
		// TODO Auto-generated method stub
		Users user = hibernateTemplateBean.get(Users.class, id);
		return user;
	}

	@Override
	public Users createUser(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users updateUser(Users user, int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
