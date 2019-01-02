package com.example.client.client;

import com.example.service.Message;
import com.example.service.MessageApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(
    name = "peer-service",
    fallback = MessageClient.Fallback.class
)
public interface MessageClient extends MessageApi {

    @Slf4j
    @Component
    class Fallback implements MessageClient {

        @Override
        public Message message() {
            log.warn("message() fallback used.");
            return new Message();
        }
    }

}