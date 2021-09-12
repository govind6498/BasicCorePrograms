package com.bridgelabz.basiccoreprograms;

public class FlipCoin {
	public static void main(String[] args) {
		int NumberOfFlips=10;
		if(NumberOfFlips<=0) {
			System.out.println("Please Enter a positive integer value of number flip");
		}
		else {
			int NumerOfHeads=0;
			for(int i=0;i<NumberOfFlips;i++) {
					double value=Math.random();
					if(value<.5) {
						NumerOfHeads++;
					}
			}
			System.out.println("Number of Heads:"+NumerOfHeads*100/NumberOfFlips);
			System.out.println("Number of tails:"+(NumberOfFlips-NumerOfHeads)*100/NumberOfFlips);
		}

	}
}
