package com.cssl;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.cssl.intercepter.MyIntercepter;

@Component
public class MyWebMvcConfig implements WebMvcConfigurer {

	//添加拦截器
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addInterceptors(registry);
		HandlerInterceptor handlerInterceptor = new MyIntercepter();
		System.out.println("MyWebMvcConfig中添加了MyIntercepter");
		registry.addInterceptor(handlerInterceptor).addPathPatterns("/**").excludePathPatterns("/image/**,/js/**,/*.html");
	}
	
	
	
	

}
