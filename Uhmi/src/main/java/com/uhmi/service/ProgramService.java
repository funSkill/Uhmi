package com.uhmi.service;

import java.util.List;

import com.uhmi.model.Program;

public interface ProgramService {
	
	void saveProgram(Program program);
	
	List<Program> findAllPrograms();
	
	void deleteProgramById(int id);
}
