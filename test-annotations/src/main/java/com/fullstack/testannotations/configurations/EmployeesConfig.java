package com.fullstack.testannotations.configurations;

import com.fullstack.testannotations.services.employees.Employee;
import com.fullstack.testannotations.services.employees.FinancialDirector;
import com.fullstack.testannotations.services.reports.Report;
import com.fullstack.testannotations.services.reports.SellDepartmentFinancialReport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.fullstack.testannotations")
// Note: @ComponentScan makes @PostConstruct and @PreDestroy methods of ExperimentedSeller class execute
public class EmployeesConfig {

    @Bean // Defining Report class bean to use it later
    public Report sellDepartmentFinancialReport() { // Name of bean method will be the injection name
        return new SellDepartmentFinancialReport();
    }

    @Bean // Defining Employee class bean to use it later
    public Employee financialDirector() {
        return new FinancialDirector(sellDepartmentFinancialReport()); // Constructor parameter request for a bean
    }

}
