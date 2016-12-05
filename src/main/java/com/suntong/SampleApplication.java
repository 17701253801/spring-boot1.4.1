package com.suntong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动程序
 * @author suntong
 *
 */
@SpringBootApplication
@EnableScheduling
public class SampleApplication implements CommandLineRunner{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SampleApplication.class);
	
	public static void main(String[] args) { 
		// 进行热部署操作
		System.setProperty("spring.devtools.restart.enabled", "true");
		LOGGER.info("增加了热部署的操作！");
		SpringApplication.run(SampleApplication.class, args);
	}
	@Override 
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	}
}
