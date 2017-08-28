package com.threading.test;

public class ThreadTest {

	
	public static void main(String[] args) throws InterruptedException{
		Consume c = new Consume();
		Consume c1 = new Consume();
		
		MyRunnable t1 = new MyRunnable(c);
		MyRunnable t2 = new MyRunnable(c1);
		
		
	/*	System.out.println(Thread.currentThread().getPriority());
		
		t.start();
		t1.start();
		System.out.println(Thread.currentThread().getPriority());
		
		t.join();
		t1.join();*/
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	
		
		
	}
}
