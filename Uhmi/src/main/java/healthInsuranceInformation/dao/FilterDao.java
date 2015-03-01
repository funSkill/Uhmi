package healthInsuranceInformation.dao;

import healthInsuranceInformation.table.Filter;

import java.sql.SQLException;
import java.util.List;

public interface FilterDao {
	public void addFilter(Filter filter) throws SQLException;
	public void deleteFilter(Filter filter) throws SQLException;
	public Filter getFilter(int id)throws SQLException;
	public List<Filter> getFilters()throws SQLException;
}
