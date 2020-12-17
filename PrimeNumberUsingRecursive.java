package com.xworkz.generalaptitude;

import java.util.Scanner;

public class PrimeNumberUsingRecursive {
	public static void main(String args[]){
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number");
	int number=scanner.nextInt();
	System.out.println(number);
	boolean prime=false;
	if(number>1) {
		prime=primeNumber(number,2);
	     if(prime==false) {
	    	 System.out.println("number is not prime");
	     }else {
	    	 System.out.println(" number is prime");
	     }
	 }
    
	}


	static boolean primeNumber(int number,int i) {
		if(number>i) {
			if(number% i==0) {
		
			return false;
		}
		else {
			primeNumber(number,++i);
		//	return true;
		}
	}return true;
}
	}

