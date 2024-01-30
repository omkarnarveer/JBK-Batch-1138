package com.arrays;
// Write a program to count and print all odd array elements.
import java.util.Scanner;

public class CountOddArrayElements {

	public static void main(String[] args) { 
		int arr[]=new int[5]; 
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter 5 numbers in array:"); 
		int count=0; 
		for(int i=0;i<arr.length;i++){ 
			arr[i]=sc.nextInt(); 
			if(arr[i]%2!=0){ 
				System.out.println("Odd Element: "+arr[i]);
				count++; 
			} 
		} 
		sc.close();
		System.out.println("Count of odd number in array is: "+count);
	}
}