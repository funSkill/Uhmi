package com.uhmi.dao;

import java.util.List;

import com.uhmi.model.Filter;

public interface FilterDao {
	
	List<Filter> findAllFilters();
}
