package learn.java.CoronaTracker.MongoDBBasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/customer")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(path = "/firstName")
    public @ResponseBody Customer getCustomerByFirstName(@RequestParam String firstName) {
        return customerRepository.findByFirstName(firstName);
    }

    @PostMapping(path = "/")
    public @ResponseBody String saveCustomer(@RequestParam String firstName, @RequestParam String lastName) {
        Customer customer = new Customer(firstName, lastName);
        customerRepository.save(customer);
        return "Customer Saved Successfully";
    }
}
