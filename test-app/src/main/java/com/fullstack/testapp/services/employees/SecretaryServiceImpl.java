package com.fullstack.testapp.services.employees;

import com.fullstack.testapp.services.reports.ReportService;
import org.springframework.beans.factory.annotation.Autowired;

public class SecretaryServiceImpl implements EmployeeService {
    private ReportService reportService;

    @Autowired
    public void setReport(ReportService reportService) {
        this.reportService = reportService;
    }

    @Override
    public ReportService getReport() {
        return reportService;
    }
}
