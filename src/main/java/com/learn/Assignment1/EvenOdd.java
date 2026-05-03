package com.learn.Assignment1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++){
             System.out.println("Enter a["+i+"]:");
             a[i]=sc.nextInt();
        }
       // System.out.print("Entered array:");
        //System.out.println(Arrays.toString(a));
        
        int e=0,o=0;
        
        for(int x:a){
            if(x%2==0){
                e++;
            }
            else{
                o++;
            }
        }
       System.out.println("No of even numbers = "+e);
       System.out.println("No of odd numbers = "+o );

	}

}
