function GridInsPrograms() {
    var self = this;
    var fieldId = 0;
    var filtersBarId = 0;
    var messageContainerId = 0;
    var totalProgramsId = "totalPrograms";
    var totalFilteringProId = "totalFilteringPro";
    var filterCheckboxName = 0;
    var allProgramsBtnId = 0;
    var addToCompareBtnId = 0;
    var allFilteringProsBtnId = 0;
    var definitions = [];
    var programs = [];
    var filterParams = [];
    var customFilters = {};
    var showingProgramId = 0;
    var compareProgramsIdStack = [];
    var totalCompareProgramsRender = 2;
    var isAtLeastOneShortCutProgramRender = 0;
    var howMuchShortCutsProgramFound = 0;

    
    self.addColumnDefinition = function (definition) {
        definitions.push(definition);
    };

    self.getInsurancePrograms = function(params){
        if(validateParams(params)){
            programs = params.dataSource;
            filtersBarId = params.filteringInsurancePrograms.filtersBarId;
            fieldId = params.filteringInsurancePrograms.fieldId;
            allProgramsBtnId = params.filteringInsurancePrograms.allProgramsBtnId;
            addToCompareBtnId = params.filteringInsurancePrograms.addToCompareBtnId;
            allFilteringProsBtnId = params.filteringInsurancePrograms.allFilteringProsBtnId;
            messageContainerId = params.filteringInsurancePrograms.messageContainerId;
            filterCheckboxName = params.filteringInsurancePrograms.filterCheckboxName;
            filterParams = params.filteringInsurancePrograms.filters;

            showShortCuts();
            showMessage(1);
            setOnClick();
            hideEl(allProgramsBtnId);
            hideEl(addToCompareBtnId);
            hideEl(allFilteringProsBtnId);
        }
    };

    function validateParams(params){
        if( !params.dataSource ||
            !params.filteringInsurancePrograms.filtersBarId ||
            !params.filteringInsurancePrograms.fieldId ||
            !params.filteringInsurancePrograms.allProgramsBtnId ||
            !params.filteringInsurancePrograms.addToCompareBtnId ||
            !params.filteringInsurancePrograms.allFilteringProsBtnId ||
            !params.filteringInsurancePrograms.messageContainerId ||
            !params.filteringInsurancePrograms.filterCheckboxName  ||
            !params.filteringInsurancePrograms.filters){

            showLog(params);
            return false;
        }
        else{
            return true;
        }
    }

    function  showLog(params){
        console.log("programs: " + params.dataSource);
        console.log("filtersBarId: " + params.filteringInsurancePrograms.filtersBarId);
        console.log("fieldId: " + params.filteringInsurancePrograms.fieldId);
        console.log("allProgramsBtnId: " + params.filteringInsurancePrograms.allProgramsBtnId);
        console.log("addToCompareBtnId: " + params.filteringInsurancePrograms.addToCompareBtnId);
        console.log("allFilteringProsBtnId: " + params.filteringInsurancePrograms.allFilteringProsBtnId);
        console.log("messageContainerId: " + params.filteringInsurancePrograms.messageContainerId);
        console.log("filterCheckboxName: " + params.filteringInsurancePrograms.filterCheckboxName);
        console.log("filterParams : " + params.filteringInsurancePrograms.filters);
        alert("You need set: 'dataSource', 'filtersBarId','fieldId', 'messageContainerId', 'filterCheckboxName', 'filters',  'allProgramsBtnId', 'addToCompareBtnId', 'allFilteringProsBtnId'");
    }


    function runFiltering(){
        saveValuesFilterParams();
        filteringPrograms();
        showShortCuts();
        showEl(allProgramsBtnId);
        showMessage(1);
        showMessage(2);
    }

    function renderPrograms (programs) {
        var table = document.createDocumentFragment();
        var definitionsLength = definitions.length;
        var thead = document.createElement('thead');
        var tbody = document.createElement('tbody');
        for (var i = 0; i < definitions.length; i++) {
            var definitionName = definitions[i]["name"];
            var definitionNameUA = definitions[i]["nameUa"];
            var row = document.createElement('tr');
            tbody.appendChild(row);
            table.appendChild(tbody);
            var cell = document.createElement('td');
            cell.appendChild(document.createTextNode(definitionNameUA));
            cell.className = "trHeader";
            row.appendChild(cell);
            for (var j = 0; j < programs.length; j++){
                var program = programs[j];
                cell = document.createElement('td');
                if(program[definitionName]){
                    cell.appendChild(document.createTextNode(program[definitionName]));
                }
                else{
                    cell.appendChild(document.createTextNode("-"));
                }
                cell.className = "trItem";
                row.appendChild(cell);
            }
        }
        saveShowingProgramId(program.id);
        $( "#" + fieldId ).empty();
        var target = document.getElementById(fieldId);
        target.appendChild(table);
    }

    function saveValuesFilterParams(){
        for(var i = 0; i < filterParams.length; i++){
            var filterParam = filterParams[i];
            var filterParamValues = [];
                $('.' + filterParam + ':checked').each(function(){
                    filterParamValues.push($(this).val());
            });
            customFilters[filterParam] = filterParamValues;
        }
    }

    function filteringPrograms (){
        for(customFilterName in customFilters ){
            for(var i = 0; i < customFilters[customFilterName].length; i++){
                var customFilterVal = customFilters[customFilterName][i];
                for(var j = 0; j < programs.length; j++){
                    var programFilters = programs[j].filters;
                    for(var k = 0; k < programFilters[customFilterName].length; k++){
                        var programFilterVal = programFilters[customFilterName][k];
                        if(customFilterVal == programFilterVal){
                            var currentProgram = programs[j];
                            if(!currentProgram.resultsOfFiltering){
                                currentProgram.resultsOfFiltering = {};
                            }
                            if(!currentProgram.resultsOfFiltering[customFilterName]){
                                currentProgram.resultsOfFiltering[customFilterName] = true;
                            }
                        }
                    }
                }
            }
        }
    }

    function isRequiredProgram(program){
        var resultsOfFiltering = program.resultsOfFiltering;
        for(result in resultsOfFiltering){
            if(resultsOfFiltering[result]){
                howMuchShortCutsProgramFound++;
                return true;
                break;
            }
        }
        return false;
    }

    function renderShortCutsOfPrograms (options){
        howMuchShortCutsProgramFound = 0;
        var table = document.createDocumentFragment();
        var thead = document.createElement('thead');
        var tbody = document.createElement('tbody');
        for (var i = 0; i < definitions.length; i++) {
            var row = document.createElement('tr');
            thead.appendChild(row);
            table.appendChild(thead);
            for (; i < definitions.length; i++) {
                var definition = definitions[i];
                var cell = document.createElement('th');
                if(definition["name"] == "company" || definition["name"] == "program" || definition["name"] == "clients"){
                    cell.appendChild(document.createTextNode(definition["nameUa"]));
                    row.appendChild(cell);
                }
            }
        }
        for (var i = 0; i < programs.length; i++) {
            var currentProgram = programs[i];
            var isRequiredPro = isRequiredProgram(currentProgram);
            if (options && options.isAllProRequired){
                isRequiredPro = options.isAllProRequired;
            }
            if(isRequiredPro){
                isAtLeastOneShortCutProgramRender = true;
                var row = document.createElement('tr');
                tbody.appendChild(row);
                table.appendChild(tbody);
                for (prop in currentProgram) {
                    var currentProFieldName = prop;
                    if(currentProFieldName == "company" || currentProFieldName == "program" || currentProFieldName == "clients"){
                        for (var k = 0; k < definitions.length; k++) {
                            var definition = definitions[k];
                            if (definition["name"] == currentProFieldName) {
                                var cell = document.createElement('td');
                                var currentProFieldValue = currentProgram[currentProFieldName];
                                currentProFieldValue ? cell.appendChild(document.createTextNode(currentProFieldValue)) : cell.appendChild(document.createTextNode("-"));
                                row.appendChild(cell);
                                row.className = currentProgram.id;
                            }
                        }
                    }
                }
                currentProgram.resultsOfFiltering = {};
            }
        }
        $( "#" + fieldId ).empty();
        var target = document.getElementById(fieldId);
        target.appendChild(table);
        if(!$("#" + fieldId+" tbody").length){
         isAtLeastOneShortCutProgramRender = false;
        }
    }

    function showShortCuts(){
        renderShortCutsOfPrograms();
        if(!isAtLeastOneShortCutProgramRender){
            renderShortCutsOfPrograms ({isAllProRequired: true});
        }
    }

    function setMessage(messageOptions){
        if($("#" + messageOptions.id)){
            deleteMessage(messageOptions.id)
        }
        var color = !messageOptions.color ? "black" : messageOptions.color;
        var div = document.createElement('div');
        var message = $(div).attr("id", messageOptions.id).text(messageOptions.message).css("color",messageOptions.color);
        $("#" + messageContainerId).append(message);
    }

    function deleteMessage(id){
        $("#" + id).remove();
    }

    function setOnClick() {
        var field = document.getElementById(fieldId);
        var allProgramsBtn = document.getElementById(allProgramsBtnId);
        var addToCompareBtn = document.getElementById(addToCompareBtnId);
        var allFilteringProsBtn = document.getElementById(allFilteringProsBtnId);
        field.onclick = function (e) {
            getParentElClassName(e.target);
            deleteMessage(totalProgramsId);
            deleteMessage(totalFilteringProId);
            showEl(allFilteringProsBtnId);
            showEl(allProgramsBtnId);
            e.stopPropagation ? e.stopPropagation() : (e.cancelBubble = true);
        };
        allProgramsBtn.onclick = function (e) {
            renderShortCutsOfPrograms({isAllProRequired: true});
            hideEl(allProgramsBtnId);
            hideEl(addToCompareBtnId);
            hideEl(allFilteringProsBtnId);
            uncheckedInputs();
            deleteMessage(totalFilteringProId);
            showMessage(1);
            e.stopPropagation ? e.stopPropagation() : (e.cancelBubble = true);
        };
        addToCompareBtn.onclick = function (e) {
            addIdsToCompareStack();
            hideEl(addToCompareBtnId);
            e.stopPropagation ? e.stopPropagation() : (e.cancelBubble = true);
        };
        allFilteringProsBtn.onclick = function (e) {
            filteringPrograms();
            showShortCuts();
            showMessage(1);
            showMessage(2);
            hideEl(allFilteringProsBtnId);
            hideEl(addToCompareBtnId);
            e.stopPropagation ? e.stopPropagation() : (e.cancelBubble = true);
        };
        $("input[name^= " + filterCheckboxName + "]").click(function() {
            runFiltering();
        });

    }

    function getParentElClassName(currentEl){
        var parentElClassName = $(currentEl).parent().attr('class');
        if(parentElClassName){
            getCurrentProgram(parentElClassName);
        }
    }

    function getCurrentProgram (programId){
        for(var i = 0; i < programs.length; i++){
            if (programs[i].id == programId){
                var currentProgram = programs[i];
                break;
            }
        }
        renderPrograms([currentProgram]);
    }

    function saveShowingProgramId(programId){
        showingProgramId = programId;
        showEl(addToCompareBtnId);
    }

    function addIdsToCompareStack(){
        if(showingProgramId){
            if(compareProgramsIdStack.length < totalCompareProgramsRender){
                compareProgramsIdStack.push(showingProgramId);
                showingProgramId = 0;
                deleteMessage(totalFilteringProId);
                filteringPrograms();
                showShortCuts();
            }
            if(compareProgramsIdStack.length == totalCompareProgramsRender){
                var comparePrograms = [];
                for(var i = 0; i < compareProgramsIdStack.length; i++){
                    for(var j = 0; j < programs.length; j++){
                        if (programs[j].id == compareProgramsIdStack[i]){
                            comparePrograms.push(programs[j]);
                        }
                    }
                }
                renderPrograms(comparePrograms);
                compareProgramsIdStack = [];
                hideEl(addToCompareBtnId);
            }
        }
    }

    function getTotalPrograms(){
        var totalPrograms = 0;
        for (var i = 0; i < programs.length; i++) {
            totalPrograms++;
        }
        return totalPrograms;
    }

    function hideEl(id){
        $("#" + id).hide();
    }
    function showEl(id){
        $("#" + id).show();
    }

    function uncheckedInputs(){
        $("input[name^= " + filterCheckboxName + "]").prop('checked', false);
    }

    function showMessage(id){
        var message = "";
        switch (id) {
            case 1:
                message = {id: totalProgramsId, message: "Загальна кількість програм: " + getTotalPrograms(), color: !getTotalPrograms() ? "red" : "green"};
                break;
            case 2:
                message = {id: totalFilteringProId, message: "За обраними фільтрами знайдено програм: " + howMuchShortCutsProgramFound, color: !howMuchShortCutsProgramFound ? "red" : "green" };
                break;
        }
        setMessage(message);
    }
}