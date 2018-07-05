package com.gensoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Production house.
 * <p>
 * @author Anand Golechha, Copyright © 2018 GenSoft inc. All rights reserved.
 */
@SpringBootApplication
@EnableJpaAuditing
public class Ph0100Application {

	public static void main(String[] args) {
		SpringApplication.run(Ph0100Application.class, args);
	}
}
