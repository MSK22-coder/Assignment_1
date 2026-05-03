package com.learn.Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {

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
        
        int []a1=Arrays.copyOf(a,n);
        Arrays.sort(a);
        //System.out.println(Arrays.toString(a1));
        //System.out.println(Arrays.toString(a));
        
        int min=a[1],l=0;
        
        for(int i=0;i<n;i++){
            if(a1[i]==min){
                l=i;
                break;
                
            }
            
        }

        
        
        
       System.out.println("Second smallest element is "+min+" at location "+(l+1));

	}

}
