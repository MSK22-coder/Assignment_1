package com.learn.Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class PriceAterDiscount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array(Number or products:");
        int n=sc.nextInt();
        double a[]=new double[n];
        
        for(int i=0;i<n;i++){
             System.out.println("Enter price["+i+"]:");
             a[i]=sc.nextInt();
        }
        System.out.print("Entered prices:");
        System.out.println(Arrays.toString(a));
        
        for(int i=0;i<n;i++){
            a[i]=a[i]-(0.1*a[i]);
        }
        System.out.print("After discount:");
        System.out.println(Arrays.toString(a));
	}

}
