package com.lakshmi.oops;

// compiletime polymorphism,early binding/static binding
// polymorphism is the ability of an object to take on many forms(one in many ways) 
//compilertime polymorphism,if the polymorphic nature of an entity is decided by the compiler(uses methodoverloading)
class compiletime {
	void add(int x,int y)
	{
			System.out.println("Result1:"+(x+y));
		}

	void add(int x,int y,int z)
	{
	System.out.println("Result2:"+(x+y+z));
	}

	public static void main(String[] args) {
		compiletime p = new compiletime();
		p.add(3, 4, 5);//depends on parameters compiler will decide which method has to run
	}
}