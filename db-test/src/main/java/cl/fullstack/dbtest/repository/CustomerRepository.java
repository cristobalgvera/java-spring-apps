package cl.fullstack.dbtest.repository;

import cl.fullstack.dbtest.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// This interface will be used to define our find methods via JPA assistance.
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
