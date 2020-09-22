package com.lakshmi.collections;
import java.util.Enumeration;
import java.util.Vector;
//collections with vector class,it's same as an array and no need to declare vector size it grows and shrinks 
public class LVector {
	public static void main(String[] args) {
//intial size is 3 ,increment is 2
		Vector v= new Vector(3,2);//Vector class created
		System.out.println("Intial size: "+v.size());
		System.out.println("Intial capacity: "+v.capacity());
		v.addElement(new Integer(1));//adding elements to the vector
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		System.out.println("capacity after four additions "+v.capacity());
		v.addElement(new Double(5.45));
		System.out.println("current capacity "+v.capacity());
		v.addElement(new Double(6.08));
		v.addElement(new Integer(7));
		System.out.println("current capacity "+v.capacity());
		v.addElement(new Float(9.4));
		v.addElement(new Integer(10));
		System.out.println("current capacity "+v.capacity());
		v.addElement(new Integer(11));
		v.addElement(new Integer(12));
		System.out.println("First element: "+(Integer)v.firstElement());
		System.out.println("Last element: "+(Integer)v.lastElement());
		if(v.contains(new Integer(3)))
		System.out.println(("vector contains 3."));
		//enumerate the elements in the vector
		Enumeration vEnum=v.elements();
		System.out.println("/nElements in vector:");
		while(vEnum.hasMoreElements())
			System.out.println(vEnum.nextElement()+" ");
		System.out.println();
	}
}
