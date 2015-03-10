package com.uhmi.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.uhmi.dao.AbstractDao;
import com.uhmi.dao.CompanyDao;
import com.uhmi.model.Company;

@Repository("companyDao")
public class CompanyDaoImpl extends AbstractDao implements CompanyDao{
	
	@SuppressWarnings("unchecked")
	public List<Company> findAllCompanies() {
		Criteria criteria = getSession().createCriteria(Company.class);
		return (List<Company>) criteria.list();
	}
}
