package com.learn.Assignment1;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1:");
		int n1=sc.nextInt();
		System.out.println("Enter number2:");
		int n2=sc.nextInt();
		System.out.println("Enter operator(+,-,*,/):");
		String ch=sc.next();
		
		switch(ch) {
		case "+":System.out.println("Sum is "+(n1+n2));
				break;
		case "-":System.out.println("Difference is "+(n1-n2));
				break;
		case "*":System.out.println("Product is "+(n1*n2));
				break;
		case "/":System.out.println("Division is "+(n1/n2));
				break;
		default:System.out.println("Enter valid opearator");
		}
		
		
	}

}
