package com.nirios.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.niros.springbootstarter.toppic") 
public class CourseApiapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SpringApplication.run(CourseApiapp.class, args);
	
	}
}
