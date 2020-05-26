package com.example.tradeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans({
		@ComponentScan("com.example.tradeservice.entity"),
		@ComponentScan("com.example.tradeservice")
})
@EntityScan({
		"com.example.tradeservice.entity"
})
@EnableJpaRepositories({
		"com.example.tradeservice.entity",
		"com.example.tradeservice.repository"
})
public class TradeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeServiceApplication.class, args);
	}

}
