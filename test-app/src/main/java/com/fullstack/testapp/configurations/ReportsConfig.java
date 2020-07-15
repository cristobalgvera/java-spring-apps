package com.fullstack.testapp.configurations;

import com.fullstack.testapp.services.employees.EmployeeFactory;
import com.fullstack.testapp.services.employees.EmployeeService;
import com.fullstack.testapp.services.reports.ReportFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ReportsConfig {

    @Bean
    public ReportFactory reportFactory() {
        return new ReportFactory();
    }

    @Bean
    @Profile("default")
    public EmployeeService directorServiceImpl(EmployeeFactory employeeFactory) {
        return employeeFactory.createEmployee("director");
    }

    @Bean
    @Profile("secretary")
    public EmployeeService secretaryServiceImpl(EmployeeFactory employeeFactory) {
        return employeeFactory.createEmployee("secretary");
    }
}
