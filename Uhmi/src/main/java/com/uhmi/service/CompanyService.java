package com.uhmi.service;

import java.util.List;

import com.uhmi.model.Company;

public interface CompanyService {	
	
	void saveCompany(Company company);
	
	Company getCompany(int id);
	
	List<Company> findAllCompanies();
	
	void deleteCompanyById(int id);
}
