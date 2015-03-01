package healthInsuranceInformation.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import healthInsuranceInformation.dao.ProgramFiltersDao;
import healthInsuranceInformation.table.ProgramFilters;
import healthInsuranceInformation.util.HibernateUtil;

public class ProgramFiltersDaoImpl implements ProgramFiltersDao {

	@Override
	public void addProgramFilter(ProgramFilters programFilter)throws SQLException {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(programFilter);
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
	public void deleteProgramFilter(ProgramFilters programFilter)throws SQLException {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(programFilter);
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
	public ProgramFilters getProgramFilter(int id) throws SQLException {
		ProgramFilters result = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (ProgramFilters) session.load(ProgramFilters.class, id);
			
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
	public List<ProgramFilters> getProgramFilters() throws SQLException {
		Session session = null;
		
		List<ProgramFilters> programFilters = new ArrayList<ProgramFilters>();		
		
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			programFilters = session.createCriteria(ProgramFilters.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null ) && (session.isOpen())){
				session.close();
			}
		}
		
		return programFilters;	
	}
}
