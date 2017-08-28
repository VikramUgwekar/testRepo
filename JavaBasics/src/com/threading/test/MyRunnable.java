package com.threading.test;

public class MyRunnable extends Thread {

	Consume c;
	
	

	public MyRunnable(Consume c2) {
		this.c = c2;
	}



	@Override
	public void run() {
		
		c.consume();
	
	}
}
