package com.liang.config;

import com.liang.pojo.person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.liang.pojo")
@Import(liangConfig.class)
public class javaConfig {

	@Bean
	public person getPerson() {
		return new person();
	}
}
