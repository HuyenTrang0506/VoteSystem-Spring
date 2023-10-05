package com.example.votingsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class VotingSystem {

	public static void main(String[] args) {
		SpringApplication.run(VotingSystem.class, args);
	}

}
