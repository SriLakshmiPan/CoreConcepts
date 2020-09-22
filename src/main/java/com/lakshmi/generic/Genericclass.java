package com.lakshmi.generic;

import javax.swing.Box;

//generic class 
public class Genericclass<T> {//T is a generic class
	private T t;
	public void add(T t) {
		this.t=t;
	}
	public T get() {
		return t;
	}

	public static void main(String[] args) {
		Genericclass<Integer>integerBox = new Genericclass<Integer>();
		Genericclass<String> stringBox=new Genericclass<String>();
integerBox.add(new Integer(10));
stringBox.add(new String("hello world"));
System.out.printf("Integre values : %d\n\n",integerBox.get());
System.out.printf("String values : %s\n",stringBox.get());
	}
}
