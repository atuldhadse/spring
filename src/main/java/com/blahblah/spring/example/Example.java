package com.blahblah.spring.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Vehicle vehicle = context.getBean(Vehicle.class);
		System.out.println(vehicle.getName());
	}

}
