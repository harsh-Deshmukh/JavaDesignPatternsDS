package com.harsh.designpattern.creational.SingleTone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test_SingleToneClass {

	public static void main(String[] args) {
		EagerSingleToneClass_1 inst1= EagerSingleToneClass_1.getInstance();
		EagerSingleToneClass_1 inst2= EagerSingleToneClass_1.getInstance();
	System.out.println("EagerSingleToneClass Instance equals==>"+(inst1==inst2));
	System.out.println("********************************************************************");
	
	StaticBlockSingleToneClass_2 stat1=StaticBlockSingleToneClass_2.getInstance();
	StaticBlockSingleToneClass_2 stat2=StaticBlockSingleToneClass_2.getInstance();
	System.out.println("StaticBlockSingleToneClass Instance equals==>"+(stat1==stat2));
	
	System.out.println("********************************************************************");
	LazySingleToneClass_3 lazy1=LazySingleToneClass_3.getInstance();
	LazySingleToneClass_3 lazy2=LazySingleToneClass_3.getInstance();
	System.out.println("LazySingleToneClass Instance equals==>"+(lazy1==lazy2));
	
	System.out.println("********************************************************************");
	ThreadSafeSingleToneClass thread1=ThreadSafeSingleToneClass.getInstance();
	ThreadSafeSingleToneClass thread2=ThreadSafeSingleToneClass.getInstance();
	ThreadSafeSingleToneClass thread3=ThreadSafeSingleToneClass.getInstance();
	System.out.println("ThreadSafeSingleToneClass Instance equals==>"+(thread1==thread2));
	
	System.out.println("********************************************************************");
	PaulBaughSingleToneClass_4_Important paul1=PaulBaughSingleToneClass_4_Important.getInstance();
	PaulBaughSingleToneClass_4_Important paul2=PaulBaughSingleToneClass_4_Important.getInstance();	
	System.out.println("PaulBaughSingleToneClass Instance equals==>"+(paul1==paul2));
	System.out.println("******PaulBaughSingleToneClass BREAK by Reflection API START*********");
	breakByReflection( paul1);
	System.out.println("*******PaulBaughSingleToneClass BREAK by Reflection API END************");
	
	
	System.out.println("***********************SingleTone Object by Serialization*********************************************");
	SerializationSingeTone();
	
	System.out.println("Enum Singletone class-->>"+EnumSingleToneClass.INSTANCE.hashCode());
	System.out.println("Enum Singletone class-->>"+EnumSingleToneClass.INSTANCE.hashCode());
	System.out.println("Enum Singletone class-->>"+EnumSingleToneClass.INSTANCE.hashCode());
	}

	private static void SerializationSingeTone() {
		SerializedDesirilizedSingleToneClass_5 ser1=SerializedDesirilizedSingleToneClass_5.getInstance();
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\Serialized_OBJECTS\\object.ser"));
			oos.writeObject(ser1);
			oos.close();
			System.out.println("Object Serialized............");
			
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\Serialized_OBJECTS\\object.ser"));
			SerializedDesirilizedSingleToneClass_5 ser2=(SerializedDesirilizedSingleToneClass_5)ois.readObject();
			
			System.out.println("Object Deserialized............");
			System.out.println("***IF we do not added readResolve Method in SerializedDesirilizedSingleToneClass then object will be different");
			System.out.println("SerializedDesirilizedSingleToneClass are equals==>"+(ser1==ser2));
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void breakByReflection(PaulBaughSingleToneClass_4_Important paul1) {
		PaulBaughSingleToneClass_4_Important paul2 = null;
		try {
			Constructor[] con = PaulBaughSingleToneClass_4_Important.class.getDeclaredConstructors();
			for (Constructor constructor : con) {
				constructor.setAccessible(true);
				paul2 = (PaulBaughSingleToneClass_4_Important) constructor.newInstance();
				break;
			}
			System.out.println("PaulBaughSingleToneClass breakByReflection Instance equals==>"+(paul1==paul2));
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
			}
	

