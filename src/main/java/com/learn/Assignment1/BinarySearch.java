package com.learn.Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++){
             System.out.println("Enter a["+i+"]:");
             a[i]=sc.nextInt();
        }
        
        Arrays.sort(a);
        
        //System.out.println(Arrays.toString(a));
        
        System.out.println("Enter search element:");
        int s=sc.nextInt();
        int l=0,h=n-1;
        while(l<=h){
            int m=(h+l)/2;
            if(a[m]==s){
                System.out.println("Element found at "+m+" location");
                break;
            }
            else if(a[m] < s){
                l=m+1;
            }
            else{
                h=m-1;
            }
            
        }
        if(l>h){
            System.out.println("Element not found");
        }


	}

}
