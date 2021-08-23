package com.harsh.threding;

public class ThreadJoinEx implements Runnable {

	@Override
	public void run() {

	//	synchronized (this) { when join() not call thread will not execute simultaneously so synchronized help to achieve this
			try {
				System.out.println(Thread.currentThread().getName() + " Start");
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + " End");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	//}

}
