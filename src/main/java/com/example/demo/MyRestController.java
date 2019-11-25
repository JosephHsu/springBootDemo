package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	@RequestMapping("/")
	public String rest() {
		return "向全世界說聲Spring Boot 很高興認識你!";
	}
}
