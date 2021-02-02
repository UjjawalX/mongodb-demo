package com.bank.mongoDemo.model;
import org.springframework.data.annotation.Id;

public class Channel {
    @Id
    String Id;
    String customerId;
    String channelName;
    String status;

    public Channel(String id, String customerId, String channelName, String status) {
        Id = id;
        this.customerId = customerId;
        this.channelName = channelName;
        this.status = status;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Channels{" +
                "Id='" + Id + '\'' +
                ", customerId='" + customerId + '\'' +
                ", channelName='" + channelName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
