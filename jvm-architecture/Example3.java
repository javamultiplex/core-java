package com.javamultiplex.jvm;

public class Example3 {

	public static void main(String[] args) throws ClassNotFoundException {

		/*
		 * BootStrap class loader is responsible and we will get null as answer
		 * because it is not written in java.
		 */
		System.out.println(String.class.getClassLoader());
		/*
		 * Application class path is responsible because Example3.class is present
		 * in current working directory
		 * sun.misc.Launcher$AppClassLoader@73d16e93
		 */
		System.out.println(Example3.class.getClassLoader());
		/*
		 * Assume Student class is present in current working directory and
		 * extension class path then Extension class path is responsible and we
		 * will get sun.misc.Launcher$ExtClassLoader@73d16e93
		 */
		System.out.println(Student.class.getClassLoader());

	}
}
