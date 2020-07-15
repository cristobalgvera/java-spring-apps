package com.fullstack.testannotations.services.reports;

import org.springframework.stereotype.Component;

@Component
public class HumanResourcesReport implements Report {
    @Override
    public String getReport() {
        return "Human resources report";
    }
}
