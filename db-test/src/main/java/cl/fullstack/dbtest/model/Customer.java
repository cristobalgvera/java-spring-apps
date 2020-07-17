package cl.fullstack.dbtest.model;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity // Establish this POJO as an ORM (Object-Relational Mapping). Each attribute have a relationship whit a DB field.
@Table(name = "customers") // Set affected table on DB
// Getter and setter methods automatically
@Getter
@Setter
public class Customer {

    @Id // Set primary key
    @GeneratedValue // Autoincrement values
    private int customer_id;

    private String name, address;

    @Column(name = "last_name") // Set column if his attribute name is different
    private String lastName;

    public Customer() {
    }

    // Constructor doesn't without id argument
    public Customer(String name, String lastName, String address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
