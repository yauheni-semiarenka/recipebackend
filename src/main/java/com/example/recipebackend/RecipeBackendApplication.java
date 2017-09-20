package com.example.recipebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RecipeBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeBackendApplication.class, args);
	}
}
