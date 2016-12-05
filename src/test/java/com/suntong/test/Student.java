package com.suntong.test;

@Table(tableName="Student")
public class Student {
	
	@Column(name="zhujiename",value="suntong")
	private String name;
	
	
	private String sex;
	
	private String phone;
	
	public String getName() {
		return name;
	}
	
	public void setName( String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
