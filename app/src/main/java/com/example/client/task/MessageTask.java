package com.example.client.task;

import com.example.service.Message;
import com.example.client.client.MessageClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageTask {

    @Autowired
    private MessageClient messageClient;

    @Scheduled(initialDelay = 5000, fixedRate = 5000)
    public void execute() {
        log.info("Running message task.");
        Message message = messageClient.message();
        log.info("Received message {}.", message);
    }

}
