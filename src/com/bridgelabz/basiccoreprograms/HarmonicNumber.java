package com.bridgelabz.basiccoreprograms;

public class HarmonicNumber {
	public static void main(String[] args) {
		int N=10;
		int NthValue=0;
		if(N>0) {
			for(int i=1;i<=N;i++) {
				NthValue=i;
			}
			System.out.println(N+"th Harmonic value ="+"1/"+NthValue);
		}
		else {
			System.out.println("Please Enter value Greater than zero");
		}
}
}
