package com.fullstack.testannotations;

import com.fullstack.testannotations.services.employees.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestAnnotationsApplication {

    public static void main(String[] args) {
        // Initialize Spring app
        ApplicationContext applicationContext = SpringApplication.run(TestAnnotationsApplication.class, args);
        // Request a bean object to Spring container
        Employee employee = (Employee) applicationContext.getBean("experimentedSeller");
        // Use the bean
        System.out.println("Tasks: " + employee.getTasks());
        System.out.println("Report: " + employee.getReport());
    }

}
