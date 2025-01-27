package com.blahblah.spring.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.blahblah.spring.example")
public class ProjectConfig {

//	@Bean
//	Vehicle getVehicle() {
//		var veh = new Vehicle();
//		veh.setName("temp temp");
//		return veh;
//	}
//
//	@Bean
//	String getName() {
//		return "Spring";
//	}

}
