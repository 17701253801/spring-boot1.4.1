package com.suntong.test;

import java.lang.annotation.Inherited;

@Inherited
public @interface Greeting {
	enum  FontColor{RED,YELLO,BLUE};
	
	String name() ;
	
	FontColor fontColor() default FontColor.BLUE;
	
}
