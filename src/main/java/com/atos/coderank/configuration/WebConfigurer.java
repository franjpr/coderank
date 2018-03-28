package com.atos.coderank.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.atos.coderank.components.RequestInterceptor;

@Configuration
public class WebConfigurer extends WebMvcConfigurerAdapter{

	@Autowired
	@Qualifier("requestInterceptor")
	private RequestInterceptor ri;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(ri);
	}

}
