package com.thread;

public class SingleTonClass {
	private volatile static SingleTonClass instance;
	private SingleTonClass(){
		//it should be private
	}
	public static SingleTonClass getInstance() {
		if(instance ==null) {
			//To make thread safe
			synchronized (SingleTonClass.class) {
				//check again as multiple threads 
				//can reach above step
				if(instance==null) 
					instance= new SingleTonClass();
			}
		}

		return instance;
	}
}
