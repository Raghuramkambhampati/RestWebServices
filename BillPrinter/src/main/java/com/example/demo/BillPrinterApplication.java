package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.raghu.repository.ItemRepository;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.raghu.Controllers"})
@SpringBootApplication
@EnableMongoRepositories(basePackageClasses=ItemRepository.class)
public class BillPrinterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillPrinterApplication.class, args);
	}
}
