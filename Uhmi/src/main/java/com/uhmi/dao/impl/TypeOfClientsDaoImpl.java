package com.uhmi.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.uhmi.dao.AbstractDao;
import com.uhmi.dao.TypeOfClientsDao;
import com.uhmi.model.TypeOfClients;

@Repository("typeOfClientsDao")
public class TypeOfClientsDaoImpl extends AbstractDao implements TypeOfClientsDao{

	@Override
	public void saveTypeOfClients(TypeOfClients typeOfClients) {
		persist(typeOfClients);	
	}
	
	@SuppressWarnings("unchecked")
	public List<TypeOfClients> findAllTypesOfClients() {
		Criteria criteria = getSession().createCriteria(TypeOfClients.class);
		return (List<TypeOfClients>) criteria.list();
	}

	@Override
	public void deleteTypeOfClientsById(int id) {
		Query query = getSession().createSQLQuery("delete from type_of_clients where type_of_clients_id = :id");
	    query.setInteger("id", id);
	    query.executeUpdate();
	}
}
