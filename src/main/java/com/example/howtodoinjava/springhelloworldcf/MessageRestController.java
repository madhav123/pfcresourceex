package com.example.howtodoinjava.springhelloworldcf;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties
public class MessageRestController {

		@Value("${hyd}") 	
		 String locaiton;
		@RequestMapping("/hello")
		String getMessage(@RequestParam(value = "name") String name) {
			String rsp = "Hi " + name + " : responded on - " + new Date();
			System.out.println(rsp);
			return rsp;
		}
		
		@RequestMapping("/getlocation")
		String getMessage() {
			
			return locaiton;
		}
		
		@RequestMapping("/getlocation1")
		String getMessage1() {
			
			return "Madhav";
		}
}
