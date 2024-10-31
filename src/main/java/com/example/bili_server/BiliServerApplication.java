package com.example.bili_server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.bili_server.mapper")
public class BiliServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiliServerApplication.class, args);
	}

}
