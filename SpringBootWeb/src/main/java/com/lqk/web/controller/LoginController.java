package com.lqk.web.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@PostMapping(value = "/user/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password, Map<String, Object> map,
			HttpSession session) {
		System.out.println("userName:"+ username);
		System.out.println("password:"+ password);
		if (!StringUtils.isEmpty(username) && "1".equals(password)) {
			System.out.println(username);
			session.setAttribute("loginUser", username);
			return "redirect:/main.html";
		} else {
			return "login";
		}
	}
}
