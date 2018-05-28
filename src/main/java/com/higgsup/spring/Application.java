package com.higgsup.spring;

import com.higgsup.spring.controller.Hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
@EntityScan("com.higgsup.spring.model")
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("helloController" + context.getBean(Hello.class) );
		System.out.println("viewResolver" + context.getBean("viewResolver") );
		System.out.println("dispatcherServlet" + context.getBean("dispatcherServlet") );
	}

//	@Bean
//	public DispatcherServlet dispatcherServlet() {
//		return new DispatcherServlet();
//	}
//
//	@Bean
//	public ServletRegistrationBean dispatchServletRegistration() {
//
//		ServletRegistrationBean registration = new ServletRegistrationBean(
//				dispatcherServlet(), "/");
//
//		registration
//				.setName(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_REGISTRATION_BEAN_NAME);
//
//		return registration;
//
//	}
}
