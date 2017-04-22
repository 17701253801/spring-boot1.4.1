package com.suntong.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.suntong.entity.Student;

@Controller
@RequestMapping(path = "/student")
public class StudentController {
	public static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class.getName());

	public StudentController() {
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, value = "/test", consumes = { "application/*" }, produces = {
			"application/*" })
	public Student helloTest(@RequestBody Student stu) {
		Student t = new Student();
		t.setName("孙梓晨");
		t.setUserId("0056");
		return t;
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, consumes = { "application/*" }, produces = {
			"application/*" }, value = "/getTest")
	public Student getTest() {
		Student t = new Student();
		t.setName("suntong22");
		t.setUserId("4445555");
		return t;
	}

	@ResponseBody
	@RequestMapping(value = "/getHead", method = RequestMethod.HEAD, produces = "application/*")
	public Student getHead() {
		LOGGER.info("======");
		Student t = new Student();
		t.setName("head");
		t.setUserId("userid");
		return t;
	}
}
