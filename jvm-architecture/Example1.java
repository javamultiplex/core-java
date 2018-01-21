package com.javamultiplex.jvm;

import java.lang.reflect.Method;

class Student {

	private int name;
	private int rollNumber;

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

}

public class Example1 {

	public static void main(String[] args) throws ClassNotFoundException {

		Class c = Student.class;
		Method[] m = c.getDeclaredMethods();
		for (Method m1 : m) {
			System.out.println(m1.getName());
		}
	}

}
