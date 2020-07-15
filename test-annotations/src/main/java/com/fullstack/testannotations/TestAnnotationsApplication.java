package com.fullstack.testannotations;

import com.fullstack.testannotations.configurations.AppConfig;
import com.fullstack.testannotations.services.employees.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class TestAnnotationsApplication {

    public static void main(String[] args) {
        // Initialize Spring app via @Configuration annotation
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        // Request bean objects to Spring container
        Employee employee = (Employee) applicationContext.getBean("experimentedSeller");
        Employee employee1 = (Employee) applicationContext.getBean("experimentedSeller");
        // Compare beans
        if (employee == employee1) System.out.println("Equals objects");
        else System.out.println("Different objects");

        System.out.println(employee + "\n" + employee1);
    }

}
