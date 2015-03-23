package com.uhmi.dao;

import java.util.List;

import com.uhmi.model.Company;

public interface CompanyDao {
	
	void saveCompany(Company company);
	
	Company getCompany(int id);
	
	List<Company> findAllCompanies();
	
	void deleteCompanyById(int id);
}
