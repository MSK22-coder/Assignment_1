package com.learn.Assignment1;

import java.util.Scanner;

public class ElectricityBillCalculation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter units:");
		int units=sc.nextInt();
		int bill=0;

	      if (units<=100){
	            bill=units*2;
	            System.out.println("Total eletricity bill is "+bill);
	        }
	        else if(units>100 && units<=200){
	            bill=200+((units-100)*3);
	            System.out.println("Total eletricity bill is "+bill);
	        }
	        else{
	            bill=500+((units-200)*5);
	            System.out.println("Total eletricity bill is "+bill);
	        }

	}

}
