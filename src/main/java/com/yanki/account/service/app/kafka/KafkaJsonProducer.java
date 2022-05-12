package com.yanki.account.service.app.kafka;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.yanki.account.service.app.model.YankiAccount;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class KafkaJsonProducer {


    private final KafkaTemplate<String, YankiAccount> kafkaTemplate;

    public KafkaJsonProducer(@Qualifier("kafkaJsonTemplate") KafkaTemplate<String, YankiAccount> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(YankiAccount yankiAccount) {
        log.info("Producing message {}", yankiAccount);
        this.kafkaTemplate.send("TOPIC-YANKI-OPERATION", yankiAccount);
    }

}