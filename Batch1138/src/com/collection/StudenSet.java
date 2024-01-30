package com.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudenSet {

	public static void main(String[] args) {

		Student s1=new Student(1,"Omkar",33.33);
		Student s2=new Student(2,"Rohit",35.33);
		Student s3=new Student(3,"Nikhil",34.33);
		Student s4=new Student(1,"Omkar",33.33);
		Student s5=new Student();

		Set<Student>s= new HashSet<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		System.out.println(s);
	}
}