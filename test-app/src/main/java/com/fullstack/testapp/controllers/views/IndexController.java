package com.fullstack.testapp.controllers.views;

import com.fullstack.testapp.services.employees.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

//    @Autowired
    private EmployeeService employee;
    private EmployeeService employee2;

    @Autowired
    public void setEmployee(EmployeeService employee, EmployeeService employee2) {
        this.employee = employee;
        this.employee2 = employee2;
    }

    @RequestMapping("/")
    public String setParameters(Model model) {
        model.addAttribute("employee", employee);
        model.addAttribute("employee2", employee2);
        return "index";
    }
}
