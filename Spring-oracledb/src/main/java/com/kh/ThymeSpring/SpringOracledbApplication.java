package com.kh.ThymeSpring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.kh.ThymeSpring.mapper")
@SpringBootApplication
public class SpringOracledbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOracledbApplication.class, args);
	}

}
