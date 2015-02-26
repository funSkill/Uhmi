package healthInsuranceInformation.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import healthInsuranceInformation.dao.TypeOfClientsDao;
import healthInsuranceInformation.table.TypeOfClients;
import healthInsuranceInformation.util.HibernateUtil;

public class TypeOfClientsDaoImpl implements TypeOfClientsDao {

	@Override
	public void addTypeOfClients(TypeOfClients typeOfClients)throws SQLException {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(typeOfClients);
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
	public void deleteTypeOfClients (TypeOfClients typeOfClients)throws SQLException {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(typeOfClients);
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
	public TypeOfClients getTypeOfClients(int id) throws SQLException {
		TypeOfClients result = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (TypeOfClients) session.load(TypeOfClients.class, id);
			
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
	public List<TypeOfClients> getTypesOfClients() throws SQLException {
		List<TypeOfClients> typesOfClients = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			typesOfClients = session.createCriteria(TypeOfClients.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null ) && (session.isOpen())){
				session.close();
			}
		}
		
		return typesOfClients;
	}
}