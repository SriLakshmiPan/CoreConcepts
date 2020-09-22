package com.lakshmi.interfaces;
//multithreading
class RunnableDemo implements Runnable {
	private Thread t;
	private String threadname;
	RunnableDemo(String name) {
		threadname=name;
		System.out.println("creating "+threadname);
	}
	public void run() {
		System.out.println("running "+threadname);
		try {
			for(int i=4;i>0;i--) {
	System.out.println("Thread: "+threadname +","+i);
	Thread.sleep(50);
			}
		}catch(InterruptedException e) {
			System.out.println("Therad "+threadname+"interrupetd.");
		}
		System.out.println("Therad "+threadname+"exiting.");
	}
	public void start() {
		System.out.println("starting "+threadname);
		if(t==null) {
			t=new Thread(this,threadname);
			t.start();
		}
	}
}
public class Multithreading{
	public static void main(String[] args) {
	RunnableDemo r1=new RunnableDemo("Thread-1");
	r1.start();
	RunnableDemo r2=new RunnableDemo("Thread-2");
	r2.start();
	}

}
