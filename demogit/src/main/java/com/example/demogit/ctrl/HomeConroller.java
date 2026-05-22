package com.example.demogit.ctrl;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HomeConroller {

	@GetMapping
	public String getMethodName(@RequestParam String param) {
		return "좋은아침입니다";
	}
	
	
}
