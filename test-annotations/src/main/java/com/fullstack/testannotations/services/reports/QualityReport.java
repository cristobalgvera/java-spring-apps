package com.fullstack.testannotations.services.reports;

import org.springframework.stereotype.Component;

@Component
public class QualityReport implements Report {
    @Override
    public String getReport() {
        return "Quality report";
    }
}
