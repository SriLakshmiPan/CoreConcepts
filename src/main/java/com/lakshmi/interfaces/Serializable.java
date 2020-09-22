package com.lakshmi.interfaces;
//object serialiazation,where an object can be represented as a sequence of bytes that includes the obj data
//if u create serialiazable with implements varaiables,we can use those variables later in methods
public class Serializable implements java.io.Serializable { //serializable classname with serializableinterface
public String name;
public String address;
public transient int ssn;
public int number;
	public void mailCheck() {
System.out.println("Mailing check to "+name + " "+address);		
	}

	
	
	
}
