package com.jeevan;

public class PallindromeString {
	public static void main(String[] args) {
		String s = "mam";
		
		char a[] = s.toCharArray();
		String s1 = "";
		
		for(int i = s.length()-1;i>=0;i--) {
			s1 = s1+a[i];
		}
			
			if(s.equals(s1)){
			System.out.print("This String is pallindrome");
			}
			else {
				System.out.println("This string is not pallindrome");
			}
			
		
	}
}
