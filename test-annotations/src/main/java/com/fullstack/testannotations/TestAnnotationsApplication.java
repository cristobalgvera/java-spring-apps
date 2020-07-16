package com.fullstack.testannotations;

import com.fullstack.testannotations.configurations.AppConfig;
import com.fullstack.testannotations.configurations.EmployeesConfig;
import com.fullstack.testannotations.services.employees.Employee;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class TestAnnotationsApplication {

    public static void main(String[] args) {
        // Initialize Spring app via @Configuration annotation
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmployeesConfig.class);
        // Request bean objects to Spring container
        Employee employee = (Employee) applicationContext.getBean("financialDirector");
        // Use methods of employee
        System.out.println("Tasks: " + employee.getTasks());
        System.out.println("Report: " + employee.getReport());
        // Close the context
        applicationContext.close();
    }

}
