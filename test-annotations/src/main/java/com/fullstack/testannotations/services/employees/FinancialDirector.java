package com.fullstack.testannotations.services.employees;

import com.fullstack.testannotations.services.reports.Report;
import org.springframework.beans.factory.annotation.Value;

// Note here isn't @Component
public class FinancialDirector implements Employee {
    private Report report;

    // Annotation to inject a value via external property
    @Value("${financial_director_email}") // Note: Variable name is the same of name in external properties file
    private String email;
    @Value("${business_name}") // Can be interpreted like a predefined @Autowired
    private String businessName;

    // Note here isn't @Autowired and @Qualifier
    public FinancialDirector(Report report) {
        this.report = report;
    }

    public String getEmail() {
        return email;
    }

    public String getBusinessName() {
        return businessName;
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
