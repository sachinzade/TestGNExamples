package com.jbk;

public class BoxingandUnboxing {
	public static void main(String[] args) {
		
		//typecasting
		
		int a = 10;
		Integer i1 = new Integer(a);// datatype converts into wrapper class --> Boxing
		
		int b = i1.intValue();// wrapper class converts into datatype --> Unboxing
		
		int aa = 20;
		Integer i2 = aa; // its done automatically so it is an Auto_Boxing
		
		int b2 = i2;   // its done automatically so it is an Auto_ UnBoxing
		
		
		
	}

}
