package com.uhmi.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.uhmi.dao.AbstractDao;
import com.uhmi.dao.TypeOfClientsDao;
import com.uhmi.model.TypeOfClients;

@Repository("typeOfClientsDao")
public class TypeOfClientsDaoImpl extends AbstractDao implements TypeOfClientsDao{
	
	@SuppressWarnings("unchecked")
	public List<TypeOfClients> findAllTypesOfClients() {
		Criteria criteria = getSession().createCriteria(TypeOfClients.class);
		return (List<TypeOfClients>) criteria.list();
	}
}
