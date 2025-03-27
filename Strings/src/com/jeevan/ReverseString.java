package com.jeevan;

public class ReverseString {
	public static void main(String[] args) {
		String s = "Jeevan";
		char c[] = s.toCharArray();
		for(int i = s.length()-1;i>=0;i--) {
			System.out.print(c[i]);
		}
	}
}
