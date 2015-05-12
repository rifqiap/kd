package com.rifqi.springformwizard.init;

import com.rifqi.springformwizard.validator.CustomerValidator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan("com.rifqi.springformwizard")
public class WebAppConfig{
    
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver(){
        InternalResourceViewResolver resolver=new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
    
    @Bean
    public CustomerValidator customerValidator(){
        return new CustomerValidator();
    }
    
    @Bean(name = "messageSource")
    public ResourceBundleMessageSource resourceBundleMessageSource(){
        ResourceBundleMessageSource bundleMessageSource=new ResourceBundleMessageSource();
        bundleMessageSource.setBasename("messages");
        return bundleMessageSource;
    }
}
