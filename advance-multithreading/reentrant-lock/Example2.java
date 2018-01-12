package com.javamultiplex.multithreading.advance.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class Example2 {

	public static void main(String[] args) {

		Display d = new Display();
		MyThread1 t1 = new MyThread1(d, "Dhoni");
		MyThread1 t2 = new MyThread1(d, "Yuvraj");
		t1.start();
		t2.start();

		/*
		 * If we will comment Line1 and Line2 then both the threads will be executed
		 * simultaneously and we will get irregular output.If we are not
		 * commenting Line1 and Line2 then the thread will be executed one by
		 * one and we will get regular output.
		 * 
		 */
	}

}

class Display {

	ReentrantLock l = new ReentrantLock();

	public void wish(String name) {
		l.lock();// Line1
		for (int i = 0; i < 10; i++) {
			System.out.print("Good Morning : ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException exception) {

			}
			System.out.println(name);
		}
		l.unlock();// Line2
	}

}

class MyThread1 extends Thread {

	Display d;
	String name;

	public MyThread1(Display d, String name) {

		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}
