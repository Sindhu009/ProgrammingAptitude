package com.xworkz.patternProblems;

public class Diagonal {
	public static void main(String[] args) {

		int num=4;
		for (int i=0;i<=num;i++){
			for(int j=0;j<=num;j++) {
				if(i==j) 
				System.out.print("*");
			else 
				System.out.print(" ");
			}
		System.out.println();
			}
		
		
		System.out.println("-----------------");
		for (int i=0;i<=num;i++){
			for(int j=0;j<=num;j++) {
				if(i==j || i+j==4) 
				System.out.print("*");
			else 
				System.out.print(" ");
			}
		System.out.println();
			}

}}
