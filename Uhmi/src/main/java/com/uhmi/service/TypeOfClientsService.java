package com.uhmi.service;

import java.util.List;

import com.uhmi.model.TypeOfClients;

public interface TypeOfClientsService {
		
	    void saveTypeOfClients(TypeOfClients typeOfClients);
	
		List<TypeOfClients> findAllTypesOfClients();
		
		void deleteTypeOfClientsById(int id);
}
