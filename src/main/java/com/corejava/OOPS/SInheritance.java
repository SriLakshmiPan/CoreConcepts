package com.corejava.OOPS;

//Inheritance is the procedure,in which a subclass inherits the properties and behaviors of a super class
class caluclation {//super class
	int z;// instance variable

	public void addition(int x, int y) {
		z = x + y;
		System.out.println("Addition is: " + z);
	}

	public void subtraction(int x, int y) {
		z = x - y;
		System.out.println("Subtraction is: " + z);
	}

	public static class SInheritance extends caluclation {
		public void multiplication(int x, int y) {
			z = x * y; 
System.out.println("Multiplication is: "+z );
		}
		public static void main(String[] args) {
			int a = 10, b = 20;
			SInheritance demo = new SInheritance();
			demo.addition(a, b);
			demo.subtraction(a, b);
			demo.multiplication(a, b);
		}
	}
}