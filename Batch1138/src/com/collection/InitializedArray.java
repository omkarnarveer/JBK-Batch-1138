package com.collection;

import java.util.Scanner;

public class InitializedArray {

	// Write a program to print all odd array elements.
	public static void main(String[] args) { 
		int arr1[]=new int[5]; 
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter 5 numbers in array:"); 
		int count=0; 
		for(int i=0;i<arr1.length;i++){ 
			arr1[i]=sc.nextInt(); 
			if(arr1[i]%2!=0){ count++; 
			} 
		} 
		System.out.println("Count of odd number in array is: "+count);

		//WAP to print sum of all even array elements.
		int arr2[]=new int[5]; 
		System.out.println("Enter 5 numbers in array:"); 
		int sum=0; 
		for(int i=0;i<arr2.length;i++) { 
			arr2[i]=sc.nextInt(); 
			if(arr2[i]%2==0) {
				sum=sum+arr2[i]; 
			} 
		}
		System.out.println("Sum of all even number in array is: "+sum); 

		//WAP to accept symbols, store in array and print only alphabets.
		char arr3[]=new char[5]; 
		System.out.println("Enter 5 characters in array:");  
		for(int i=0;i<arr3.length;i++) { 
			arr3[i]=sc.next().charAt(0);
			if((arr3[i]>='a'&& arr3[i]<='z')||(arr3[i]>='A'&& arr3[i]<='Z')) {
				System.out.println("Only Alphabets:"+arr3[i]);
			} 
		} 

		//WAP to accept symbols, store in array and print only digits.
		char arr4[]=new char[5]; 
		System.out.println("Enter 5 characters in array:");  
		for(int i=0;i<arr4.length;i++) { 
			arr4[i]=sc.next().charAt(0);
			if((arr4[i]>='0'&& arr4[i]<='9')) {
				System.out.println("Only Digits:"+arr4[i]);
			} 
		}
		//WAP to accept symbols, store in array and print only capital alphabets.
		char arr5[]=new char[5]; 
		System.out.println("Enter 5 characters in array:");  
		for(int i=0;i<arr5.length;i++) { 
			arr3[i]=sc.next().charAt(0);
			if(arr5[i]>='A'&& arr5[i]<='Z') {
				System.out.println("Only Capital Alphabets:"+arr5[i]);
			} 
		}
		//WAP to print tables of all array elements.
		int arr6[]=new int[5]; 
		System.out.println("Enter 3 numbers in array:"); 
		for(int i=0;i<arr6.length;i++) { 
			arr6[i]=sc.nextInt(); 
			for(int j=1;j<=10;j++) {
				int table=arr6[i]*j;
				System.out.println("Table of "+ arr6[i]+" is: " +arr6[i]+"*"+j+"="+table);	
			}
		}
	}
}