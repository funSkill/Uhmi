package com.uhmi.dao;

import java.util.List;

import com.uhmi.model.Program;

public interface ProgramDao {
	
	void saveProgram(Program program);
	
	List<Program> findAllPrograms();
	
	void deleteProgramById(int id);
}
