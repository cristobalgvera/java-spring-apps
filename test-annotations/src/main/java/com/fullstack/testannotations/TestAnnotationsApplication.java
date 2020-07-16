package com.fullstack.testannotations;

import com.fullstack.testannotations.configurations.AppConfig;
import com.fullstack.testannotations.configurations.EmployeesConfig;
import com.fullstack.testannotations.services.employees.Employee;
import com.fullstack.testannotations.services.employees.FinancialDirector;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class TestAnnotationsApplication {

    public static void main(String[] args) {
        // Initialize Spring app via @Configuration annotation
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmployeesConfig.class);
        // Request bean objects to Spring container
        // To use specific class methods we need to instantiate specific class, can't "use" generic interface
        FinancialDirector employee = (FinancialDirector) applicationContext.getBean("financialDirector");
        // Use methods of employee
        System.out.println("Tasks: " + employee.getTasks());
        System.out.println("Report: " + employee.getReport());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Business: " + employee.getBusinessName());
        // Close the context
        applicationContext.close();
    }

}
