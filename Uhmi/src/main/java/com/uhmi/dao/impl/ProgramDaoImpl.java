package com.uhmi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.uhmi.dao.AbstractDao;
import com.uhmi.dao.ProgramDao;
import com.uhmi.model.Program;

@Repository("programDao")
public class ProgramDaoImpl extends AbstractDao implements ProgramDao{
	
	@Override
	public void saveProgram(Program program) {
		persist(program);
	}

	@SuppressWarnings("unchecked")
	public List<Program> findAllPrograms() {
		
		List<Program> programs = new ArrayList<Program>();
		
		Criteria criteria = getSession().createCriteria(Program.class);
		programs = criteria.list();
		return programs;
	}

	@Override
	public void deleteProgramById(int id) {
		Query query = getSession().createSQLQuery("delete from Program where program_id = :id");
	    query.setInteger("id", id);
	    query.executeUpdate();
	}	
}
