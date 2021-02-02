package com.bank.mongoDemo.repository;

import com.bank.mongoDemo.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer,String> {
    public Customer findByFirstName(String firstName);
    public Customer findByLastName(String lastName);
    public void deleteById(String id);
}
