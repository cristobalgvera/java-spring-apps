package com.fullstack.testannotations.services.reports;

import org.springframework.stereotype.Component;

@Component
public class OperationsReport implements Report {
    @Override
    public String getReport() {
        return "Operations report";
    }
}
