package com.learn.Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n=sc.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++){
             System.out.println("Enter a["+i+"]:");
             a[i]=sc.nextInt();
        }
        System.out.print("Entered array:");
        System.out.println(Arrays.toString(a));
        
        int b[]=new int[n];
        
        for(int i=0;i<n;i++){
                b[i]=a[n-i-1];
            }
            
        System.out.print("Reversed array:");
        System.out.println(Arrays.toString(b));

	}

}
