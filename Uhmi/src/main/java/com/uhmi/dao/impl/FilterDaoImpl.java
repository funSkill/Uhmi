package com.uhmi.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.uhmi.dao.AbstractDao;
import com.uhmi.dao.FilterDao;
import com.uhmi.model.Filter;

@Repository("filterDao")
public class FilterDaoImpl extends AbstractDao implements FilterDao {
	
	@SuppressWarnings("unchecked")
	public List<Filter> findAllFilters() {
		Criteria criteria = getSession().createCriteria(Filter.class);
		return (List<Filter>) criteria.list();
	}
}
