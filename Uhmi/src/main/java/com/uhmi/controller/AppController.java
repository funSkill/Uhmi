package com.uhmi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

	@Autowired
	CompanyService companyService;

	/*
	 * This method will list all existing companies.
	 */
	@RequestMapping(value = {"/companies" }, method = RequestMethod.GET)
	public String listCompanies(ModelMap model) {

		List<Company> companies = companyService.findAllCompanies();
		model.addAttribute("companies", companies);
		return "all_companies";
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
	
	
	@Autowired
	ProgramService programService;
	
	/*
	 * This method will list all existing programs.
	 */
	@RequestMapping(value = {"/programs" }, method = RequestMethod.GET)
	public String listPrograms(ModelMap model) {

		List<Program> programs= programService.findAllPrograms();
		model.addAttribute("programs", programs);
		return "all_programs";
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
}
