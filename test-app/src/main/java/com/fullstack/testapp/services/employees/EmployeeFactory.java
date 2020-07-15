package com.fullstack.testapp.services.employees;

public class EmployeeFactory {
    public EmployeeService createEmployee(String type) {
        EmployeeService employee = null;
        switch (type) {
            case "director":
                employee = new DirectorServiceImpl();
                break;
            case "secretary":
                employee = new SecretaryServiceImpl();
                break;
            default:
                return new DirectorServiceImpl();
        }
        return employee;
    }
}
