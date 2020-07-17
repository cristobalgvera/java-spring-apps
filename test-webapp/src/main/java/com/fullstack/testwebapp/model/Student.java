package com.fullstack.testwebapp.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

// @Getter and @Setter are annotations of Lombok project
@Getter
@Setter
@Component // Makes the POJO class a bean
public class Student {
    /*
        Hibernate validator dependency was added to pom.xml file.
        Annotations used below above each attribute are dependant of that.
     */

    @NotNull
    @Size(min = 2, message = "Minimal length: 2 characters")
    private String name;

    @NotNull
    @Size(min = 2, message = "Minimal length: 2 characters")
    private String lastName;

    @NotNull(message = "Required field")
    private String subject;

    @NotNull(message = "Required field")
    private String city;

    private String[] livesWith; // Used for checkboxes section on registry.jsp view
}
