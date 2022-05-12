package com.yanki.account.service.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class YankiAccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(YankiAccountServiceApplication.class, args);
	}

}
