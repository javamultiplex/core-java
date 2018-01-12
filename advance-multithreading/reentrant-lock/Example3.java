package com.javamultiplex.multithreading.advance.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class Example3 {

	public static void main(String[] args) {

		MyThread t1 = new MyThread("First Thread");
		MyThread t2 = new MyThread("Second Thread");
		t1.start();
		t2.start();

	}

}

class MyThread extends Thread {

	static ReentrantLock l = new ReentrantLock();

	public MyThread(String name) {
		super(name);
	}

	public void run() {
		if (l.tryLock()) {
			System.out.println(Thread.currentThread().getName() + " got lock and performing safe operation.");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException exception) {
			}
			l.unlock();

		} else {
			System.out.println(Thread.currentThread().getName()
					+ " unable to get the lock and hence performing alternative operation.");
		}
	}

}
