package com.harsh.designpattern.creational.SingleTone;

public enum EnumSingleToneClass {

	 INSTANCE;
	
	private EnumSingleToneClass() {
		System.out.println(" constructor called");
	}
public void add() {
	System.out.println("addd method ");
}
}
