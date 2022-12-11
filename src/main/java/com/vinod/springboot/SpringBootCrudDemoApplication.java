package com.vinod.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.vinod.springboot.controller.EmployeeController;

@SpringBootApplication
@ComponentScan(basePackageClasses = EmployeeController.class)
public class SpringBootCrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudDemoApplication.class, args);
	}

}
