package com.ibm.demoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoAppController {
	@GetMapping("getMsg")
	public String getMessge() {
		return "Hello From IBM Kubernates Cluster !!";
	}

}
