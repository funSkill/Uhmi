package com.uhmi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uhmi.dao.FilterDao;
import com.uhmi.model.Filter;
import com.uhmi.service.FilterService;

@Service("filterService")
@Transactional
public class FilterServiceImpl implements FilterService{

	@Autowired
	private FilterDao dao;
	
	public List<Filter> findAllFilters() {
		return dao.findAllFilters();
	}	
}
