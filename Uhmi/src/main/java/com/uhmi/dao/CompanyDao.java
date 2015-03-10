package com.uhmi.dao;

import java.util.List;

import com.uhmi.model.Company;

public interface CompanyDao {
	
	List<Company> findAllCompanies();
}
