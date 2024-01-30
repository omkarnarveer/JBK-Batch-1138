package com.collection;

public class NonInintialsedArray {
		
	public static void main(String[] args) {
	
		int arr1[] = {1, 2, 3, 5, 6};
		int arr2[] = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
		    System.out.println(arr1[i]);
		}

		System.out.println("Reverse of Array is");
		for (int j = 0, i = arr1.length - 1; j < arr1.length; j++, i--) {
		    arr2[j] = arr1[i];
		    System.out.println(arr2[j]);
		}	
	}
}