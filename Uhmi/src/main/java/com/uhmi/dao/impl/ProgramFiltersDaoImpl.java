package com.uhmi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.uhmi.dao.AbstractDao;
import com.uhmi.dao.ProgramFiltersDao;
import com.uhmi.model.ProgramFilters;

@Repository("programFiltersDao")
public class ProgramFiltersDaoImpl extends AbstractDao implements ProgramFiltersDao {

	@SuppressWarnings("unchecked")
	public List<ProgramFilters> findAllProgramsFilters() {
		List<ProgramFilters> programsFilters = new ArrayList<ProgramFilters>();
		
		Criteria criteria = getSession().createCriteria(ProgramFilters.class);
		programsFilters = criteria.list();
		return programsFilters;
	}

	@Override
	public void deleteProgramFilterById(int id) {
		Query query = getSession().createSQLQuery("delete from program_filters where id = :id");
	    query.setInteger("id", id);
	    query.executeUpdate();
	}

	
}
