package com.suntong.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.suntong.service.StudentSerivce;

@Component
//@ComponentScan(basePackageClasses={StudentSerivce.class})
public class InitTest implements CommandLineRunner{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(InitTest.class.getName());
	
	
	@Autowired
	StudentSerivce studentService;
	
	
	private void init() {
		// TODO Auto-generated method stub
		LOGGER.info("init()");
		studentService.testStudent("Hello World!!");
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("aaaaaa*****aaaa");
		init();
	}
}
