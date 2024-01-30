package com.arrays;

import java.util.Scanner;
//WAP to print sum of all even array elements.
public class SumOfEvenElements {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5]; 
		System.out.println("Enter 5 numbers in array:"); 
		int sum=0; 
		for(int i=0;i<arr.length;i++) { 
			arr[i]=sc.nextInt(); 
			if(arr[i]%2==0) {
				sum=sum+arr[i]; 
			} 
		}
		sc.close();
		System.out.println("Sum of all even number in array is: "+sum);
	}
}