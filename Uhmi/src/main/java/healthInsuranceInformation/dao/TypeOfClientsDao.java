package healthInsuranceInformation.dao;

import healthInsuranceInformation.table.TypeOfClients;

import java.sql.SQLException;
import java.util.List;

public interface TypeOfClientsDao {
	public void addTypeOfClients(TypeOfClients typeOfClients) throws SQLException;
	public void deleteTypeOfClients(TypeOfClients typeOfClients) throws SQLException;
	public TypeOfClients getTypeOfClients(int id)throws SQLException;
	public List<TypeOfClients> getTypesOfClients()throws SQLException;
}
