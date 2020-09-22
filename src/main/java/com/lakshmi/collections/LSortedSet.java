package com.lakshmi.collections;
import java.util.*;
//Sortedset extends set to handle sorted sets
public class LSortedSet {

	public static void main(String[] args) {
	//created the sorted set	
				TreeSet set=new TreeSet();
//add elements to the set
				set.add("b");
				set.add("a");
				set.add("c");
//Iterating over the elemnts in the set
				Iterator it=set.iterator();
				while(it.hasNext()) {
					//get an element
		Object element=it.next();
		System.out.println(element.toString());
				}
	}

}
