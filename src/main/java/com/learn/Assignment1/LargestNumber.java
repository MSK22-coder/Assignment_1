package com.learn.Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++){
             System.out.println("Enter a["+i+"]:");
             a[i]=sc.nextInt();
        }
        System.out.print("Entered array:");
        System.out.println(Arrays.toString(a));
        
        int max=a[0],l=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
                l=i;
            }
        }
        System.out.println("Maximum element is "+max+" at location "+(l+1));
       


	}

}
