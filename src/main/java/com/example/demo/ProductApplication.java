package com.example.demo;

import java.awt.Image;
import java.net.URL;

import javax.swing.text.html.ImageView;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import entities.product;
import repositories.product_repository;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}
	
	CommandLineRunner start(product_repository productRepository) {
		
		return args -> {
			productRepository.save(new product(null, "PC lenovo", 2400, "C:\\Users\\Omaym\\Downloads"));
			productRepository.save(new product(null, "PC hp", 3000, "C:\\Users\\Omaym\\Downloads"));
			productRepository.save(new product(null, "PC Asus", 1900, "C:\\Users\\Omaym\\Downloads"));
			productRepository.findAll().forEach(cp ->{
				System.out.println(cp.getName());
				System.out.println(cp.getPrice());
			}
			);

			
		};
		
	}

}
