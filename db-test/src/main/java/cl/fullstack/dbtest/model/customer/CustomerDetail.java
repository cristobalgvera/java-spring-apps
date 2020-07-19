package cl.fullstack.dbtest.model.customer;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
public class CustomerDetail {
    @Id
    @GeneratedValue
    protected Long id;

    @Column(length = 20)
    private String phoneNumber;

    @Column(length = 1)
    private String sex;

    @Column(length = 30)
    private String email;

    @OneToOne(mappedBy = "customerDetail")
    private Customer customer;

    public CustomerDetail() {
    }

    public CustomerDetail(String phoneNumber, String sex, String email) {
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.email = email;
    }

    public CustomerDetail(Long id, String phoneNumber, String sex, String email) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.email = email;
    }

    @Override
    public String toString() {
        return "CustomerDetail{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", customer=" + customer.getId() +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
