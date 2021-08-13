package com.springcore.annotation.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springcore.javaconfig.Samosa;

@Configuration
@ComponentScan(basePackages ="com.springcore.auto.wire.annotation2")
public class JavaConfig2 {

	@Bean
	public Location getLocation() {
		return new Location();
	}
	@Bean(name= {"Product"})
	public Product getProduct() {
		// creating a new product object
		Product prod= new Product(getLocation());
		System.out.println("creating product");
		return prod;
		
	}
	
}
