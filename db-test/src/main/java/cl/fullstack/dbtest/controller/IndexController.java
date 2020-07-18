package cl.fullstack.dbtest.controller;

import cl.fullstack.dbtest.model.Customer;
import cl.fullstack.dbtest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    private Customer customer;

    /*
        This instance of CustomerRepository interface let make JPA actions
        and gives the posibility of set more complex SQL requests.
     */
    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("customer", customer);
        return "index";
    }
    @RequestMapping("/added")
    public String added(@ModelAttribute("customer") Customer customer, Model model) {
        customerRepository.save(customer); // Used to create a new registry
        model.addAttribute("customers", customerRepository.findAll()); // Auto explanatory method
        return "added";
    }
}
