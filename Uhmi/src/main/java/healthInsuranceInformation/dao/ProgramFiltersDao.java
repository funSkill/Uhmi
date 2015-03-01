package healthInsuranceInformation.dao;

import healthInsuranceInformation.table.ProgramFilters;

import java.sql.SQLException;
import java.util.List;

public interface ProgramFiltersDao {
	public void addProgramFilter(ProgramFilters programFilter) throws SQLException;
	public void deleteProgramFilter(ProgramFilters programFilter) throws SQLException;
	public ProgramFilters getProgramFilter(int id)throws SQLException;
	public List<ProgramFilters> getProgramFilters()throws SQLException;
}
