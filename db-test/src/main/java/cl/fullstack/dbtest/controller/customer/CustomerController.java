package cl.fullstack.dbtest.controller.customer;

import cl.fullstack.dbtest.model.customer.Customer;
import cl.fullstack.dbtest.repository.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class CustomerController {

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
        customer = new Customer(); // To guarantee a clean object
        model.addAttribute("customer", customer);
        return "index/index";
    }

    @RequestMapping("/added")
    public String added(@ModelAttribute("customer") Customer customer,
                        Model model) {
        customerRepository.saveAndFlush(customer); // Used to create a new registry
        model.addAttribute("customers", customerRepository.findAll()); // Auto explanatory method
        return "index/added";
    }

    @GetMapping("/find")
    public String find(@RequestParam String name, Model model) {
        model.addAttribute("customers", customerRepository.findCustomerByName(name));
        return "index/find";
    }

    @RequestMapping("/find-all")
    public String findAll(Model model) {
        model.addAttribute("customers", customerRepository.findAll());
        return "index/find";
    }

    @PostMapping("/action")
    public String getAction(@RequestParam String action, Model model,
                            @RequestParam Long id) {
        customer = customerRepository.getOne(id);
        model.addAttribute("customer", customer);

        if (action.equals("update")) return "index/update";
        else customerRepository.deleteById(id);

        return "index/deleted";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("customer") Customer customer,
                         Model model, @RequestParam Long id) {
        // To update a registry, just call for it and set new values
        this.customer = customerRepository.getOne(id);
        this.customer.setName(customer.getName());
        this.customer.setLastName(customer.getLastName());
        this.customer.setAddress(customer.getAddress());
        customerRepository.saveAndFlush(this.customer);
        model.addAttribute("customers", customerRepository.findAll());
        return "index/added";
    }

    @PostMapping("/profile")
    public String getProfile(HttpSession session,
                             @RequestParam Long id) {
        customer = customerRepository.getOne(id);
        session.setAttribute("customer", customer);
        return "redirect:/" + customer.getName().toLowerCase();
    }

}