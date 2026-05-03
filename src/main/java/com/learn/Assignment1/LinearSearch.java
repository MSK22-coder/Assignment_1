package com.learn.Assignment1;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter size of array:");
	        int n=sc.nextInt();
	        int a[]=new int[n];
	        
	        for(int i=0;i<n;i++){
	             System.out.println("Enter a["+i+"]:");
	             a[i]=sc.nextInt();
	        }
	        
	        System.out.println("Enter search element:");
	        int s=sc.nextInt();
	        int i=0;
	        for(;i<n;i++){
	            if(a[i]==s){
	                System.out.println("Element found at "+i+" location");
	                break;
	                
	            }
	            
	        }
	        if(i>=n){
	            System.out.println("Element not found");
	        }

	}

}
