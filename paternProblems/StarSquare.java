package com.xworkz.paternProblems;

public class StarSquare {
	public static void main(String[] args) {
		int num=5;
		for (int i=0;i<num;i++){
			for(int j=0; j<num ;j++) {
				
				if(i==0 || i==4 || j==0 || j==4)
				{
					System.out.print("*");
				}
				else
               
						System.out.print(" ");

			}
			System.out.println();
		}

	}
	
}
