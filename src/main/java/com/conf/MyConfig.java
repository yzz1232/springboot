package com.conf;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


public class MyConfig {
	  @Bean(name="primaryDataSource")  
	    @Primary  
	    @ConfigurationProperties(prefix="datasource.primary")  
	    public DataSource primaryDataSource() {  
	        System.out.println("-------------------- primaryDataSource init ---------------------");  
	        return DataSourceBuilder.create().build();  
	    }
	
}
