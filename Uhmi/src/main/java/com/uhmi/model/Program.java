package com.uhmi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;
import com.uhmi.jackson.View;

@Entity
@Table(name = "program")
public class Program {
	
	@Id
	@Column(name = "program_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonView(View.Summary.class)
	private int id;
	
	@ManyToOne  
	@JoinColumn(name ="company_id")
	@JsonView(View.Summary.class)
	private Company company;
	
	@ManyToOne  
	@JoinColumn(name ="type_of_clients_id")
	@JsonView(View.Summary.class)
	private TypeOfClients typeOfClients;
	
	@Column(name = "program_name")
	@JsonView(View.Summary.class)
	private String programName;
	
	@Column(name = "insurer")
	@JsonView(View.Summary.class)
	private String insurer;
	
	@Column(name = "age")
	@JsonView(View.Summary.class)
	private String age;
	
	@Column(name = "additional_insurer_requirements")
	@JsonView(View.Summary.class)
	private String additionalInsurerRequirements;
	
	@Column(name = "insurance_amount")
	@JsonView(View.Summary.class)
	private String insuranceAmount;
	
	@Column(name = "insurance_tariff")
	@JsonView(View.Summary.class)
	private String insuranceTariff;
	
	@Column(name = "insurance_payment")
	@JsonView(View.Summary.class)
	private String insurancePayment;
	
	@Column(name = "risks")
	@JsonView(View.Summary.class)
	private String risks;
	
	@Column(name = "medical_institutions")
	@JsonView(View.Summary.class)
	private String medicalInstitutions;
	
	@Column(name = "franchise")
	@JsonView(View.Summary.class)
	private String franchise;
	
	@Column(name = "method_of_payment")
	@JsonView(View.Summary.class)
	private String methodOfPayment;
	
	@Column(name = "territory")
	@JsonView(View.Summary.class)
	private String territory;
	
	@Column(name = "period_of_validity")
	@JsonView(View.Summary.class)
	private String periodOfValidity;
	
	@Column(name = "required_documents")
	@JsonView(View.Summary.class)
	private String requiredDocuments;
	
	@Column(name = "availability_service_assistance")
	@JsonView(View.Summary.class)
	private String availabilityServiceAssistance;
	
	@Column(name = "previous_medical_examination")
	@JsonView(View.Summary.class)
	private String previousMedicalExamination;
	
	@Column(name = "sample_polis")
	@JsonView(View.Summary.class)
	private String samplePolis;
	
	@Column(name = "program_consist")
	@JsonView(View.Summary.class)
	private String programConsist;
	
	@Column(name = "dentistry")
	@JsonView(View.Summary.class)
	private String dentistry;
	
	@Column(name = "discounts")
	@JsonView(View.Summary.class)
	private String discounts;
	
	@Column(name = "special_conditions_particular_insurer")
	@JsonView(View.Summary.class)
	private String specialConditionsParticularInsurer;
	
	@Column(name = "insurance_benefits")
	@JsonView(View.Summary.class)
	private String insuranceBenefits;
	
	@Column(name = "additionally")
	@JsonView(View.Summary.class)
	private String additionally;
	
	@Column(name = "insured_event")
	@JsonView(View.Summary.class)
	private String insuredEvent;
	
	@ManyToOne  
	@JoinColumn(name ="filters")
	@JsonView(View.Summary.class)
	private FilterList filterList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	public TypeOfClients getTypeOfClients() {
		return typeOfClients;
	}

	public void setTypeOfClients(TypeOfClients typeOfClients) {
		this.typeOfClients = typeOfClients;
	}
	
	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getInsurer() {
		return insurer;
	}

	public void setInsurer(String insurer) {
		this.insurer = insurer;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAdditionalInsurerRequirements() {
		return additionalInsurerRequirements;
	}

	public void setAdditionalInsurerRequirements(String additionalInsurerRequirements) {
		this.additionalInsurerRequirements = additionalInsurerRequirements;
	}

	public String getInsuranceAmount() {
		return insuranceAmount;
	}

	public void setInsuranceAmount(String insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}

	public String getInsuranceTariff() {
		return insuranceTariff;
	}

	public void setInsuranceTariff(String insuranceTariff) {
		this.insuranceTariff = insuranceTariff;
	}

	public String getInsurancePayment() {
		return insurancePayment;
	}

	public void setInsurancePayment(String insurancePayment) {
		this.insurancePayment = insurancePayment;
	}

	public String getRisks() {
		return risks;
	}

	public void setRisks(String risks) {
		this.risks = risks;
	}

	public String getMedicalInstitutions() {
		return medicalInstitutions;
	}

	public void setMedicalInstitutions(String medicalInstitutions) {
		this.medicalInstitutions = medicalInstitutions;
	}

	public String getFranchise() {
		return franchise;
	}

	public void setFranchise(String franchise) {
		this.franchise = franchise;
	}

	public String getMethodOfPayment() {
		return methodOfPayment;
	}

	public void setMethodOfPayment(String methodOfPayment) {
		this.methodOfPayment = methodOfPayment;
	}

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	public String getPeriodOfValidity() {
		return periodOfValidity;
	}

	public void setPeriodOfValidity(String periodOfValidity) {
		this.periodOfValidity = periodOfValidity;
	}

	public String getRequiredDocuments() {
		return requiredDocuments;
	}

	public void setRequiredDocuments(String requiredDocuments) {
		this.requiredDocuments = requiredDocuments;
	}

	public String getAvailabilityServiceAssistance() {
		return availabilityServiceAssistance;
	}

	public void setAvailabilityServiceAssistance(
			String availabilityServiceAssistance) {
		this.availabilityServiceAssistance = availabilityServiceAssistance;
	}

	public String getPreviousMedicalExamination() {
		return previousMedicalExamination;
	}

	public void setPreviousMedicalExamination(String previousMedicalExamination) {
		this.previousMedicalExamination = previousMedicalExamination;
	}

	public String getSamplePolis() {
		return samplePolis;
	}

	public void setSamplePolis(String samplePolis) {
		this.samplePolis = samplePolis;
	}

	public String getProgramConsist() {
		return programConsist;
	}

	public void setProgramConsist(String programConsist) {
		this.programConsist = programConsist;
	}

	public String getDentistry() {
		return dentistry;
	}

	public void setDentistry(String dentistry) {
		this.dentistry = dentistry;
	}

	public String getDiscounts() {
		return discounts;
	}

	public void setDiscounts(String discounts) {
		this.discounts = discounts;
	}

	public String getSpecialConditionsParticularInsurer() {
		return specialConditionsParticularInsurer;
	}

	public void setSpecialConditionsParticularInsurer(
			String specialConditionsParticularInsurer) {
		this.specialConditionsParticularInsurer = specialConditionsParticularInsurer;
	}

	public String getInsuranceBenefits() {
		return insuranceBenefits;
	}

	public void setInsuranceBenefits(String insuranceBenefits) {
		this.insuranceBenefits = insuranceBenefits;
	}

	public String getAdditionally() {
		return additionally;
	}

	public void setAdditionally(String additionally) {
		this.additionally = additionally;
	}

	public String getInsuredEvent() {
		return insuredEvent;
	}

	public void setInsuredEvent(String insuredEvent) {
		this.insuredEvent = insuredEvent;
	}
	
	public FilterList getFilterList() {
		return filterList;
	}

	public void setFilterList(FilterList filterList) {
		this.filterList = filterList;
	}
	
	@Override
    public String toString() {
        return "Program[ id= " + id + " ]";
    }
}