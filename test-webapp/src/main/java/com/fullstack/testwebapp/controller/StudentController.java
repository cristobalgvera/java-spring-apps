package com.fullstack.testwebapp.controller;

import com.fullstack.testwebapp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    private Student student;

    @Autowired // Dependency injection
    public void setStudent(Student student) {
        this.student = student;
    }

    @RequestMapping("/show-form")
    public String showForm(Model model) {
//        Student student = new Student(); // Old way to do that
        model.addAttribute("student", student); // Via @Autowired this attribute is loaded
        return "student/registry";
    }

    @RequestMapping("/process-form")
    public String processForm(@ModelAttribute("student") Student student) {
        /*
            @ModelAttribute takes data of model and inject it in a method.
            That let Student object be transferred between views.
        */
        return "student/successful-registry";
    }
}
