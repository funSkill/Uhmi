package healthInsuranceInformation.general;

import healthInsuranceInformation.dao.CompanyDao;
import healthInsuranceInformation.dao.FilterDao;
import healthInsuranceInformation.dao.ProgramDao;
import healthInsuranceInformation.dao.ProgramFiltersDao;
import healthInsuranceInformation.dao.TypeOfClientsDao;
import healthInsuranceInformation.dao.impl.CompanyDaoImpl;
import healthInsuranceInformation.dao.impl.FilterDaoImpl;
import healthInsuranceInformation.dao.impl.ProgramDaoImpl;
import healthInsuranceInformation.dao.impl.ProgramFiltersDaoImpl;
import healthInsuranceInformation.dao.impl.TypeOfClientsDaoImpl;

public class Factory {
	public static Factory instance = new Factory();
	public CompanyDao companyDao;
	public TypeOfClientsDao typeOfClientsDao;
	public ProgramDao programDao;
	public FilterDao filterDao;
	public ProgramFiltersDao programFiltersDao; 
	
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
	
	public ProgramDao getProgramDao(){
		if(programDao == null){
			programDao = new ProgramDaoImpl();
		}
		return programDao;
	}
	
	public FilterDao getFilterDao(){
		if(filterDao == null){
			filterDao = new FilterDaoImpl();
		}
		return filterDao;
	}
	
	public ProgramFiltersDao getProgramFiltersDao(){
		if(programFiltersDao == null){
			programFiltersDao = new ProgramFiltersDaoImpl();
		}
		return programFiltersDao;
	}
}
