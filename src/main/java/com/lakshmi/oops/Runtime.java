package com.lakshmi.oops;
//runtime polymorphism/dynamic binding
class runtime1{
int i=10;
void m1() {
		System.out.println("class parent");
	}
}
class runtime2 extends runtime1 {
int i=20;
void m1() {
		System.out.println("class child");
	}
}
class Runtime {
	public static void main(String[] args) {
		runtime1 obj = new runtime2();//
		obj.m1();
		System.out.println(obj.i);
	}
}
