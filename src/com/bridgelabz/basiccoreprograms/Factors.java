package com.bridgelabz.basiccoreprograms;

public class Factors {
	public static void main(String[] args) {
		int N=189;
		System.out.println("Prime factor of "+N+" are: ");
		while(N%2==0) {
			System.out.print(2+" ");
			N/=2;
		}
		for(int i=2;i*i<=N;i++) {
			while(N%i==0) {
				if(N%i==0) {
					System.out.print(i+" ");
					N/=i;
				}
			}
		}
		if(N>2) {
			System.out.println(N);
		}
	}
}
