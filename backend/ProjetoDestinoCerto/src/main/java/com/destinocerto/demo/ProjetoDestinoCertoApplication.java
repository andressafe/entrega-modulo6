package com.destinocerto.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.destinocerto.model.entity"})
@EnableJpaRepositories(basePackages = {"com.destinocerto.repositories"})
@ComponentScan(basePackages = {"com.destinocerto.controller", "com.destinocerto.service", "com.destinocerto.service.impl"})
@SpringBootApplication
public class ProjetoDestinoCertoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoDestinoCertoApplication.class, args);
	}

}
