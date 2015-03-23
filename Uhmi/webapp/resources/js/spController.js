function singlePageController(){
	var companyName = $("#insCompanyName").text();
	var allInsPrograms = getPrograms();
	if(companyName){
		console.log(companyName);
		var carrentPrograms = getCarrentPrograms(allInsPrograms, companyName);
		getGridInsPrograms(carrentPrograms);
	}
	else{	
		getGridInsPrograms(allInsPrograms);
	}
}

function getCarrentPrograms(allPrograms, companyName){
	var carrentPrograms = [];
	for (var i = 0; i < allPrograms.length; i++) {
		var program = allPrograms[i];
		if(program.company == companyName){
			carrentPrograms.push(program);
		}
	}
	return carrentPrograms;
}
	