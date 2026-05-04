package com.learn.Assignment1;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter age:");
		
	    int age=sc.nextInt();
	    
	    if(age>=18) {
	    	if(age>100) {
	    		System.out.println("Not eligible");
	    	}
	    	else {
	    		System.out.println("Eligible");
	    	}
	    }
	    else {
	    	System.out.println("Not Eligible");
	    }
	}

}
