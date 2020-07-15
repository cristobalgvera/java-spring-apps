package com.fullstack.testapp.configurations;

import com.fullstack.testapp.services.employees.EmployeeFactory;
import com.fullstack.testapp.services.reports.ReportFactory;
import com.fullstack.testapp.services.reports.ReportService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class EmployeesConfig {

    @Bean
    public EmployeeFactory employeeFactory() {
        return new EmployeeFactory();
    }

    @Bean
    @Profile("default")
    public ReportService reportServiceDirectorImpl(ReportFactory reportFactory) {
        return reportFactory.createReport("director");
    }

    @Bean
    @Profile("secretary")
    public ReportService reportServiceSecretaryImpl(ReportFactory reportFactory) {
        return reportFactory.createReport("secretary");
    }

}
