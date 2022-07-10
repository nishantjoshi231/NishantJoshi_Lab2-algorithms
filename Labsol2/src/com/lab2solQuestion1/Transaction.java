package com.lab2solQuestion1;

import java.util.Scanner;


public class Transaction {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Size,no_Of_Target;
      System.out.println("Enter the No of transaction");
      Scanner sc=new Scanner(System.in);
      Size=sc.nextInt();
      System.out.println("Enter the No of Targets");
      no_Of_Target=sc.nextInt();
      int[] a= new int[Size];
      for(int i=0;i<Size;i++) {
    	  System.out.println("Enter the Transaction Amount"+" "+(i+1));
    	  a[i]=sc.nextInt();
    	  
      }
     while(no_Of_Target--!=0) {
    	 int flag=0;
    	 long Target;
    	 System.out.println("Enter The Target");
    	 Target=sc.nextLong();
    	 long Sum=0;
    	 for(int i=0;i<Size;i++) {
    		 Sum+=a[i];
    		 if(Sum>=Target) {
    			 System.out.println("Target Achieved in "+" "+(i+1)+" "+"Transaction");
    			 flag=1;
    			 break;
    		 }
    	 }if(flag==0) {
    		 System.out.println("Target not Achieved");
    	 }
     }
         		  
    	  }
    	}