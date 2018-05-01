package com.niros.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
@RequestMapping("/hellow")
	public String sayHi() {
		return "Hi";
	}
}
