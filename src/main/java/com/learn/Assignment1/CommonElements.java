package com.learn.Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array 1:");
        int n1=sc.nextInt();
        int a[]=new int[n1];
        
        for(int i=0;i<n1;i++){
             System.out.println("Enter a["+i+"]:");
             a[i]=sc.nextInt();
        }
        System.out.print("Entered array1:");
        System.out.println(Arrays.toString(a));
        
        System.out.println("Enter size of array 2:");
        int n2=sc.nextInt();
        int b[]=new int[n2];
        
        for(int i=0;i<n2;i++){
             System.out.println("Enter b["+i+"]:");
             b[i]=sc.nextInt();
        }
        System.out.print("Entered array2:");
        System.out.println(Arrays.toString(b));
        System.out.println("Common Elements:");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                    break;

                }
            }
        }

	}

}
