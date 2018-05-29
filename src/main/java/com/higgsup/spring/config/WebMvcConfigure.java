package com.higgsup.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by anhvu on 28-May-18.
 */
@Configuration
public class WebMvcConfigure implements WebMvcConfigurer {

//    @Bean
//    public ViewResolver viewResolver() {
//        InternalResourceViewResolver resolver
//                = new InternalResourceViewResolver();
//        resolver.setPrefix("templates");
//        resolver.setSuffix("html");
//        return resolver;
//    }

    @Override
    public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/resources/")
                .resourceChain(true).addResolver(new PathResourceResolver());
    }
}