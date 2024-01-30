package com.arrays;

public class MinArray {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,666,7,8,12,34,0};

		int num=arr[0];

		for(int i=0;i<arr.length;i++) {
			
			if(num>=arr[i]) num=arr[i];

		}
		System.out.println("Min is "+num);
	}
}