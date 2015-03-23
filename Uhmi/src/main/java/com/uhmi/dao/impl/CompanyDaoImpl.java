package com.uhmi.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.uhmi.dao.AbstractDao;
import com.uhmi.dao.CompanyDao;
import com.uhmi.model.Company;

@Repository("companyDao")
public class CompanyDaoImpl extends AbstractDao implements CompanyDao{
	
	@Override
	public void saveCompany(Company company) {
		persist(company);		
	}
	
	@Override
	public Company getCompany(int id) {
		Company result = null;
		result = (Company) getSession().get(Company.class, id);
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public List<Company> findAllCompanies() {
		Criteria criteria = getSession().createCriteria(Company.class);
		return (List<Company>) criteria.list();
	}

	@Override
	public void deleteCompanyById(int id) {
		Query query = getSession().createSQLQuery("delete from Company where company_id = :id");
	    query.setInteger("id", id);
	    query.executeUpdate();
	}	
}
