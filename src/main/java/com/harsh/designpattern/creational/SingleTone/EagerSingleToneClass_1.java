package com.harsh.designpattern.creational.SingleTone;
/*Probelm with this class is it will create the instance class even if the method is not called
 * and aslo not provide way to handle exception*/
public class EagerSingleToneClass_1 {

	private static final EagerSingleToneClass_1 instance=new EagerSingleToneClass_1();
	
	private EagerSingleToneClass_1(){
		System.out.println("I am EagerSingleToneClass() Constructor");
	}
	public static EagerSingleToneClass_1 getInstance(){
		System.out.println("I am getInstance() method of EagerSingleToneClass");
		return instance;
	}
	
	
	
}

