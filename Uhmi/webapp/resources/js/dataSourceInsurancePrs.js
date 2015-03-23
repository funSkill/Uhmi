function getPrograms() {
	var data = [];
	
	$.ajax({		
        url : 'programsdata',
        async: false,
        success : function(xml){
			xmlParser(xml);        	  
        }
    });
	
	function xmlParser(xml){		
		var elems = $(xml).children("ArrayList");
		 $(elems).children("item").each(function(){
			 var programData = {};
			 programData.id = $(this).children("id").text();
			 programData.company = getCompanyName($(this).children("company"));
			 programData.clients = getTipeOfClientsName($(this).children("typeOfClients"));
			 programData.program = $(this).children("program").text();
			 programData.insurer = $(this).children("insurer").text();
			 programData.age = $(this).children("age").text();
			 programData.additionalInsurerRequirements = $(this).children("additionalInsurerRequirements").text();
			 programData.insuranceAmount = $(this).children("insuranceAmount").text();
			 programData.insuranceTariff = $(this).children("insuranceTariff").text();
			 programData.insurancePayment = $(this).children("insurancePayment").text();
			 programData.risks = $(this).children("risks").text();
			 programData.medicalInstitutions = $(this).children("medicalInstitutions").text();
			 programData.franchise = $(this).children("franchise").text();
			 programData.methodOfPayment = $(this).children("methodOfPayment").text();
			 programData.territory = $(this).children("territory").text();
			 programData.periodOfValidity = $(this).children("periodOfValidity").text();
			 programData.requiredDocuments = $(this).children("requiredDocuments").text();
			 programData.availabilityServiceAssistance = $(this).children("availabilityServiceAssistance").text();
			 programData.previousMedicalExamination = $(this).children("previousMedicalExamination").text();
			 programData.samplePolis = $(this).children("samplePolis").text();
			 programData.programConsist = $(this).children("programConsist").text();
			 programData.dentistry = $(this).children("dentistry").text();
			 programData.discounts = $(this).children("discounts").text();
			 programData.specialConditionsParticularInsurer = $(this).children("specialConditionsParticularInsurer").text();
			 programData.hotLine = $(this).children("hotLine").text();
			 programData.insuranceBenefits = $(this).children("insuranceBenefits").text();
			 programData.additionally = $(this).children("additionally").text();
			 programData.insuredEvent = $(this).children("insuredEvent").text();
			 programData.filters = { age: getFilters($(this).children("filterList"), "age"),
					 				 insurancePayment: getFilters($(this).children("filterList"), "insurancePayment"),
									 medicalInstitutions: getFilters($(this).children("filterList"), "medicalInstitutions"),
								     franchise: getFilters($(this).children("filterList"), "franchise"),
								     methodOfPayment: getFilters($(this).children("filterList"), "methodOfPayment")
					 				};	
			 addProgDataInArr(programData);
		 });		
	}
	
	function getFilters(filterList, filtersName){
		var filters = [];
		var filterNames = $(filterList).find("name");
		$(filterNames).each(function(){			
			var filterName = $(this).text();
			if( filterName == filtersName){
				var filter = $(this).next().text();
				filters.push(filter);
			}			
		});
		return filters;
	}
	
	function getCompanyName(company){
		var companyName = "";
		 $(company).each(function(){
			 companyName = $(company).children("name").text();
		});
		return companyName;
	}
	
	function getTipeOfClientsName(tipeOfClients){
		var tipeOfClientsName = "";
		$(tipeOfClients).each(function(){
			tipeOfClientsName = $(tipeOfClients).children("name").text();
		});
		return tipeOfClientsName;
	}
	
	function addProgDataInArr(programData){
		data.push(programData);
	}
	
	return data;
}