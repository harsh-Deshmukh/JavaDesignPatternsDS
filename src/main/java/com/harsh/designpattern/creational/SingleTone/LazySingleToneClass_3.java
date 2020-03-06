package com.harsh.designpattern.creational.SingleTone;

/*To overcome problem of StaticBlockSingleToneClass & EagerSingleToneClass,
I am creating an object in getInsatnce method which we can say LazyLoading

PROBLEM==>Good for application which would not creating SingleTone obj multiple time
 means If multiple obj calling PARALLALY then it will break SingleTone object strategy
 and may be there is chance to break this design pattern So in this case Thread Safety is IMP
 * PLEASE refer ThreadSafeSingleToneClass*/
public class LazySingleToneClass_3 {

	private static LazySingleToneClass_3 INSTANCE;
	private LazySingleToneClass_3(){
		System.out.println("I am LazySingleToneClass() constructor");
	}
public static LazySingleToneClass_3 getInstance(){
	System.out.println("I am getInstance() of LazySingleToneClass ");
	if(INSTANCE==null){
		return INSTANCE=new LazySingleToneClass_3();
	}
		return INSTANCE;
}
}
