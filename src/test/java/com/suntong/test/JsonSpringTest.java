package com.suntong.test;


public class JsonSpringTest {
	public static void main(String[] args) {
		String name = new String("Hello ");
		test1(name);
		System.out.println(name);
	}
	public static void test1(String name){
		name+=" world";
	}
}
