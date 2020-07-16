package com.fullstack.testwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // This annotation tells Springboot he can response request do it by users
public class IndexController {
    @RequestMapping("/hello")   // Requests from 'http://localhost:8080/hello'
    public String hello() {     // Method can return a String object or even a View or ModelAndView one
        return "index";         // This case, String object return, the object must be the name of a view (index.jsp)
    }

    /*
        To make this happen, Spring must have an 'interpreter'. In our case, we use Jasper from Tomcat.
        This can be saw in pom.xml file adding artifact's dependency 'tomcat-embed-jasper'.
        Another point to consider is add to pom.xml file artifact's dependency 'jstl'. It would be
        helpful to write more easily dynamic code to our .jsp archives.
     */
}
