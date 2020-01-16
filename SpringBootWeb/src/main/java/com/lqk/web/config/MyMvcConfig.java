package com.lqk.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addViewControllers(registry);
		registry.addViewController("/").setViewName("login");
		registry.addViewController("/index.html").setViewName("login");
//		registry.addViewController("/main.html").setViewName("dashboard");
	}
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addInterceptors(registry);
		LoginHandleInterceptor loginHandleInterceptor = new LoginHandleInterceptor();
		registry.addInterceptor(loginHandleInterceptor).addPathPatterns("/**")
		.excludePathPatterns("/","/index.html","/user/login","/asserts/**");
	}	
	
}
