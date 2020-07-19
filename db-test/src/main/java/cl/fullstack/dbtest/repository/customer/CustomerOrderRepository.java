package cl.fullstack.dbtest.repository.customer;

import cl.fullstack.dbtest.model.customer.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Long> {
}
