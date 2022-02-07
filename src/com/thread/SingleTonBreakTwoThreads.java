package com.thread;

public class SingleTonBreakTwoThreads {
	public static void main(String[] args) {
		Thread1 th1=new Thread1();
		Thread2 th2=new Thread2();

		th2.start();
		th2.yield();
		/*try {
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		th1.start();
		
	
		
	}
}

class Thread1 extends Thread{
	@Override
	public void run() {
		System.out.println("Thread1 creating the Singleton object");
		SingleTonClass obj = SingleTonClass.getInstance();
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Thread2 extends Thread{
	@Override
	public void run() {
		System.out.println("Thread2 creating the Singleton object");
		SingleTonClass obj = SingleTonClass.getInstance();
		
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}