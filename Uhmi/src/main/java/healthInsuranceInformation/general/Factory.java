package healthInsuranceInformation.general;

import healthInsuranceInformation.dao.CompanyDao;
import healthInsuranceInformation.dao.impl.CompanyDaoImpl;

public class Factory {
	public static Factory instance = new Factory();
	public CompanyDao companyDao;
	
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
	
}
