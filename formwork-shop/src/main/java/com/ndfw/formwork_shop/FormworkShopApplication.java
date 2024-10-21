package com.ndfw.formwork_shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class FormworkShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormworkShopApplication.class, args);
	}

}
