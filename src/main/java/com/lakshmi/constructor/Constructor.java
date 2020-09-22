package com.lakshmi.constructor;
public class Constructor {
	int num;
	Constructor() {// constructor-
		num = 100;
	}
	public static void main(String[] args) {
		Constructor t1 = new Constructor();// t1 obj created
		Constructor t2 = new Constructor();// t2 obj created
		System.out.println(t1.num + " " + t2.num);
	}
}
