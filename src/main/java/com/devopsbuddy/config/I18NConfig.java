package com.devopsbuddy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class I18NConfig {

   @Bean
    public ReloadableResourceBundleMessageSource messageSource(){
       ReloadableResourceBundleMessageSource reloadableResourceBundleMessageSource = new ReloadableResourceBundleMessageSource();
       reloadableResourceBundleMessageSource.setBasename("classpath:i18n/messages");
       reloadableResourceBundleMessageSource.setCacheSeconds(1800);
       return reloadableResourceBundleMessageSource;
   }
}
