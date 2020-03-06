package com.harsh.designpattern.creational.SingleTone;

/*prior to java 5 there is lot of memory issues and in that case ThreadSafeSingleToneClass class 
	scenario will fail in such case,where to many thread try to get instacnec  class may be deadlock will occure 
	 So to overcome this, Paul Buagh come up with throgh inner class create instance.
	 
	  PROBLEM==> It will break by Reflection API, so That can be overcome by enum, refer 'EnumSingleToneClass' class implemeted by Harsh
	  "https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples"
*
*/
public class PaulBaughSingleToneClass_4_Important {

	private PaulBaughSingleToneClass_4_Important() {
		
		//this will avoid to break by reflectionn api it will throe exception if RA make constuct public and crete obj
		//sp thids will chk and throw exception if objcet alrady creteded.
		if(SingleTone.INSTANCE!=null) {
			throw new IllegalStateException("Instance aalready cretaed");
		}
		System.out.println("I am PaulBaughSingleToneClass() constructor");
	}

	private static class SingleTone {
		private static final PaulBaughSingleToneClass_4_Important INSTANCE = new PaulBaughSingleToneClass_4_Important();
	}

	public static PaulBaughSingleToneClass_4_Important getInstance() {
		System.out.println("I am getInstance() method of PaulBaughSingleToneClass");
		return SingleTone.INSTANCE;
	}
}
