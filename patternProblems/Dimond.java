package com.xworkz.patternProblems;

public class Dimond {
	public static void main(String[] args) {
		int num = 8;
		int mid = num / 2;
		

		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if ((i + j == mid || j - i == mid) || (i - j == mid || i + j == num + mid))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
