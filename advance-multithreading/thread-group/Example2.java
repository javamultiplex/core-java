package com.javamultiplex.multithreading.advance.threadgroup;

public class Example2 {

	public static void main(String[] args) {

		ThreadGroup g1 = new ThreadGroup("First Group");
		System.out.println(g1.getParent().getName());// Main
		ThreadGroup g2 = new ThreadGroup(g1, "Second Group");
		System.out.println(g2.getParent().getName());// First Group

	}

}
