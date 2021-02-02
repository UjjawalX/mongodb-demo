package com.bank.mongoDemo.service;

import com.bank.mongoDemo.model.Channel;
import com.bank.mongoDemo.model.Customer;
import com.bank.mongoDemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    MongoTemplate mongoTemplate;
    public void addCustomer(Customer customer){
        customerRepository.save(customer);
    }
    @Transactional
    public void deleteCustomer(String customerId){
        customerRepository.deleteById(customerId);
        Query query = new Query();
        query.addCriteria(Criteria.where("customerId").is(customerId));
        Update update = new Update();
        update.set("status", "Inactive");
        mongoTemplate.updateMulti(query, update, Channel.class);
    }
}
