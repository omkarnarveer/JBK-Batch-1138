package com.collection;

public class Student{

	private int roll;
	private String name;
	private double  perc;

	public Student() {
		super();
	}

	public Student(int roll, String name, double perc) {
		super();
		this.roll = roll;
		this.name = name;
		this.perc = perc;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPerc() {
		return perc;
	}

	public void setPerc(double perc) {
		this.perc = perc;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", perc=" + perc + "]";
	}
}