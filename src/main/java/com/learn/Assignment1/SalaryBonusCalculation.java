package com.learn.Assignment1;

import java.util.Scanner;

public class SalaryBonusCalculation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter salary:");
		double salary=sc.nextDouble();
		
		System.out.println("Enter experience:");
		double exp=sc.nextDouble();
		
		if (exp > 10){
            salary=salary+(0.2*salary);
            System.out.println("Salary including bonus ="+salary);
        }
        else if (exp >= 5 && exp <=10){
            salary=salary+(0.1*salary);
            System.out.println("Salary including bonus ="+salary);
        }
        else if (exp >= 1 && exp <=4){
            salary=salary+(0.05*salary);
            System.out.println("Salary including bonus ="+salary);
        }
        else{
            System.out.println("No bonus salary="+salary);
        }

		
	}

}
