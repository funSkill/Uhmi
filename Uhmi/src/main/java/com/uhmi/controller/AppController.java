package com.uhmi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonView;
import com.uhmi.jackson.View;
import com.uhmi.model.Company;
import com.uhmi.model.Filter;
import com.uhmi.model.Program;
import com.uhmi.model.ProgramFilters;
import com.uhmi.model.TypeOfClients;
import com.uhmi.service.CompanyService;
import com.uhmi.service.FilterService;
import com.uhmi.service.ProgramFiltersService;
import com.uhmi.service.ProgramService;
import com.uhmi.service.TypeOfClientsService;

@Controller
@RequestMapping("/")
public class AppController {
	
	/*
	 * This method will provide to show administrator panel.
	 */
	@RequestMapping(value = { "/administrator" }, method = RequestMethod.GET)
	public String showAdminPage(ModelMap model) {
		return "admin_panel";
	}
	
	/*
	 * This method will provide to show administrator panel.
	 */
	@RequestMapping(value = { "/programs-filter" }, method = RequestMethod.GET)
	public String showProgramsFilter(ModelMap model) {
		return "singlepage";
	}
	

	@Autowired
	CompanyService companyService;
	
	/*
	 * This method will list all existing companies.
	 */
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String listCompanies(ModelMap model) {
		List<Company> companies = companyService.findAllCompanies();
		model.addAttribute("companies", companies);
		return "index";
	}	

	/*
	 * This method get current company by id.
	 */
	@RequestMapping(value = { "{id}" }, method = RequestMethod.GET)
    public String getCompany(ModelMap model, @PathVariable int id) {
    	Company company = companyService.getCompany(id);
		model.addAttribute("company", company);
        return "singlepage";
	}
	
	/*
	 * This method will list all existing companies.
	 */
	@RequestMapping(value = { "/companies" }, method = RequestMethod.GET)
	public String listComps(ModelMap model) {
		List<Company> companies = companyService.findAllCompanies();
		model.addAttribute("companies", companies);
		return "all_companies";
	}	
	
	
	/*
	 * This method will provide the medium to add a new company.
	 */
	@RequestMapping(value = { "/new-company" }, method = RequestMethod.GET)
	public String newCompany(ModelMap model) {
		Company company = new Company();
		model.addAttribute("company", company);
		return "newCompanyForm";
	}
	
	/*
	 * This method will be called on form submission, handling POST request for
	 * saving employee in database.
	 */
	@RequestMapping(value = { "/new-company" }, method = RequestMethod.POST)
	public String saveCompany(Company company, ModelMap model) {

		companyService.saveCompany(company);

		model.addAttribute("success", "Company " + company.getName()
				+ " registered successfully");
		model.addAttribute("linkToAllElems","/companies");
		model.addAttribute("nameElems","All Companies");
		return "success";
	}
	
	
	/*
     * This method will delete an company by it's id value.
     */
    @RequestMapping(value = { "/delete-{id}-company" }, method = RequestMethod.GET)
    public String deleteCompany(@PathVariable int id) {
    	companyService.deleteCompanyById(id);
        return "redirect:/companies";
    }
	
	
	@Autowired
	TypeOfClientsService tofcService;
	
	/*
	 * This method will list all existing types of clients.
	 */
	@RequestMapping(value = {"/types-of-clients" }, method = RequestMethod.GET)
	public String listTypesOfClients(ModelMap model) {

		List<TypeOfClients> typesOfClients= tofcService.findAllTypesOfClients();
		model.addAttribute("typesOfClients", typesOfClients);
		return "all_types_of_clients";
	}
	
	/*
	 * This method will provide the medium to add a new type of clients.
	 */
	@RequestMapping(value = { "/new-type-of-clients" }, method = RequestMethod.GET)
	public String newTypeOfClients(ModelMap model) {
		TypeOfClients toc = new TypeOfClients();
		model.addAttribute("toc", toc);
		return "newTypeOfClients";
	}
	
