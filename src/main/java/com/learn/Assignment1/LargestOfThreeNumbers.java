package com.learn.Assignment1;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number1");
		int n1=sc.nextInt();
		System.out.println("Enter Number2");
		int n2=sc.nextInt();
		System.out.println("Enter Number3");
		int n3=sc.nextInt();
		
		if(n1>n2) {
			if(n1>n3) {
				System.out.println(n1+" is greater Number");
			}
			else {
				System.out.println(n3+" is greater Number");
			}
		}
		else {
			if(n2>n3) {
				System.out.println(n2+" is greater Number");
			}
			else {
				System.out.println(n3+" is greater Number");
			}
		}

	}

}
