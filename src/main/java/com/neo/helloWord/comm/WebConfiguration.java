package com.neo.helloWord.comm;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
* @author rh
* @version 创建时间：2017年11月13日 下午1:27:15
* 过滤链
*/
@Configuration
public class WebConfiguration {

	@Bean
	public RemoteIpFilter remoteIpFilter(){
		return new RemoteIpFilter();
	}
	@Bean
	public FilterRegistrationBean testFilterRegistration(){
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		
		registrationBean.setFilter(new MyFilter());
		registrationBean.addUrlPatterns("/*");
		registrationBean.addInitParameter("paramName", "paramValue");
		registrationBean.setName("MyFilter");
		registrationBean.setOrder(1);
		return registrationBean;
	}
	
}
