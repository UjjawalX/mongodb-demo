package com.bank.mongoDemo.repository;

import com.bank.mongoDemo.model.Channel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelsRepository extends MongoRepository<Channel, String> {

}
