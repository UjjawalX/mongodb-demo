package com.bank.mongoDemo.controller;

import com.bank.mongoDemo.model.Customer;
import com.bank.mongoDemo.repository.ChannelsRepository;
import com.bank.mongoDemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    ChannelsRepository channelsRepository;
    @PostMapping("/customer")
    public void addCustomer(@RequestBody  Customer customer){
        customerService.addCustomer(customer);
    }

    @DeleteMapping("/customer")
    public void deleteCustomer(@RequestParam String customerId){
        customerService.deleteCustomer(customerId);

    }


}
