package com.uhmi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uhmi.dao.TypeOfClientsDao;
import com.uhmi.model.TypeOfClients;
import com.uhmi.service.TypeOfClientsService;

@Service("typeOfClientsService")
@Transactional
public class TypeOfClientsServiceImpl implements TypeOfClientsService{

	@Override
	public void saveTypeOfClients(TypeOfClients typeOfClients) {
		dao.saveTypeOfClients(typeOfClients);	
	}
	
	@Autowired
	private TypeOfClientsDao dao;
	
	public List<TypeOfClients> findAllTypesOfClients() {
		return dao.findAllTypesOfClients();
	}

	@Override
	public void deleteTypeOfClientsById(int id) {
		dao.deleteTypeOfClientsById(id);		
	}	
}