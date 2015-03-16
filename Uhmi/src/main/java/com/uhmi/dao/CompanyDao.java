package com.uhmi.dao;

import java.util.List;

import com.uhmi.model.Company;

public interface CompanyDao {
	
	void saveCompany(Company company);
	
	List<Company> findAllCompanies();
	
	void deleteCompanyById(int id);
}
