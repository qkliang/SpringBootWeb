package com.lqk.web.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "hello World!!!";
	}
	@RequestMapping("/success")
	public String success(Map<String,String> map) {
		map.put("hello", "你好！！");
		System.out.println("123");
		return "success";
	}
}
