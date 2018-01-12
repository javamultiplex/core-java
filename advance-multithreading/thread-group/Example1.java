package com.javamultiplex.multithreading.advance.threadgroup;

public class Example1 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getThreadGroup().getName());// Main
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());// system

	}

}
