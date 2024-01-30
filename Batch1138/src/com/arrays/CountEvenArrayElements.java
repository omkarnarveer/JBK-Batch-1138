package com.arrays;

import java.util.Scanner;

// Write a program to count and print all even array elements.
public class CountEvenArrayElements {
	
		public static void main(String[] args) { 
			int arr[]=new int[5]; 
			Scanner sc=new Scanner(System.in); 
			System.out.println("Enter 5 numbers in array:"); 
			int count=0; 
			for(int i=0;i<arr.length;i++){ 
				arr[i]=sc.nextInt(); 
				if(arr[i]%2==0){ 
					count++;
					System.out.println("Even Element: "+arr[i]);
				} 
			} 
			sc.close();
			System.out.println("Count of odd number in array is: "+count);
		}
	

}
