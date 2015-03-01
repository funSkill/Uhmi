package healthInsuranceInformation.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import healthInsuranceInformation.dao.FilterDao;
import healthInsuranceInformation.table.Filter;
import healthInsuranceInformation.util.HibernateUtil;

public class FilterDaoImpl implements FilterDao {

	@Override
	public void addFilter(Filter filter) throws SQLException {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(filter);
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
	public void deleteFilter(Filter filter) throws SQLException {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(filter);
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
	public Filter getFilter(int id) throws SQLException {
		Filter result = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (Filter) session.load(Filter.class, id);
			
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
	public List<Filter> getFilters() throws SQLException {
		List<Filter> filters = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			filters = session.createCriteria(Filter.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null ) && (session.isOpen())){
				session.close();
			}
		}
		
		return filters;
	}

}
