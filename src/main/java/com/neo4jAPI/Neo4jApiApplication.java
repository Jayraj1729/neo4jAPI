package com.neo4jAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Neo4jApiApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().load();
		SpringApplication.run(Neo4jApiApplication.class, args);
	}

}
