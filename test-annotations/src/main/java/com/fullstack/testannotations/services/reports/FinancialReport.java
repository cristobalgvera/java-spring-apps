package com.fullstack.testannotations.services.reports;

import org.springframework.stereotype.Component;

@Component
public class FinancialReport implements Report {
    @Override
    public String getReport() {
        return "Financial report presentation";
    }
}
