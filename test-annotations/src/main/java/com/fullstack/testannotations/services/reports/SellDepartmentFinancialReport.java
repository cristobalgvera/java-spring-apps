package com.fullstack.testannotations.services.reports;

// Note here isn't @Component
public class SellDepartmentFinancialReport implements Report {
    @Override
    public String getReport() {
        return "Sell department financial report";
    }
}
