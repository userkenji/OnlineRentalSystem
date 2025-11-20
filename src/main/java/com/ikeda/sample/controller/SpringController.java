package com.ikeda.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	
	@GetMapping(value = "/sample")
	public String method() {
		return "byebye";
	}

}
