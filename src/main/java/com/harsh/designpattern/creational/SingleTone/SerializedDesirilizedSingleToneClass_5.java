package com.harsh.designpattern.creational.SingleTone;

import java.io.Serializable;

/*Sometime in distributed sysytem there is possibilty Singletone instance store into file and 
 * then retrived  and used for remain purpose but when we deserialized it will created new instance 
 * i.e hashcode are different 
 * 
 * To overcome this class has best solution
 * */

public class SerializedDesirilizedSingleToneClass_5 implements Serializable {

	private SerializedDesirilizedSingleToneClass_5() {
		System.out.println("I am SerializedDesirilizedSingleToneClass() COnstructor");
	}

	private static class SingleTone {
		private static final SerializedDesirilizedSingleToneClass_5 INSTANCE = new SerializedDesirilizedSingleToneClass_5();
	}
public static SerializedDesirilizedSingleToneClass_5 getInstance(){
	return SingleTone.INSTANCE;
}

/*This method allow to replace object from stream before it is return.it is called immediate after 
 * readObject method trying to return Object to calling position,
 * OIS class always check whether serializable implemented class has this method implemented or not */

private Object readResolve(){
	return getInstance();
}

//throw exception when any on etry to clone singletone object 
public Object clone() throws CloneNotSupportedException{
	
		throw new CloneNotSupportedException();
	
}
}
