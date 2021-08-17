package com.annotations.mypack;

import org.springframework.stereotype.Component;

@Component
public class Manager {

	public void speak() {
		System.out.println("He is speaking");
	}
}

