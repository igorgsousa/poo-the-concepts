package com.basic.test;

public class Calculator {
	
	private static int OPERATION_COUNT = 0; 
	
	//normal - cientifica
	private String method;
	
	public Calculator(String method) {
		super();
		this.method = method;
	}

	public static int getOperationCount() {
		return Calculator.OPERATION_COUNT;
	}
	
	public static double calcPow(int num, int pow) {
		Calculator.OPERATION_COUNT ++;
		return Math.pow(num, pow);
	}
	
}
