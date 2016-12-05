package com.suntong.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.suntong.entity.Student;

@Controller
public class StudentController {
	public static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class.getName());
	
	public StudentController(){
	}
	
	@RequestMapping(method=RequestMethod.GET,
			value = "/test"
	)
	@ResponseBody
	public Map<String,Object> helloTest(String code){
		LOGGER.info("c------:{}",code); 
		List<String> strList = new ArrayList<>();
		strList.add("二货！！");
		strList.add("张三！！");
		Map<String, Object> hashMap = new HashMap<>();
		hashMap.put("sbData", strList);
		return hashMap;
		
	}
}
