package com.javamultiplex.jvm;

public class Example4 {

	public static void main(String[] args) throws ClassNotFoundException {

		Test test = new Test();
		MyClassLoader classLoader = new MyClassLoader();// Loaded by default classloader
		classLoader.loadClass("Test");// Loaded by customized classloader
		classLoader.loadClass("Test");// Loaded by customized classloader
	}

}

class MyClassLoader extends ClassLoader {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.ClassLoader#loadClass(java.lang.String)
	 */
	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {

		/*
		 * Check for update and load updated .class file and return
		 * corresponding class file.
		 */
		return null;
	}

}

class Test {

}
