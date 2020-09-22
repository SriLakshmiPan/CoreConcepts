package com.lakshmi.interfaces;

//an iterface is a reference type in java,it is a collection of abstract methods
//we can't instantiate an interface,doesn't contatin any constructors
interface Animal// interface created
{
	public void eat();

	public void travel();
}

public class Interfaces implements Animal {// implements is a keyword for interface
	public void eat() {
		System.out.println("Mammal eats");
	}

	public void travel() {
		System.out.println("Mammal travels");
	}//

	/*
	 * public int noofLegs() { return 0; }
	 */
	public static void main(String[] args) {
		Interfaces m = new Interfaces();
		m.eat();
		m.travel();
	}

}
