package com.wuqi.AutoConfigurationTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	//spring boot已经为我们自动创建，直接注入即可
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/sayHello")
	@ResponseBody
	public String sayHello() {
		return helloService.sayHello();
	}
	
}
