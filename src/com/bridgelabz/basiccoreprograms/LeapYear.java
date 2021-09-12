package com.bridgelabz.basiccoreprograms;

public class LeapYear {
	public static void main(String[] args) {
		int Year=1996;
		if(Integer.toString(Year).length()!=4) {
			System.out.println("Please enter the year in 4 digit");
		}
		else {
			if(Year%4==0 && Year%100!=0||Year%400==0) {
				System.out.println("it is a leap Year");
			}
			else {
				System.out.println("It is not leap Year");
			}
		}

	}
}
