package com.learn.Assignment1;

import java.util.Scanner;

public class ShoppingDiscount {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter amount");
		
		double amount=sc.nextDouble();
		
		if(amount >= 5000) {
			System.out.println("You got a discount of: "+0.3*amount);
		}
		else if(amount>=3000 && amount <5000) {
			System.out.println("You got a discount of: "+0.2*amount);
		}
		else if(amount >=1000 && amount<1000) {
			System.out.println("You got a discount of: "+0.1*amount);
		}
		else {
			System.out.println("No discount");
		}

	}

}
