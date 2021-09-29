package com.optimagrowth.license.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(value = "example")
public class ServiceConfig {

    private String property;

    public String getProperty(){
        return property;
    }

    public void setProperty(String property){
        this.property = property;
    }
}
