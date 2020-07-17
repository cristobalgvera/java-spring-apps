package com.fullstack.testwebapp.validation;

import com.fullstack.testwebapp.validation.annotation.StudentEmailDomain;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

// Our validation's logic class must implement ConstraintValidator class to works well
public class StudentEmailDomainValidation implements ConstraintValidator<StudentEmailDomain, String> {
    /*
        This attribute will be used to dynamize value method of our validation via
        @StudentEmailDomain(value = "whatever-we-want.com")
     */
    private String domain;

    /*
        This method handler values requested by programmers described above.
     */
    @Override
    public void initialize(StudentEmailDomain constraintAnnotation) {
        this.domain = "@" + constraintAnnotation.value(); // Note .value() get value of Annotation class method
    }

    // This method checks if inserted value complies with the defined structure
    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        if (email != null && email.endsWith(this.domain)) // Method .endsWith() is part of String methods.
            return true;
        else return false;
    }
}
