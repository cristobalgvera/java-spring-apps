package com.fullstack.testapp.controllers.services;

import com.fullstack.testapp.services.employees.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeesController {
//    @Autowired
    private EmployeeService employeeService;

    @Autowired
    public void setEmployee(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public EmployeeService getEmployee() {
        return employeeService;
    }

}
