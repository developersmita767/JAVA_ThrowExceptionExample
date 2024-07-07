//package com.example;

public class ThrowExample {

	public static void main(String[] args) {
		
		try {
			divide(10, 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public static void divide(int num,int divisor) throws Exception {
		/*try {
		double res=num/divisor;
		System.out.println( res);
		}catch(ArithmeticException e) {
			throw new Exception("Cannot divide by zero");
		}*/
		if(divisor==0) {
			throw new Exception("Cannot divide by zero");
		}
		
	}

}
