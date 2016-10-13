package com;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;





@SpringBootApplication 
public class Starter extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args); 
	}

	  @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(this.getClass());
	    }
  
}
