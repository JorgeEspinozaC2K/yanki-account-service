package com.yanki.account.service.app.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import com.yanki.account.service.app.model.YankiAccount;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class KafkaJsonConsumer {

    @KafkaListener(topics = "TOPIC-DEMO-JSON", groupId = "group_id")
    public void consume(YankiAccount message, Acknowledgment ack) {
        log.info("Consuming Message {}", message);
        ack.acknowledge(); // <-- ack
    }

}
