package cl.fullstack.dbtest.model.customer;


import org.springframework.stereotype.Component;

@Component
public class CustomerFactory {
    public CustomerService createCustomerService(String customerService) {
        switch (customerService) {
            case "customer":
                return new Customer();
            case "detail":
                return new CustomerDetail();
            case "order":
                return new CustomerOrder();
            default:
                throw new IllegalStateException("Unexpected value: " + customerService);
        }
    }
}
