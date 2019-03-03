package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.atguigu.springcloud.dao")
@SpringBootApplication
public class Provider8001App {

	public static void main(String[] args) {
		
		SpringApplication.run(Provider8001App.class, args);
	}

}
