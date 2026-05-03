package com.learn.Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotateLeft {

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
        
        System.out.println("Enter no of position to shift left :");
        int k=sc.nextInt();
        
        int b[]=new int[n];
        
        for(int i=0;i<n-k;i++){
            b[i]=a[i+k];
        }
        for(int i=0;i<k;i++)
        {
            b[n-k+i]=a[i];
        }
        
        System.out.println("Array after rotating "+k+" positions left");
        System.out.println(Arrays.toString(b));

	}

}
