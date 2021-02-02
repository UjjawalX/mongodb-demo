package com.bank.mongoDemo;

import com.bank.mongoDemo.model.Customer;
import com.bank.mongoDemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class MongoDemoApplication implements CommandLineRunner {

    @Autowired
    CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(MongoDemoApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        customerRepository.deleteAll();
        customerRepository.save(new Customer("Alice", "Smith"));
        customerRepository.save(new Customer("Sumit", "Kumar"));
        System.out.println("All customers");
        System.out.println("--------------");
        for (Customer customer : customerRepository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();
        System.out.println("Customer found with first Name");
        System.out.println("--------------");
        System.out.println(customerRepository.findByFirstName("Alice"));
    }
}
