package com.bitware.nutrinet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@ComponentScan({"com.bitware.nutrinet"})
//@EntityScan("com.delivery.domain")
//@EnableJpaRepositories("com.bitware.nutrinet.repository")
public class BitwareSpringExamApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(BitwareSpringExamApplication.class, args);
	}

}
