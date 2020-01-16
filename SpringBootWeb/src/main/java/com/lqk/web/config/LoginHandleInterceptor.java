package com.lqk.web.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;


public class LoginHandleInterceptor implements HandlerInterceptor{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		Object user = request.getSession().getAttribute("loginUser");
		if(user == null) {
			//返回登录页面
			request.getRequestDispatcher("/index.html").forward(request, response);
			return false;
		}else {			
			return true;
		}
	}
}
