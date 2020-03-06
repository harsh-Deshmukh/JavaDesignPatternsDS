package com.harsh.designpattern.creational.SingleTone;

/*Probelm with EagerSingleToneClass class is it will create the instance class even if,
 *  the method is not called  and also it does not have exception handling so 
 *  this class overcome exception handling drawback 
 * but still it is creating object even if the method is not called */

public class StaticBlockSingleToneClass_2 {

	private static  StaticBlockSingleToneClass_2 instance;
	private StaticBlockSingleToneClass_2(){
		System.out.println("I am StaticBlockSingleToneClass() constructor");
	}
	
	static{
		System.out.println("I am static block creating object without help of getInstance() because, object creation in static block");
		try{
			instance=new StaticBlockSingleToneClass_2();
		}catch(Exception ex){
			throw new RuntimeException("Exception while creating object");
		}
	}
	public static StaticBlockSingleToneClass_2 getInstance(){
		System.out.println("I am getInstance() method of StaticBlockSingleToneClass");
		return instance;
	}
}
