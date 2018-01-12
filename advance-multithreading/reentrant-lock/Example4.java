package com.javamultiplex.multithreading.advance.reentrantlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Example4 {

	public static void main(String[] args) {

		MyThread2 t1 = new MyThread2("First Thread");
		MyThread2 t2 = new MyThread2("Second Thread");
		t1.start();
		t2.start();

	}

}

class MyThread2 extends Thread {

	static ReentrantLock l = new ReentrantLock();

	public MyThread2(String name) {
		super(name);
	}

	public void run() {
		try {
			do {
				if (l.tryLock(5000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName() + " got lock and performing safe operation.");
					Thread.sleep(30000);
					l.unlock();
					System.out.println(Thread.currentThread().getName() + " released lock.");
					break;
				} else {
					System.out.println(Thread.currentThread().getName() + " unable to get the lock and will try again.");
				}
			} while (true);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
