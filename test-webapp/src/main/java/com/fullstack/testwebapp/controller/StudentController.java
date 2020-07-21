package com.fullstack.testwebapp.controller;

import com.fullstack.testwebapp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    private Student student;

    @Autowired // Dependency injection
    public void setStudent(Student student) {
        this.student = student;
    }

    /*
        @InitBinder + StringTrimmerEditor are basically equals to put @NotBlank above
        the attribute in POJO, but here it's how to use the first mention.
     */
    @InitBinder
    public void getBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmer);
    }

    @RequestMapping("/show-form")
    public String showForm(Model model) {
//        Student student = new Student(); // Old way to do that
        model.addAttribute("student", student); // Via @Autowired this attribute is loaded
        return "student/registry";
    }

    @RequestMapping("/process-form")
    public String processForm(@Valid @ModelAttribute("student") Student student, // @Valid is used to assign validation to the method.
                              BindingResult bindingResult) { // BindingResult object has the result of validation. It require @Valid before.
        /*
            @ModelAttribute takes data of model and inject it in a method.
            That let Student object be transferred between views.
        */
        if (bindingResult.hasErrors()) return "student/registry"; // Simply if/else sentence to determine the way to proceed.
                                            // If bindingResult has errors, we need to modify form telling the errors to users
        else return "student/successful-registry";
    }

    @ModelAttribute("cities") // This way of @ModelAttribute can be used to define a variable and use it in JSP files.
    public List<String> getCities() {
        List<String> cities = new ArrayList<>();
        cities.add("Temuco");
        cities.add("Valparaiso");
        cities.add("Santiago");
        cities.add("Iquique");
        cities.add("Chiloé");
        Collections.sort(cities);
        return cities;
    }

    @ModelAttribute("subjects") // These variables are used in registry.jsp view.
    public List<String> getSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Music");
        subjects.add("Programming");
        subjects.add("Design");
        subjects.add("Engineering");
        Collections.sort(subjects);
        return subjects;
    }

    @ModelAttribute("livesWith") // Names must be like in Java
    public List<String> getLivesWith() {
        List<String> livesWith = new ArrayList<>();
        livesWith.add("Mom");
        livesWith.add("Dad");
        livesWith.add("Brother(s)");
        livesWith.add("Sister(s)");
        livesWith.add("Grandparents");
        livesWith.add("Uncle(s)");
        return livesWith;
    }
}
