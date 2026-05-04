package com.learn.Assignment1;

import java.util.Scanner;

public class StudentGradeSystem {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks:");
		int marks=sc.nextInt();
		
		if(marks>=90 && marks<=100) {
			System.out.println("Grade: A");
		}
		else if(marks>=75 && marks<90) {
			System.out.println("Grade: B");
		}
		else if(marks>=50 && marks<75) {
			System.out.println("Grade: C");
		}
		else if(marks<50) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Enter valid marks!");
		}

	}

}
