package com.uhmi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.uhmi.dao.AbstractDao;
import com.uhmi.dao.ProgramDao;
import com.uhmi.model.Program;

@Repository("programDao")
public class ProgramDaoImpl extends AbstractDao implements ProgramDao{

	@SuppressWarnings("unchecked")
	public List<Program> findAllPrograms() {
		
		List<Program> programs = new ArrayList<Program>();
		
		Criteria criteria = getSession().createCriteria(Program.class);
		programs = criteria.list();
		return programs;
	}
}
