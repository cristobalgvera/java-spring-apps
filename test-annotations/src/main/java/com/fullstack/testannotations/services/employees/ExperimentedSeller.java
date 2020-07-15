package com.fullstack.testannotations.services.employees;

import com.fullstack.testannotations.services.reports.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Annotation to reference a bean via class. This is used in main
public class ExperimentedSeller implements Employee {

    private Report report;

    @Autowired // This annotation inject a Report object when class require it
    public void setReport(Report report) {
        this.report = report;
    }

    @Override
    public String getTasks() {
        return "Sell and sell";
    }

    @Override
    public String getReport() {
        // Here the class require a Report object, so Spring via @Autowired it's created
        return report.getReport();
    }
}
