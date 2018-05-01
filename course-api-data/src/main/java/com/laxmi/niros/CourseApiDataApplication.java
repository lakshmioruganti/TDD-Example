package com.laxmi.niros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.niros.courseapidata.topic") 
//@ComponentScan(basePackages = "com.niros.courseapidata.topic.TopicRepository") 
@EnableJpaRepositories("com.niros.courseapidata.topic")
public class CourseApiDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiDataApplication.class, args);
	}
}
