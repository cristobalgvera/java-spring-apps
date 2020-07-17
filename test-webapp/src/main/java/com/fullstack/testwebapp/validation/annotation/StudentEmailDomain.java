package com.fullstack.testwebapp.validation.annotation;

import com.fullstack.testwebapp.validation.StudentEmailDomainValidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = StudentEmailDomainValidation.class) // Logic class provider
@Target({ElementType.METHOD, ElementType.FIELD}) // Places where annotation will be able to be used
@Retention(RetentionPolicy.RUNTIME) // Define when annotation must be used
public @interface StudentEmailDomain {

    // Value is used to validate a value that must be in a specific input
    String value() default "gmail.com";

    // Message it's the message shown to users when validation fails
    String message() default "Invalid email";

    /*
        Groups are used to validate segmented sections of our form instantaneously
        when user fill his inputs
    */
    Class<?>[] groups() default {};

    // Payload is used to work with metadata or updatable data
    Class<? extends Payload>[] payload() default {};
}
