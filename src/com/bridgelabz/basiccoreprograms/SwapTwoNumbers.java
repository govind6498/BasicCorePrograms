package com.bridgelabz.basiccoreprograms;

public class SwapTwoNumbers {
	public static void main(String[]args) {
		int FirstNumber=5,SecondNumber=15;
		System.out.println("Before Swaping FirstNumber="+FirstNumber+" and SecondNumber="+SecondNumber);
		FirstNumber=FirstNumber+SecondNumber;
		SecondNumber=FirstNumber-SecondNumber;
		FirstNumber=FirstNumber-SecondNumber;
		System.out.println("After  Swaping FirstNumber="+FirstNumber+" and SecondNumber="+SecondNumber);	
		
	}
}
