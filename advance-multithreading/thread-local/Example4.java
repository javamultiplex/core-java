package com.javamultiplex.multithreading.advance.threadlocal;

public class Example4 {

	
	public static void main(String[] args) {
		ParentThread pt=new ParentThread();
		pt.start();
	}
}

class ParentThread extends Thread {

	public static InheritableThreadLocal<Object> tl = new InheritableThreadLocal<Object>() {

		public Object childValue(Object p) {
			return "CC";
		}

	};

	public void run() {
		tl.set("PP");
		System.out.println("Parent Thread Value = " + tl.get());
		ChildThread ct=new ChildThread();
		ct.start();
	}

}

class ChildThread extends Thread{
	
	public void run(){
		System.out.println("Child thread value = "+ParentThread.tl.get());
	}
	
}
