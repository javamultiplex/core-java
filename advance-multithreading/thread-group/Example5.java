package com.javamultiplex.multithreading.advance.threadgroup;

//Write a program to display all active thread names belong to system group.
public class Example5 {

	public static void main(String[] args) {

		ThreadGroup systemGroup=Thread.currentThread().getThreadGroup().getParent();
		Thread[] t=new Thread[systemGroup.activeCount()];
		systemGroup.enumerate(t);
		for(Thread t1:t){
			System.out.println(t1.getName()+" is Daemon Thread -> "+t1.isDaemon());
		}
		
	}

}
