package com.fullstack.testannotations.services.employees;

import org.springframework.stereotype.Component;

@Component // Annotation to reference a bean via class. This is used in main
public class ExperimentedSeller implements Employee {
    @Override
    public String getTasks() {
        return "Sell and sell";
    }

    @Override
    public String getReport() {
        return "Seller report";
    }
}
