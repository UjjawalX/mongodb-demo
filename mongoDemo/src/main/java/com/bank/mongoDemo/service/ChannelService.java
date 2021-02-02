package com.bank.mongoDemo.service;

import com.bank.mongoDemo.model.Channel;
import com.bank.mongoDemo.repository.ChannelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChannelService {
    @Autowired
    ChannelsRepository channelsRepository;
    public void addChannel(Channel channel){
        channelsRepository.save(channel);
    }


}
