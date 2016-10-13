package com.conf;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.server.MulipDataSource;


@Configuration 
public class MyConfig {
	

	    @Autowired
	    private Environment env;
	
		@Bean(name="primaryDataSource")
	    public DataSource primaryDataSource() throws Exception {  
			Properties props = new Properties();
			props.put("driverClassName", env.getProperty("spring.datasource.driver-class-name"));
			props.put("url", env.getProperty("spring.datasource.url"));
			props.put("username", env.getProperty("spring.datasource.username"));
			props.put("password", env.getProperty("spring.datasource.password"));
			return DruidDataSourceFactory.createDataSource(props);
	    }
		
		@Bean(name="two")
	    public DataSource two() throws Exception {  
			Properties props = new Properties();
			props.put("driverClassName", env.getProperty("spring.datasource.driver-class-name2"));
			props.put("url", env.getProperty("spring.datasource.url2"));
			props.put("username", env.getProperty("spring.datasource.username2"));
			props.put("password", env.getProperty("spring.datasource.password2"));
			return DruidDataSourceFactory.createDataSource(props);
	    }
		
		@Primary
		@Bean
		public MulipDataSource dataSource(@Qualifier("primaryDataSource") DataSource myTestDbDataSource,
				              @Qualifier("two") DataSource myTestDb2DataSource){
			Map<Object, Object> targetDataSources = new HashMap<>();
			targetDataSources.put("one", myTestDbDataSource);
			targetDataSources.put("two", myTestDb2DataSource);
			MulipDataSource dataSource = new MulipDataSource();
			dataSource.setTargetDataSources(targetDataSources);
			dataSource.setDefaultTargetDataSource(myTestDbDataSource);
			return dataSource;
		}
		
	
}
