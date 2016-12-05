package com.suntong.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.suntong.entity.Student;

public class Test{
	private static final Logger LOGGER = LoggerFactory.getLogger(Test.class.getName());
	public static void main(String[] args) {
	}
	
	/**
	 * 文件流处理
	 */
	@SuppressWarnings("unused")
	private void fileTest(){
		File tFile = new File("target/classes/com/suntong/entity/Student.class");
		if(tFile.exists()){
			try {
				FileInputStream fileInputStream = new FileInputStream(tFile);
				int length = fileInputStream.available();
				byte[] bytes = new byte[length];
				fileInputStream.read(bytes);
				fileInputStream.close();
				LOGGER.info("魔数(magic):0x"+Integer.toHexString(bytes[0]).substring(6).toUpperCase());
				LOGGER.info(bytes.toString());
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				System.out.println("Hello World!");
			}
		}
	}
	
	private ObjectInputStream tInputStream;
	
	@org.junit.Test
	public void test12(){
		Student t = new Student();
		t.setName("sutnong");
		t.setUserId("0001");
		System.out.println(t.getName());
		System.err.println(t.getUserId());

		try {
			FileOutputStream tStream = new FileOutputStream("D:/student.txt");
			ObjectOutputStream object = new ObjectOutputStream(tStream);
			object.writeObject(t);
			object.flush();
			object.close();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			tInputStream = new ObjectInputStream(new FileInputStream("D:/student.txt"));
			Student tStu = (Student)tInputStream.readObject();
			System.out.println(tStu.getName());
			System.err.println(tStu.getUserId());
		} catch(Exception exception){
			System.out.println(exception.getMessage());
		}
		
	}
	
	@org.junit.Test
	public void test3(){
		LOGGER.info("文件的搭建");
	}

}
