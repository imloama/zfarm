package com.github.imloama.zfarm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.github.imloama.zfarm.mapper")
@SpringBootApplication
public class ZFarmApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ZFarmApplication.class, args);
	}

}