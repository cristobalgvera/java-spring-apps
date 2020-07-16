package com.fullstack.testwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestWebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestWebappApplication.class, args);
    }

    /*
        To export a WAR file and execute it in an applications server like Tomcat, firstly you need to
        standardize all links referred to another page, in this branch all 'url', 'src', 'href' or an
        other similar was wrote following JSTL taglib.

        Example:

        If a request url was:       <img src="img/test-img.jpg">
        now it must be              <img src="<c:url value="/img/test-img.jpg"/>">

        Note the property 'src' was completed using JSTL taglib, that makes an implicit dynamic route
        when user request for it. Another way to do that is completing using explicit dynamic route
        reference:

        If a request url was:       <img src="img/test-img.jpg">
        now it must be:             <img src="${pageContext.request.contextPath}/img/test-img.jpg" alt="test-img">

        Both are well implemented routes.

        After that, you need to execute mvn clean and mvn package commands. The WAR file will be in target
        folder inside of your project. Put that file in any applications server and should works.
     */

}
