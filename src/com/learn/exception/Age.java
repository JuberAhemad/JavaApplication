package com.learn.exception;

public class Age extends Exception{
	
	static String str="Age must be greater than or equal to 18 years";
	public Age() {
      super(str);
	}
}
