package com.lakshmi.collections;

import java.util.HashSet;
import java.util.TreeSet;

//A set is a collection that cannot contain duplicate elements(set contain unique elements) 
public class LSet {
	public static void main(String[] args) {
		int count[] = { 34, 22, 10, 60, 30};
		HashSet<Integer> set = new HashSet <Integer>();
		try {
			for (int i = 0; i < 5; i++) {
				set.add(count[i]);//adds an object to the collection
			}
			System.out.println(set);
			TreeSet sortedSet = new TreeSet<Integer>(set);
			System.out.println("The sorted list is:");
			System.out.println(sortedSet);
			System.out.println("The first element of the set is : " + (Integer) sortedSet.first());
			System.out.println("The last element of the set is : " + (Integer) sortedSet.last());
		} catch (Exception e) {

		}
	}

}
