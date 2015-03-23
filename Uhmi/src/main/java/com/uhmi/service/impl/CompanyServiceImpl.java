package com.uhmi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uhmi.dao.CompanyDao;
import com.uhmi.model.Company;
import com.uhmi.service.CompanyService;

@Service("companyService")
@Transactional
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyDao dao;
	
	@Override
	public void saveCompany(Company company) {
		dao.saveCompany(company);
	}
	
	@Override
	public Company getCompany(int id) {		
		return dao.getCompany(id);
	}
	
	public List<Company> findAllCompanies() {
		return dao.findAllCompanies();
	}

	@Override
	public void deleteCompanyById(int id) {
		dao.deleteCompanyById(id);		
	}	
}
