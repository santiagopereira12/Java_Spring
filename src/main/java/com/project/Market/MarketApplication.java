package com.project.Market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.project.Market.persistence.mapper"})
public class MarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketApplication.class, args);
	}

}
