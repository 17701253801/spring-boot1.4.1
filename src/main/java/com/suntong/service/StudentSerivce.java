package com.suntong.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class StudentSerivce {

	private static final Logger LOGGER = LoggerFactory.getLogger(StudentSerivce.class.getName());
	
	public StudentSerivce(){
		LOGGER.info("StudentSerivce");
	}
	/**
	 * @param number
	 */
	public void testStudent(String number){
		LOGGER.info(number);
	}
}
