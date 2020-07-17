package com.fullstack.testwebapp.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.validation.constraints.*;

// @Getter and @Setter are annotations of Lombok project
@Getter
@Setter
@Component // Makes the POJO class a bean
public class Student {
    /*
        Hibernate validator dependency was added to pom.xml file.
        Annotations used below above each attribute are dependant of that.
        Annotations info: https://www.baeldung.com/javax-validation#validation
     */

    @NotBlank(message = "Must insert your name")
    @Size(min = 2, message = "Minimal length: 2 characters")
    private String name;

    @NotBlank(message = "Must insert your last name")
    @Size(min = 2, message = "Minimal length: 2 characters")
    private String lastName;

    @NotNull(message = "Required field")
    private String subject;

    @NotNull(message = "Required field")
    private String city;

    private String[] livesWith; // Used for checkboxes section on registry.jsp view

    @Positive(message = "Invalid age")
    @Max(value = 115, message = "Invalid age")
    private int age;

    @NotBlank(message = "Required field")
    @Email(message = "Insert a valid email")
    private String email;

    // This annotation works to set custom patterns of validation. See regexp for more information.
    @Pattern(regexp = "[0-9]{8}", message = "Invalid number")
    private String phoneNumber;
}
