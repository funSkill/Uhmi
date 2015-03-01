package healthInsuranceInformation.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import healthInsuranceInformation.dao.ProgramDao;
import healthInsuranceInformation.table.Program;
import healthInsuranceInformation.util.HibernateUtil;

public class ProgramDaoImpl implements ProgramDao {

	@Override
	public void addProgram(Program program) throws SQLException {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(program);
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
	public void deleteProgram(Program program) throws SQLException {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(program);
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
	public Program getProgram(int id) throws SQLException {
		Program result = null;
		
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (Program) session.load(Program.class, id);
			
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
	public List<Program> getPrograms() throws SQLException {
		Session session = null;
		
		List<Program> programs = new ArrayList<Program>();		
		
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			programs = session.createCriteria(Program.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if((session != null ) && (session.isOpen())){
				session.close();
			}
		}
		
		return programs;	
	}
}
