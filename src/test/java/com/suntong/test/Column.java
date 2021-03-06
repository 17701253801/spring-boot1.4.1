package com.suntong.test;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Column {
	String name() default "fieldName";
	
	String setFuncName() default "setField";
	
	String getFuncName() default "getField";
	
	boolean defaultDBValue() default false;
	
	String value() default "";
	
}
