package com.cssl;

import org.springframework.boot.SpringApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cssl.dao")
@SpringBootApplication
public class APP {

	public static void main(String[] args) {
		SpringApplication.run(APP.class, args);
	}

}
