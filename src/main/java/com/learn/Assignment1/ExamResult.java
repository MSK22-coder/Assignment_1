package com.learn.Assignment1;

import java.util.Scanner;

public class ExamResult {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks: ");
		double marks=sc.nextDouble();
		System.out.println("Enter attendance: ");
		double att=sc.nextDouble();
        if(marks>=50 && att>=75){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

	}

}
