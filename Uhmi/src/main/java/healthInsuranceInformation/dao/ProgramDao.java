package healthInsuranceInformation.dao;

import healthInsuranceInformation.table.Program;

import java.sql.SQLException;
import java.util.List;

public interface ProgramDao {
	public void addProgram(Program program) throws SQLException;
	public void deleteProgram(Program program) throws SQLException;
	public Program getProgram(int id)throws SQLException;
	public List<Program> getPrograms()throws SQLException;
}
