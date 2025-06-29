package org.brightcode.financetracker_api;

import org.springframework.boot.SpringApplication;

public class TestFinancetrackerApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(FinancetrackerApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
