package com.liang.config;

import com.liang.pojo.person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.liang.pojo.cat")
public class JavaConfig {

	@Bean
	public person getPerson() {
		return new person();
	}
}
