package com.bridgelabz.basiccoreprograms;

public class AlphabetIsVowelOrConsonant {
	public static void main(String[] args) {
		char ch='a';
		char c = Character.toUpperCase(ch);
		if(c=='A'|| c=='E'||c=='I' ||c=='O' ||c=='U') {
			System.out.println(ch+" is Vowel");
		}
		else {
			System.out.println(ch+" is Consonent");
		}
	}
}
