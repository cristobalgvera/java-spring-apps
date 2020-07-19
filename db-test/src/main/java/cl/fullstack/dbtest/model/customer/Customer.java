package cl.fullstack.dbtest.model.customer;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity // Establish this POJO as an ORM (Object-Relational Mapping). Each attribute have a relationship whit a DB field.
// Getter and setter methods automatically
@Component
public class Customer {

    @Id // Set primary key
    @GeneratedValue // Autoincrement values
    private Long id;

    @Column(length = 30)
    private String address;

    @Column(length = 25)
    private String lastName; // Using Camel case created column will be 'last_name'

    @Column(length = 15)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CUSTOMER_DETAIL_ID")
    private CustomerDetail customerDetail;

//    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
//    private List<CustomerOrder> customerOrders;

    public Customer() {
    }

    // Constructor doesn't without id argument
    public Customer(String name, String lastName, String address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    private Customer(Long id, String name, String lastName, String address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

//    @Override
//    public String toString() {
//        return "Customer{" +
//                "id=" + id +
//                ", address='" + address + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", name='" + name + '\'' +
//                ", customerDetail=" + customerDetail +
//                ", customerOrders=" + customerOrders +
//                '}';
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerDetail getCustomerDetail() {
        return customerDetail;
    }

    public void setCustomerDetail(CustomerDetail customerDetail) {
        this.customerDetail = customerDetail;
    }

//    public List<CustomerOrder> getCustomerOrders() {
//        return customerOrders;
//    }
//
//    public void setCustomerOrders(List<CustomerOrder> customerOrders) {
//        this.customerOrders = customerOrders;
//    }
//
//    public void addCustomerOrder(CustomerOrder customerOrder) {
//        this.customerOrders.add(customerOrder);
//    };
}
