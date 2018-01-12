package com.javamultiplex.multithreading.advance.threadgroup;

public class Example4 {


	public static void main(String[] args) throws InterruptedException {
		
		ThreadGroup pg=new ThreadGroup("Parent Group");
		ThreadGroup cg=new ThreadGroup(pg,"Child Group");
		MyThread t1=new MyThread(pg,"Child Thread1");
		MyThread t2=new MyThread(pg, "Child Thread2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());//2
		System.out.println(pg.activeGroupCount());//1
		pg.list();
		Thread.sleep(10000);
		System.out.println(pg.activeCount());//0
		System.out.println(pg.activeGroupCount());//1
		pg.list();
	}

}

class MyThread extends Thread{
	
	public MyThread(ThreadGroup g,String name) {
		super(g,name);
	}
	
	public void run(){
		System.out.println("Child Thread");
		try{
			Thread.sleep(5000);
		}catch(InterruptedException exception){
			
		}
	}
	
}
