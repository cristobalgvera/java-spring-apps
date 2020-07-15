package com.fullstack.testannotations.services.employees;

import com.fullstack.testannotations.services.reports.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // Annotation to reference a bean via class. This is used in main
@Scope("prototype") // Annotation to define how object are created when it's requested. Default is singleton
public class ExperimentedSeller implements Employee {

    private Report report;

    @Autowired // This annotation inject a Report object when class require it
//    @Qualifier("humanResourcesReport") // This annotation let autowired inject the right dependence
    public void setReport(@Qualifier("humanResourcesReport") Report report) { // Can be used in each argument too
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
