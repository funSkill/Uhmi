function getGridInsPrograms (insurancePrograms) {

    var gridInsPrograms = new GridInsPrograms();

    gridInsPrograms.addColumnDefinition({ name: "company", nameUa: "Компанія"});
    gridInsPrograms.addColumnDefinition({ name: "clients", nameUa: "Клієнти"});
    gridInsPrograms.addColumnDefinition({ name: "program", nameUa: "Програма"});
    gridInsPrograms.addColumnDefinition({ name: "insurer", nameUa: "Страхувальник"});
    gridInsPrograms.addColumnDefinition({ name: "age", nameUa: "Вік, років"});
    gridInsPrograms.addColumnDefinition({ name: "additionalInsurerRequirements", nameUa: "Додаткові вимоги до страхувальника"});
    gridInsPrograms.addColumnDefinition({ name: "insuranceAmount", nameUa: "Страхова сума"});
    gridInsPrograms.addColumnDefinition({ name: "insuranceTariff", nameUa: "Страховий тариф"});
    gridInsPrograms.addColumnDefinition({ name: "insurancePayment", nameUa: "Страховий платіж"});
    gridInsPrograms.addColumnDefinition({ name: "risks", nameUa: "Ризики"});
    gridInsPrograms.addColumnDefinition({ name: "medicalInstitutions", nameUa: "Медичні заклади"});
    gridInsPrograms.addColumnDefinition({ name: "franchise", nameUa: "Франшиза"});
    gridInsPrograms.addColumnDefinition({ name: "methodOfPayment", nameUA: "Форма оплати"});
    gridInsPrograms.addColumnDefinition({ name: "territory", nameUa: "Територія дії"});
    gridInsPrograms.addColumnDefinition({ name: "periodOfValidity", nameUa: "Строк дії поліса"});
    gridInsPrograms.addColumnDefinition({ name: "requiredDocuments", nameUa: "Необхідні документи"});
    gridInsPrograms.addColumnDefinition({ name: "availabilityServiceAssistance", nameUa: "Наявність служби асистансу"});
    gridInsPrograms.addColumnDefinition({ name: "previousMedicalExamination", nameUa: "Попередній медогляд"});
    gridInsPrograms.addColumnDefinition({ name: "samplePolis", nameUa: "Зразок договору медичного страхування"});
    gridInsPrograms.addColumnDefinition({ name: "programConsist", nameUa: "Наповнення програми"});
    gridInsPrograms.addColumnDefinition({ name: "dentistry", nameUa: "Стоматологія"});
    gridInsPrograms.addColumnDefinition({ name: "discounts", nameUa: "Знижки"});
    gridInsPrograms.addColumnDefinition({ name: "specialConditionsParticularInsurer",nameUa: "Особливі умови конкретного страховика"});
    gridInsPrograms.addColumnDefinition({ name: "hotLine", nameUa: "гаряча лінія"});
    gridInsPrograms.addColumnDefinition({ name: "insuranceBenefits", nameUa: "Страхові виплати"});
    gridInsPrograms.addColumnDefinition({ name: "additionally", nameUa: "Додатково"});
    gridInsPrograms.addColumnDefinition({ name: "insuredEvent", nameUa: "Страховий випадок"});
    

    gridInsPrograms.getInsurancePrograms({dataSource: insurancePrograms,
                                          filteringInsurancePrograms: {filtersBarId: "filtersBar",
                                                                       fieldId: "insPrograms",
                                                                       allProgramsBtnId: "allPrograms",
                                                                       addToCompareBtnId: "addToCompare",
                                                                       allFilteringProsBtnId: "filteringPros",
                                                                       messageContainerId: "messageContainer",
                                                                       filterCheckboxName: "filterItem",
                                                                       filters:["age",
                                                                            "insurancePayment",
                                                                            "medicalInstitutions",
                                                                            "franchise",
                                                                            "methodOfPayment"
                                                                       ]}
                                        });
};