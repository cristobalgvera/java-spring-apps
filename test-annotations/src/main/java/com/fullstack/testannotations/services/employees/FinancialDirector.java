package com.fullstack.testannotations.services.employees;

import com.fullstack.testannotations.services.reports.Report;

// Note here isn't @Component
public class FinancialDirector implements Employee {
    private Report report;

    // Note here isn't @Autowired and @Qualifier
    public FinancialDirector(Report report) {
        this.report = report;
    }

    @Override
    public String getTasks() {
        return "Do relevant financial stuff like a boss";
    }

    @Override
    public String getReport() {
        return report.getReport();
    }
}
