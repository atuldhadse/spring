package com.blahblah.spring.example;

import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//		Vehicle vehicle = context.getBean(Vehicle.class);
//		System.out.println(vehicle.getName());

		// register a bean with a condition

		Supplier<Vehicle> altoSupplier = () -> {
			Vehicle alto = new Vehicle();
			alto.setName("blah blah alto");
			return alto;
		};

		Vehicle audi = new Vehicle();
		audi.setName("blah blah audi");
		Supplier<Vehicle> audiSupplier = () -> audi;

		int num = 10;
		if ((num & 1) == 0) {
			context.registerBean("alto", Vehicle.class, altoSupplier);
		} else {
			context.registerBean("audi", Vehicle.class, audiSupplier);
		}

		var altoObj = context.getBean("alto", Vehicle.class);
		System.out.println(altoObj.getName());

		context.close();
	}

}
