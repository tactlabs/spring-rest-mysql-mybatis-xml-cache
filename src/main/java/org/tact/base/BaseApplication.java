package org.tact.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@EnableCaching
@MapperScan("org.tact.base.mybatis.mapper")
public class BaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseApplication.class, args);
	}
}
