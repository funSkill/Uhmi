package healthInsuranceInformation.dao;

import healthInsuranceInformation.table.Company;

import java.sql.SQLException;
import java.util.List;

public interface CompanyDao {
	public void addCompany(Company company) throws SQLException;
	public void deleteCompany(Company company) throws SQLException;
	public Company getCompany(int id)throws SQLException;
	public List<Company> getCompanies()throws SQLException;
}
