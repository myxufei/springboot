package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement // 启注解事务管理
@SpringBootApplication//SpringBoot启动核心
public class App{

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}


}
