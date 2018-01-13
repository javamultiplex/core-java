package com.javamultiplex.multithreading.advance.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 {

	public static void main(String[] args) {

		PrintJob[] jobs = {

				new PrintJob("Rohit"), 
				new PrintJob("Bhavna"), 
				new PrintJob("Shivani"), 
				new PrintJob("Javamultiplex"),
				new PrintJob("Sumit") };

		ExecutorService service = Executors.newFixedThreadPool(3);
		for (PrintJob job : jobs) {
			service.submit(job);
		}
		service.shutdown();

	}
}

class PrintJob implements Runnable {

	String name;

	public PrintJob(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " job started by Thread : " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException exception) {

		}
		System.out.println(name + " job completed by Thread : " + Thread.currentThread().getName());
	}

}
