package cl.fullstack.dbtest.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity // Establish this POJO as an ORM (Object-Relational Mapping). Each attribute have a relationship whit a DB field.
// Getter and setter methods automatically
@Getter
@Setter
@Component
public class Customer {

    @Id // Set primary key
    @GeneratedValue // Autoincrement values
    private int id;

    private String address, lastName, name;

    public Customer() {
    }

    // Constructor doesn't without id argument
    public Customer(String name, String lastName, String address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public Customer(int id, String name, String lastName, String address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
