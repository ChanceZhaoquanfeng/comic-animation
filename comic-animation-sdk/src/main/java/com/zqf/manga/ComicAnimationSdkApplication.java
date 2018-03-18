package com.zqf.manga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class ComicAnimationSdkApplication {
	@RequestMapping("/hello")
	String home() {
		return "Hello World!";
	}
	public static void main(String[] args) {
		SpringApplication.run(ComicAnimationSdkApplication.class, args);
	}
}
