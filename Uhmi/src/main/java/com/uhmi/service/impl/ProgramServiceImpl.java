package com.uhmi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uhmi.dao.ProgramDao;
import com.uhmi.model.Program;
import com.uhmi.service.ProgramService;

@Service("programService")
@Transactional
public class ProgramServiceImpl implements ProgramService{

	@Override
	public void saveProgram(Program program) {
		dao.saveProgram(program);
	}
	
	 @Autowired
	 private ProgramDao dao;
	
	public List<Program> findAllPrograms() {
		return dao.findAllPrograms();
	}

	@Override
	public void deleteProgramById(int id) {
		dao.deleteProgramById(id);		
	}
}
