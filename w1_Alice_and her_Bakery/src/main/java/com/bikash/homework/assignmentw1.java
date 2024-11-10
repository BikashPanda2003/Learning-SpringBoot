package com.bikash.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class assignmentw1 implements CommandLineRunner {
	@Autowired
	private CakeBaker c;

	public static void main(String[] args) {
		SpringApplication.run(assignmentw1.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(c.bakeCake());
	}
}
