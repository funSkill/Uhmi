package healthInsuranceInformation.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import healthInsuranceInformation.dao.CompanyDao;
import healthInsuranceInformation.table.Company;
import healthInsuranceInformation.util.HibernateUtil;

public class CompanyDaoImpl implements CompanyDao {

	@Override
	public void addCompany(Company company) throws SQLException {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(company);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null ) && (session.isOpen())){
				session.close();
			}
		}
	}

	@Override
	public void deleteCompany(Company company) throws SQLException {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(company);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null ) && (session.isOpen())){
				session.close();
			}
		}		
	}

	@Override
	public Company getCompany(int id) throws SQLException {
		Company result = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (Company) session.load(Company.class, id);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null ) && (session.isOpen())){
				session.close();
			}
		}
		
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Company> getCompanies() throws SQLException {
		List<Company> companies = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			companies = session.createCriteria(Company.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null ) && (session.isOpen())){
				session.close();
			}
		}
		
		return companies;
	}	
}