package com.conf;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.server.MulipDataSource;

@Configuration
@AutoConfigureAfter(MyConfig.class)
public class MyBatisConfig {
	
	@Autowired
	private  DataSource dataSource;
	
	 @Bean(name = "sqlSessionFactory")
	    public SqlSessionFactory sqlSessionFactoryBean() {
	        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
	        bean.setDataSource(dataSource);
	        //添加XML目录
	        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
	        try {
	            bean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
	            return bean.getObject();
	        } catch (Exception e) {
	            e.printStackTrace();
	            throw new RuntimeException(e);
	        }
	      
	    }
}
