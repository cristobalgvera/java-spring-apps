package com.fullstack.testapp.controllers;

import com.fullstack.testapp.services.employees.EmployeeService;
import com.fullstack.testapp.services.reports.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeesController {
    private EmployeeService employeeService;
    private ReportService reportService;

    @Autowired
    public void setEmployee(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public EmployeeService getEmployee() {
        return employeeService;
    }

    @Autowired
    public void setReportService(ReportService reportService) {
        this.reportService = reportService;
    }

    public ReportService getReport() {
        return reportService;
    }

}
