package com.fullstack.testapp.controllers.services;

import com.fullstack.testapp.services.reports.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ReportsController {
    //    @Autowired
    private ReportService reportService;

    @Autowired
    public void setReportService(ReportService reportService) {
        this.reportService = reportService;
    }

    public ReportService getReport() {
        return reportService;
    }
}
