package com.javamultiplex.jvm;

public class Example2 {

	public static void main(String[] args) {

		Student s1 = new Student();
		Class c1 = s1.getClass();
		Student s2 = new Student();
		Class c2 = s2.getClass();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1 == c2);// true

	}

}
