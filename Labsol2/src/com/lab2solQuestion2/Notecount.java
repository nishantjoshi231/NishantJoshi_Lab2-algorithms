package com.lab2solQuestion2;

public class Notecount {

public void	notecount(int arr[], int amt) {
	int notecounter[]=new int[arr.length];
	try {for(int i=0;i<arr.length;i++) {
	if(amt>=0) {
		notecounter[i]=amt/arr[i];
		amt=amt-notecounter[i]*arr[i];
		}}
	if(amt>0) {
			System.out.println("Transaction not possible with min denomination");
		}else {
			for(int i=0;i<arr.length;i++) {
				if(notecounter[i]!=0) {
					System.out.println(arr[i]+":"+notecounter[i]);
					
				}
			}
		}
				
	}catch(ArithmeticException e) {
		System.err.println("0 is not a valid denomination");
	} 
	
	
	}
	
	
}
	

