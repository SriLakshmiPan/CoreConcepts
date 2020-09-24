package com.corejava.OOPS;
/*//Inheritance is the process,in which one class acquires the properties(means methods and fields) of another.
'extends'is the keyword used to inherit the properties of the class.
The class which inherits the properties of other is a subclass(child class)
The class whose properties are inherited is a super class(parent class)
single inheritance--class A is the parent class,class B is the child class.class B gets the properties from class A.
Multilevel Inheritance----class A is the parent class,B is child class of class A and class c is the child of class B.
class c can get from class B and class B can get from class A
Hierarchical Inheritance--class A is the parent class,B and C are the child classes;class B can get from class A and 
 class c can get from class A
Java doesn't support multiple inheritance.multiple means many parent classes so ambiguity(confusion)will come*/
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
//Calculation is super(parent)class,SInheritance is a subclass
	public static class SInheritance extends caluclation {
		public void multiplication(int x, int y) {
			z = x * y; 
System.out.println("Multiplication is: "+z );
		}
		public static void main(String[] args) {
			int a = 10, b = 20;
			SInheritance demo = new SInheritance();//created an object for child class which is SInheritance
			demo.addition(a, b);//calling the method using object
			demo.subtraction(a, b);
			demo.multiplication(a, b);
		}
	}
}