	/*
	 * This method will be called on form submission, handling POST request for
	 * saving type of clients in database.
	 */
	@RequestMapping(value = { "/new-type-of-clients" }, method = RequestMethod.POST)
	public String saveTypeOfClients(TypeOfClients typeOfClients, ModelMap model) {

		tofcService.saveTypeOfClients(typeOfClients);

		model.addAttribute("success", "TypeOfClients" + typeOfClients.getName()
				+ " registered successfully");
		model.addAttribute("linkToAllElems","/types-of-clients");
		model.addAttribute("nameElems","All Types Of Clients");
		return "success";
	}
	
	/*
     * This method will delete an types-of-clients by it's id value.
     */
    @RequestMapping(value = { "/delete-{id}-types-of-clients" }, method = RequestMethod.GET)
    public String deleteTypesOfClients(@PathVariable int id) {
    	tofcService.deleteTypeOfClientsById(id);
        return "redirect:/types-of-clients";
    }
	
	
	@Autowired
	ProgramService programService;
	
	/*
	 * This method will list all existing programs.
	 */
	@RequestMapping(value = {"/programs" }, method = RequestMethod.GET)
	public String listProgs(ModelMap model) {
		List<Program> programs= programService.findAllPrograms();
		model.addAttribute("programs", programs);
		return "all_programs";
	}
	
	/*
	 * This method will list all existing programs in xml.
	 */
	@JsonView(View.Summary.class)
	@RequestMapping(value = "/programsdata", method = RequestMethod.GET)
    @ResponseBody
    public List<Program> getProgs() {
        return programService.findAllPrograms();
    }
	
	/*
	 * This method will provide the medium to add a new program.
	 */
	@RequestMapping(value = { "/new-program" }, method = RequestMethod.GET)
	public String newProgram(ModelMap model) {
		Program program = new Program();
		model.addAttribute("program", program);
		return "newProgramForm";
	}
	
	/*
	 * This method will be called on form submission, handling POST request for
	 * saving employee in database.
	 */
	@RequestMapping(value = { "/new-program" }, method = RequestMethod.POST)
	public String saveProgram(Program program, ModelMap model) {

		programService.saveProgram(program);

		model.addAttribute("success", "Program " + program.getProgramName() 
				+ program.getCompany().getName()
				+ program.getTypeOfClients().getName()
				+ " registered successfully");
		model.addAttribute("linkToAllElems","/programs");
		model.addAttribute("nameElems","All Programs");
		return "success";
	}
	
	/*
     * This method will delete an program by it's id value.
     */
    @RequestMapping(value = { "/delete-{id}-program" }, method = RequestMethod.GET)
    public String deleteProgram(@PathVariable int id) {
    	programService.deleteProgramById(id);;
        return "redirect:/programs";
    }
	
	
	@Autowired
	FilterService filterService;

	/*
	 * This method will list all existing filters.
	 */
	@RequestMapping(value = {"/filters" }, method = RequestMethod.GET)
	public String listFilters(ModelMap model) {

		List<Filter> filters = filterService.findAllFilters();
		model.addAttribute("filters", filters);
		return "all_filters";
	}
	
	/*
     * This method will delete an filter by it's id value.
     */
    @RequestMapping(value = { "/delete-{id}-filter" }, method = RequestMethod.GET)
    public String deleteFilter(@PathVariable int id) {
    	filterService.deleteFilterById(id);
        return "redirect:/filters";
    }
	
	
	@Autowired
	ProgramFiltersService programFService;
	
	/*
	 * This method will list all existing programs-filters.
	 */
	@RequestMapping(value = {"/programs-filters" }, method = RequestMethod.GET)
	public String listProgramsFilters(ModelMap model) {

		List<ProgramFilters> programsFilters= programFService.findAllProgramsFilters();
		model.addAttribute("programsFilters", programsFilters);
		return "all_programs_filters";
	}
	
	/*
     * This method will delete an program-filter by it's id value.
     */
    @RequestMapping(value = { "/delete-{id}-program-filter" }, method = RequestMethod.GET)
    public String deleteProgramFilter(@PathVariable int id) {
    	programFService.deleteProgramFilterById(id);
        return "redirect:/programs-filters";
    }
}
