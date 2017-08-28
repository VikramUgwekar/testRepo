package com.threading.test;

public class Consume {

	public void consume(){
		synchronized (Consume.class){
		for(int i=0; i<5;i++){
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	}
}
