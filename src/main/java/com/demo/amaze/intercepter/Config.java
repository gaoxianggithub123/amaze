package com.demo.amaze.intercepter;

import org.springframework.context.annotation.Configuration;;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class Config extends WebMvcConfigurationSupport {

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/sh/static/login/**").addResourceLocations("classpath:/static/");

        super.addResourceHandlers(registry);
    }
}