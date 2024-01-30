package com.arrays;

import java.util.Scanner;
//WAP to accept symbols, store in array and print only capital alphabets.
public class PrintOnlyCapitalAlphabets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char arr[]=new char[5]; 
		System.out.println("Enter 5 characters in array:");  
		for(int i=0;i<arr.length;i++) { 
			arr[i]=sc.next().charAt(0);
			if(arr[i]>='A'&& arr[i]<='Z') {
				System.out.println("Only Capital Alphabets: "+arr[i]);
			} 
		}
		sc.close();
	}
}