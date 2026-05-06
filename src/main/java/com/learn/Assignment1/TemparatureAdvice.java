package com.learn.Assignment1;

import java.util.Scanner;

public class TemparatureAdvice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temperature");
		
		float temp=sc.nextFloat();
		
		if(temp>35) {
			System.out.println("Very hot");
		}
		else if(temp>=25 && temp<=35) {
			System.out.println("Warm");
		}
		else if(temp>=15 && temp<25) {
			System.out.println("Cool");
		}
		else {
			System.out.println("cold");
		}

	}

}
