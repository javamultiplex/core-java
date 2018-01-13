package com.javamultiplex.multithreading.advance.threadlocal;

public class Example1 {

	public static void main(String[] args) {
		
		ThreadLocal<String> tl=new ThreadLocal<String>();
		System.out.println(tl.get());//null
		tl.set("Durga");
		System.out.println(tl.get());//Durga
		tl.remove();
		System.out.println(tl.get());//null
		
	}
	
}
