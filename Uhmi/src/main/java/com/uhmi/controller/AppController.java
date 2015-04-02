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
import com.uhmi.model.Program;
import com.uhmi.service.CompanyService;
import com.uhmi.service.ProgramService;


@Controller
@RequestMapping("/")
public class AppController {
	
	/*
	 * This method will provide to show singlepage.
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
	
	
	@Autowired
	ProgramService programService;
	
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
     * This method will provide to show logIn page.
     */    
    @RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public String auth(ModelMap model) {
		return "login";
	}
}
