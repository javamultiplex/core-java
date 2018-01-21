package com.javamultiplex.jvm;

public class Example5 {

	public static void main(String[] args) {

		double mb = 1024 * 1024;
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Max memory :" + runtime.maxMemory() / mb);
		System.out.println("Total memory: " + runtime.totalMemory() / mb);
		System.out.println("Free memory: " + runtime.freeMemory() / mb);
		System.out.println("Consumed memory: " + (runtime.totalMemory() - runtime.freeMemory()) / mb);
	}

}
