package com.learn.Assignment1;

import java.util.Scanner;

public class StudentsMarks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter marks");
        for(int i=0;i<n;i++){
             System.out.println("Enter marks["+i+"]:");
             a[i]=sc.nextInt();
        }
        //System.out.print("Entered array:");
        //System.out.println(Arrays.toString(a));
        
        double sum=0,max=0;
        double avg=0;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
            if(a[i]>max){
                max=a[i];
            }
        }
        avg=sum/n;
        System.out.println("Average = "+avg);
        System.out.println("Maximum marks = "+max);
        int c=0;
        for(int x:a){
            if(x>avg){
                c++;
            }
        }
        System.out.println("No of students who scored above avg = "+c);

	}

}
