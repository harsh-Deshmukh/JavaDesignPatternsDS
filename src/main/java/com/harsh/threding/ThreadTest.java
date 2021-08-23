package com.harsh.threding;

public class ThreadTest {
	public static void main(String[] args) {

		threadJoinSleepExample();
		
		thread_Wait_Notify_NotifyAll_Example();

	}

	private static void thread_Wait_Notify_NotifyAll_Example() {
		System.out.println("Thread main start");
		
		BookReader reader=new BookReader(new Book("Java Programming"));
		
		Thread harshRead=new Thread(reader);
		Thread poojaRead=new Thread(reader);
		harshRead.start();
		poojaRead.start();   
		
		
		System.out.println("Thread main end");
		
	}

	private static void threadJoinSleepExample() {
		System.out.println("Thread main start");
		ThreadJoinEx te = new ThreadJoinEx();
		Thread t1 = new Thread(te, "Thread 1");
		Thread t2 = new Thread(te, "Thread 2");
		Thread t3 = new Thread(te, "Thread 3");

//    	t1.start();
//    	t2.start();
//    	t3.start();
		try {
			t1.start();
			t1.join();

			t2.start();
			t2.join();

			t3.start();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Thread main End");

	}
}
