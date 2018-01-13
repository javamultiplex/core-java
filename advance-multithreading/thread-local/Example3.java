package com.javamultiplex.multithreading.advance.threadlocal;

public class Example3 {

	public static void main(String[] args) {
		
		Customer c1=new Customer("One");
		Customer c2=new Customer("Two");
		Customer c3=new Customer("Three");
		c1.start();
		c2.start();
		c3.start();
		
	}
	
}

class Customer extends Thread {

	static Integer custId = 0;
	private static ThreadLocal<Object> tl = new ThreadLocal<Object>() {

		protected Integer initialValue() {
			return ++custId;
		}
	};

	public Customer(String name) {
		super(name);
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " executing with customer id : " + tl.get());
	}

}
