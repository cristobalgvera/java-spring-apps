package com.fullstack.testwebapp.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

// @Getter and @Setter are annotations of Lombok project
@Getter
@Setter
@Component // Makes the POJO class a bean
public class Student {
    private String name, lastName, subject, city;
    private String[] livesWith; // Used for checkboxes section on registry.jsp view
}
