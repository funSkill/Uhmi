package com.uhmi.dao;

import java.util.List;

import com.uhmi.model.Program;

public interface ProgramDao {
	
	List<Program> findAllPrograms();
}
