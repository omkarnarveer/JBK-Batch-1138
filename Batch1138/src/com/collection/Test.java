package com.collection;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		Product p1= new Product(11,"Pen",20,"Stationary");
		Product p2= new Product(12,"HP  Victus",100000,"Electronics");
		Product p3= new Product(13,"Teskbook",200,"Stationary");
		Product p4= new Product(14,"TV ",20000,"Electronics");
		Product p5= new Product(15,"Bag",1000,"Stationary");
		Product p6= new Product(15,"Boat 131 Headphones",1000,"Electronics");
		
		ArrayList<Product> productsElectronics =new ArrayList<>();
		
		productsElectronics.add(null);
		productsElectronics.add(p2);
		productsElectronics.add(p4);
		productsElectronics.add(p6);
	
		ArrayList<Product> productsStationary =new ArrayList<>();
		productsStationary.add(p1);
		productsStationary.add(p3);
		productsStationary.add(p5);
		productsStationary.add(null);


		System.out.println("1.Using for loop iteration Electronics");
		for(int i=0;i<productsElectronics.size();++i) {
			System.out.println(productsElectronics.get(i)); 
		} 
		System.out.println("------------------------------------");

		System.out.println("2.Using for each loop iteration Stationary"); 
		for(Product p:productsStationary) { 
			System.out.println(p); 
		}
		ArrayList<Product> productsShoping =new ArrayList<>();
		
		productsShoping.add(p1);
		productsShoping.add(p3);
		productsShoping.add(p3);
		productsShoping.add(p2);
		productsShoping.add(p2);
		System.out.println("3.Shoping Cart"); 
		//productsShoping.forEach(prod->System.out.println(prod));
		productsShoping.forEach(System.out::println);
	}
}