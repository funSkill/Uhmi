package com.uhmi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.uhmi.dao.ProgramFiltersDao;
import com.uhmi.model.ProgramFilters;
import com.uhmi.service.ProgramFiltersService;

@Service("programFiltersService")
@Transactional
public class ProgramFiltersServiceImpl implements ProgramFiltersService {

	@Autowired
	 private ProgramFiltersDao dao;
	
	public List<ProgramFilters> findAllProgramsFilters() {
		return dao.findAllProgramsFilters();
	}

	@Override
	public void deleteProgramFilterById(int id) {
		dao.deleteProgramFilterById(id);		
	}
}
