package com.akash.bo.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.akash.bean.Country;
import com.akash.bean.Users;
import com.akash.bo.CountryBO;

public class CountryBOIMP implements CountryBO {
	
	@Autowired
	HibernateTemplate hibernateTemplateBean;
	
	@Autowired
	SessionFactory sessionFactoryBean;

	@Override
	public List<Country> getCountryList() {
		// TODO Auto-generated method stub
		Session session = sessionFactoryBean.openSession();
		Query q = session.createQuery("from Country");
		List<Country> list = null;
		list = q.list();
		session.close();
		return list;
	}

	@Override
	public Country getCountryInfo(int id) {
		// TODO Auto-generated method stub
		//Country country = hibernateTemplateBean.get(Country.class, id);
		return null;
	}

	@Override
	public Country createCountry(Country country) {
		// TODO Auto-generated method stub
		Session session = sessionFactoryBean.openSession();
		List<Country> list = null;
		Criteria criteria = session.createCriteria(Country.class);
		list = criteria.add(Restrictions.or(Restrictions.eq("id", country.getId()), Restrictions.like("country", country.getCountry()))).list();
		System.out.println(list.size());
		//System.out.println(list.get(0).getCountry());
		if (list.size() > 0) {
			session.close();
			return list.get(0);
		} else {
			Integer res = (Integer) hibernateTemplateBean.save(country);
			if (res > 0) {
				list = criteria.add(Restrictions.eq("id", res)).list();
				session.close();
				return list.get(0);
			} else {
				return null;
			}
		}
	}

	@Override
	public Country updateCountry(Country country, int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
