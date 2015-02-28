package healthInsuranceInformation.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "programs")
public class Program {
	@Id
	@Column(name = "program_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	  
	@JoinColumn(name = "company_id", referencedColumnName = "company_id")
	private Company company;
	
	@JoinColumn(name = "type_of_clients_id", referencedColumnName = "type_of_clients_id")
	private TypeOfClients typeOfClients;
	
	@Column(name = "program_name")
	private String programName;
	
	@Column(name = "insurer")
	private String insurer;
	
	@Column(name = "age")
	private String age;
	
	@Column(name = "additional_insurer_requirements")
	private String additionalInsurerRequirements;
	
	@Column(name = "insurance_amount")
	private String insuranceAmount;
	
	@Column(name = "insurance_tariff")
	private String insuranceTariff;
	
	@Column(name = "insurance_payment")
	private String insurancePayment;
	
	@Column(name = "risks")
	private String risks;
	
	@Column(name = "medical_institutions")
	private String medicalInstitutions;
	
	@Column(name = "franchise")
	private String franchise;
	
	@Column(name = "method_of_payment")
	private String methodOfPayment;
	
	@Column(name = "territory")
	private String territory;
	
	@Column(name = "period_of_validity")
	private String periodOfValidity;
	
	@Column(name = "required_documents")
	private String requiredDocuments;
	
	@Column(name = "availability_service_assistance")
	private String availabilityServiceAssistance;
	
	@Column(name = "previous_medical_examination")
	private String previousMedicalExamination;
	
	@Column(name = "sample_polis")
	private String samplePolis;
	
	@Column(name = "program_consist")
	private String programConsist;
	
	@Column(name = "dentistry")
	private String dentistry;
	
	@Column(name = "discounts")
	private String discounts;
	
	@Column(name = "special_conditions_particular_insurer")
	private String specialConditionsParticularInsurer;
	
	@Column(name = "insurance_benefits")
	private String insuranceBenefits;
	
	@Column(name = "additionally")
	private String additionally;
	
	@Column(name = "insured_event")
	private String insuredEvent;

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
	
	@Override
    public String toString() {
        return "Program[ id= " + id + ", programName= " + programName + ", company= " + company.getName() + ", typeOfClients= " + typeOfClients.getName() + " ]";
    }
}
