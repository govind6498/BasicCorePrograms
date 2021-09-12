package com.bridgelabz.basiccoreprograms;

public class LargestAmongThreeNumbers {
	public static void main(String[] args) {
		int FirstNumber=210;
		int SecondNumber=300;
		int ThirdNumber=121;
		int max=(FirstNumber>SecondNumber)?(FirstNumber>ThirdNumber?FirstNumber:ThirdNumber):(SecondNumber>ThirdNumber?SecondNumber:ThirdNumber);
		System.out.println("The Maximum Number is "+max);
	}
}
