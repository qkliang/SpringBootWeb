package com.lqk.web.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@PostMapping(value = "/user/login")
	public String login(String username, String password, Map<String, Object> map, HttpSession session) {
		if(StringUtils.isEmpty(username)) {
			
		session.setAttribute("loginUser", username);
		return "redirect:/main.html";
		}else {
			return "login";
		}
	}
}
