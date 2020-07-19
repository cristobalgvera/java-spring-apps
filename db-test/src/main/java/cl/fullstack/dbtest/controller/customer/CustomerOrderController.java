package cl.fullstack.dbtest.controller.customer;

import cl.fullstack.dbtest.constant.PaymentMethods;
import cl.fullstack.dbtest.model.customer.Customer;
import cl.fullstack.dbtest.model.customer.CustomerFactory;
import cl.fullstack.dbtest.model.customer.CustomerOrder;
import cl.fullstack.dbtest.repository.customer.CustomerOrderRepository;
import cl.fullstack.dbtest.repository.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/shop")
public class CustomerOrderController {
    @Autowired
    private HttpSession httpSession;

    @Autowired
    private CustomerFactory customerFactory;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerOrderRepository customerOrderRepository;

    @RequestMapping(value = {"", "/"})
    public String shop(Model model) {
        Customer customer = getCustomer();
        model.addAttribute("previousOrders", customer.getCustomerOrders());
        model.addAttribute("order",(CustomerOrder) customerFactory.createCustomerService("order"));
        return "shop/shop";
    }

    @PostMapping("/purchase")
    public String purchase(@ModelAttribute("order") CustomerOrder customerOrder) {
        Customer customer = getCustomer();
        customerOrder.setOrderDate(new Date());
        customer.addCustomerOrder(customerOrder);
        customerOrderRepository.saveAndFlush(customerOrder);
        return "redirect:/shop/";
    }

    private Customer getCustomer() {
        Customer customer = (Customer) httpSession.getAttribute("customer");
        return customerRepository.getOne(customer.getId());
    }

    @ModelAttribute("paymentMethods")
    public List<String> getPaymentMethods() {
        List<String> paymentMethods = new ArrayList<>();
        paymentMethods.add(PaymentMethods.CASH);
        paymentMethods.add(PaymentMethods.CARD);
        return paymentMethods;
    }
}
