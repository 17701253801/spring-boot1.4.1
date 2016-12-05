package com.suntong.fruit;

import java.lang.reflect.Field;

import com.suntong.test.Column;
import com.suntong.test.Student;

public class FruitInfoUtil {
	public static void getFruiltInfo(Class<?> clazz){
		Field[] fields = clazz.getDeclaredFields();
		
		
		for (Field field : fields) {
			if(field.isAnnotationPresent(Column.class)){
				Column c = (Column)field.getAnnotation(Column.class);
				System.out.println(c.value());
			}
		}
	}
	public static void main(String[] args) {
		FruitInfoUtil.getFruiltInfo(Student.class);
	}
}
