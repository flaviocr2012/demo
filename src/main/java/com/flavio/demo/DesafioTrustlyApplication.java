package com.flavio.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DesafioTrustlyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioTrustlyApplication.class, args);
	}

}
