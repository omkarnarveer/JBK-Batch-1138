package com.arrays;

import java.util.Scanner;

//WAP to accept symbols, store in array and print only alphabets.
public class PrintOnlyAlphabets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char arr[]=new char[5]; 
		System.out.println("Enter 5 characters in array:");  
		for(int i=0;i<arr.length;i++) { 
			arr[i]=sc.next().charAt(0);
			if((arr[i]>='a'&& arr[i]<='z')||(arr[i]>='A'&& arr[i]<='Z')) {
				System.out.println("Only Alphabets: "+arr[i]);
			} 
		}
		sc.close();
	} 
}