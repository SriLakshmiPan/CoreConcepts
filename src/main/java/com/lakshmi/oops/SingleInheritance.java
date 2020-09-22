package com.lakshmi.oops;

// inheritance means using properties of one class in another using extends keyword
class SingleInheritance {
	float salary = 40000;

	static class Inheritance extends SingleInheritance {
		int bonus = 10000;

		public static void main(String args[]) {
			Inheritance i = new Inheritance();
			System.out.println("Total salary : " + (i.salary + i.bonus));

		}
	}
}
