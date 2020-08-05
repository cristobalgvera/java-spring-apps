package cl.fullstack.validationlearning.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.util.Date;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 60)
    @NotBlank(message = "Name can't be empty")
    @Size(min = 3, max = 50)
    private String name;

    @Email(message = "Insert a valid email")
    private String email;

    @Min(value = 18, message = "You are too young")
    private int age;

    @Pattern(regexp = "[0-9]{8}", message = "Only numbers are allowed, max 8 numbers")
    private String phoneNumber;

    @Positive(message = "Come on, really do you have a negative number of fingers?")
    private int fingers;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateTime;
    private boolean gender;
}
