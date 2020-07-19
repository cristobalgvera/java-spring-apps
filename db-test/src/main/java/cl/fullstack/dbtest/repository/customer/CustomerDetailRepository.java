package cl.fullstack.dbtest.repository.customer;

import cl.fullstack.dbtest.model.customer.CustomerDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDetailRepository extends JpaRepository<CustomerDetail, Long> {
    CustomerDetail findByCustomer_Id(Long id);
}
