package cl.fullstack.dbtest.repository.customer;

import cl.fullstack.dbtest.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// This interface will be used to define our find methods via JPA assistance.
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findCustomerByName(String name); // Query-based method
}
