package healthInsuranceInformation.general;

import healthInsuranceInformation.dao.CompanyDao;
import healthInsuranceInformation.dao.TypeOfClientsDao;
import healthInsuranceInformation.dao.impl.CompanyDaoImpl;
import healthInsuranceInformation.dao.impl.TypeOfClientsDaoImpl;

public class Factory {
	public static Factory instance = new Factory();
	public CompanyDao companyDao;
	public TypeOfClientsDao typeOfClientsDao;
	
	private Factory(){}
	
	public static Factory getInstance(){
		return Factory.instance;
	}
	
	public CompanyDao getCompanyDao(){
		if(companyDao == null){
			companyDao = new CompanyDaoImpl();
		}
		return companyDao;
	}
	
	public TypeOfClientsDao getTypeOfClientsDao(){
		if(typeOfClientsDao == null){
			typeOfClientsDao = new TypeOfClientsDaoImpl();
		}
		return typeOfClientsDao;
	}
	
}
