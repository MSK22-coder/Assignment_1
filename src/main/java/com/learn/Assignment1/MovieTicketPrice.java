package com.learn.Assignment1;

import java.util.Scanner;

public class MovieTicketPrice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		
		if(age<12) {
			System.out.println("Cildren price: ₹100");
		}
		else if(age>=12 && age<=60) {
			System.out.println("Adults price: ₹200");
		}
		else if(age>60) {
			System.out.println("Senior citizens price: ₹120");
		}
		else {
			System.out.println("Enter valid age");
		}
		
	}

}
