package cl.fullstack.dbtest.model.customer;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
@Component
public class CustomerOrder implements CustomerService  {

    @Id
    @GeneratedValue(generator = "CUSTOMER_ORDERS_SEQ")
    private Long id;

    @Column(length = 10)
    private int quantity;

    @Column(length = 15)
    private String paymentMethod;
    private Date orderDate;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;

    public CustomerOrder() {}

    public CustomerOrder(Date orderDate) {
        this.orderDate = orderDate;
    }

    public CustomerOrder(Date orderDate, int quantity, String paymentMethod) {
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.paymentMethod = paymentMethod;
    }

    public CustomerOrder(Long id, Date orderDate, int quantity, String paymentMethod) {
        this.id = id;
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.paymentMethod = paymentMethod;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date date) {
        this.orderDate = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "CustomerOrder{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", date=" + orderDate +
                ", customer=" + customer.getId() +
                '}';
    }
}
