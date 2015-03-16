package com.uhmi.dao;

import java.util.List;

import com.uhmi.model.TypeOfClients;

public interface TypeOfClientsDao {
	
	void saveTypeOfClients(TypeOfClients typeOfClients);
	
	List<TypeOfClients> findAllTypesOfClients();	
	
	void deleteTypeOfClientsById(int id);
}
