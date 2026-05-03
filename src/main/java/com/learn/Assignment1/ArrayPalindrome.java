package com.learn.Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPalindrome {

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
        
        
        boolean palindrome = true;

        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - 1 - i]) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println("Array is a Palindrome");
        } else {
            System.out.println("Array is not a Palindrome");
        }

	}

}
