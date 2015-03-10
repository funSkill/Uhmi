package com.uhmi.dao;

import java.util.List;

import com.uhmi.model.ProgramFilters;

public interface ProgramFiltersDao {
	
	List<ProgramFilters> findAllProgramsFilters();
}
