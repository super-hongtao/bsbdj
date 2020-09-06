package com.ftg.bsbdj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.ftg.bsbdj.mapper")
@EnableScheduling//启动任务调度
public class BsbdjApplication {

	public static void main(String[] args) {
		SpringApplication.run(BsbdjApplication.class, args);
	}

}
