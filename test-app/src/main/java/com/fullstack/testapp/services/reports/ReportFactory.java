package com.fullstack.testapp.services.reports;

public class ReportFactory {
    public ReportService createReport(String type) {
        ReportService report = null;
        switch (type){
            case "director":
                report = new ReportServiceDirectorImpl();
                break;
            case "secretary":
                report = new ReportServiceSecretaryImpl();
                break;
            default:
                return new ReportServiceDirectorImpl();
        }
        return report;
    }
}
