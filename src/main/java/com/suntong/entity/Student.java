package com.suntong.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 学生实体类
 * @author suntong
 *
 */
@XmlRootElement
public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;

	private String userId;
	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
