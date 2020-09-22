package com.lakshmi.collections;

import java.util.Vector;
import java.util.Enumeration;

//enumaration interface defines the methods by which u can obtain one at a time
//used by legacy classes Vector and properties
public class EnumerationTest {

	public static void main(String[] args) {
		Enumeration<String> days;
		Vector<String> dayNames = new Vector<String>();// vector class
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		days = dayNames.elements();
		while (days.hasMoreElements()) {
			System.out.println(days.nextElement());
		}
	}

}