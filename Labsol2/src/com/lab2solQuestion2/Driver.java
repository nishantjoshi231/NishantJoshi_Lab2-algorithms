package com.lab2solQuestion2;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Enter the No of Denomination");
		 Scanner sc=new Scanner(System.in);
		
		int Size=sc.nextInt();
		int a[]=new int[Size];
		System.out.println("Enter the values of Denomination");
		for(int i=0;i<Size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter The amount to be payed");
		int Amount=sc.nextInt();
        mergeSort m= new mergeSort();      
		m.sort(a,0,Size-1);
		
           Notecount n=new Notecount();
           n.notecount(a, Amount);
            
            }

}
