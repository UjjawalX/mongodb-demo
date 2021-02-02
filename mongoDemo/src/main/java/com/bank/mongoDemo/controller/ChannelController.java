package com.bank.mongoDemo.controller;

import com.bank.mongoDemo.model.Channel;
import com.bank.mongoDemo.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChannelController {
    @Autowired
    ChannelService channelService;

    @PostMapping("/channel")
    public void addChannel(@RequestBody Channel channel) {
        channelService.addChannel(channel);
    }
}
