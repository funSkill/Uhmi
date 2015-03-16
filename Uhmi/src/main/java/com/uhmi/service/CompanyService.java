package com.uhmi.service;

import java.util.List;

import com.uhmi.model.Company;

public interface CompanyService {	
	
	void saveCompany(Company company);
	
	List<Company> findAllCompanies();
	
	void deleteCompanyById(int id);
}
