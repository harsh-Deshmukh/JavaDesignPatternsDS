package com.harsh.designpattern.creational.SingleTone;

/*Overcome LazySingleTone problem but 
 * this class strategy of double locking good for Singlethred but loose performance during Multi Threded*/

public class ThreadSafeSingleToneClass {
	private static ThreadSafeSingleToneClass INSTANCE;

	private ThreadSafeSingleToneClass() {
		System.out.println("I am ThredSafeSingleToneClass() constructor");
	}

	public static ThreadSafeSingleToneClass getInstance() {
		System.out.println("I am getInstance() method of ThredSafeSingleToneClass class");
		//This is double locking good for Single Thred but loose performance during Multi Threaded
		if (INSTANCE == null) {
			synchronized (ThreadSafeSingleToneClass.class) {
				if (INSTANCE == null) {
					INSTANCE = new ThreadSafeSingleToneClass();
				} else
					return INSTANCE;
			}
		}
		return INSTANCE;
	}

}
