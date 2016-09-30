package com.conf;


import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

//@Configuration
public class MyConfiguration {
//@Bean
public HttpMessageConverters customConverters() {
	MappingJackson2HttpMessageConverter additional = new MappingJackson2HttpMessageConverter();
	List<MediaType> list = new ArrayList<MediaType>();
	//MediaType type = new MediaType("application/json;charset=UTF-8");
	list.add(MediaType.APPLICATION_JSON_UTF8);
	additional.setSupportedMediaTypes(list);
	return new HttpMessageConverters(additional);
	}
}
