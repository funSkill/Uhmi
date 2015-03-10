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
	
	public List<Company> findAllCompanies() {
		return dao.findAllCompanies();
	}
}
