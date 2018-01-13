package com.javamultiplex.multithreading.advance.threadlocal;

public class Example2 {

	
	public static void main(String[] args) {
		
		ThreadLocal<Object> tl=new ThreadLocal<Object>(){
			
			public Object initialValue(){
				return "abc";
			}
			
		};
		
		System.out.println(tl.get());//abc
		tl.set("Durga");
		System.out.println(tl.get());//Durga
		tl.remove();
		System.out.println(tl.get());//abc
		
	}
	
}
