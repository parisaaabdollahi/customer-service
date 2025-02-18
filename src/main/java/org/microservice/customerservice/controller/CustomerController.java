package org.microservice.customerservice.controller;

import org.microservice.customerservice.Service.CustomerService;
import org.microservice.customerservice.entity.CustomerEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("list")
    public List<CustomerEntity>  getAllCustomers() {
        return customerService.findAll();
    }

    @PostMapping("create")
    public CustomerEntity createCustomer(@RequestBody CustomerEntity customerEntity) {
        return customerService.save(customerEntity);
    }

}
