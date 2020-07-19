package cl.fullstack.dbtest.controller.customer;

import cl.fullstack.dbtest.model.customer.Customer;
import cl.fullstack.dbtest.model.customer.CustomerDetail;
import cl.fullstack.dbtest.repository.customer.CustomerDetailRepository;
import cl.fullstack.dbtest.repository.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/{name}")
public class CustomerDetailController {

    @Autowired
    private HttpSession httpSession;

    @Autowired
    private Customer customer;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerDetail customerDetail;

    @Autowired
    private CustomerDetailRepository customerDetailRepository;

    @RequestMapping(value = {"", "/"}) // Without parameters, @PostMapping will request controller map
    public String userPage(Model model) {
        if (httpSession.getAttribute("customer") != null)
            customer = getCustomer();
        if (customer != null) {
            model.addAttribute(customer); // You can omit name of attribute if the name will be equals to his object
            model.addAttribute("customerDetail", customerDetailRepository.findByCustomer_Id(customer.getId()));
        }
        return "user/user-page";
    }

    @GetMapping("/set-detail")
    public String setDetail(Model model) {
        customer = getCustomer();
        model.addAttribute(customer);
        model.addAttribute("customerDetail", customerDetail);
        return "user/set-detail";
    }

    @PostMapping("/create-detail")
    public String createDetail(@ModelAttribute("customerDetail") CustomerDetail customerDetail) {
        customer = getCustomer();
        customerDetail.setCustomer(customer);
        customerDetailRepository.save(customerDetail);
        customer.setCustomerDetail(customerDetail);
        customerRepository.saveAndFlush(customer);
        return "redirect:/" + customer.getName().toLowerCase();
    }

    @PostMapping("/update-detail")
    public String updateDetails(@ModelAttribute("customerDetail") CustomerDetail customerDetail,
                                @RequestParam Long id) {
        this.customerDetail = customerDetailRepository.getOne(id);
        this.customerDetail.setEmail(customerDetail.getEmail());
        this.customerDetail.setPhoneNumber(customerDetail.getPhoneNumber());
        this.customerDetail.setSex(customerDetail.getSex());
        customerDetailRepository.saveAndFlush(this.customerDetail);
        return "redirect:/" + customer.getName().toLowerCase();
    }

    @RequestMapping("/logout")
    public String logout() {
        httpSession.invalidate();
        return "redirect:/";
    }

    private Customer getCustomer() {
        customer = (Customer) httpSession.getAttribute("customer");
        return customerRepository.getOne(customer.getId());
    }
}
