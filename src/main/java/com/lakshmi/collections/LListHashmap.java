package com.lakshmi.collections;

import java.util.*;
//example for list,linkedlist,hashset,hashmap
public class LListHashmap {
	public static void main(String[] args) {
		//Array list
		List a1=new ArrayList();
		a1.add("zara");
		a1.add("mahanz");
		a1.add("ayan");
		System.out.println("Array list elements");
		System.out.println("\t"+a1);
		//Linked list
				List l1=new LinkedList();
				l1.add("zara");
				l1.add("mahanz");
				l1.add("ayan");
				System.out.println();
				System.out.println("Linked list elements");
				System.out.println("\t"+l1);
	//Hashset 
				HashSet s1=new HashSet();
				s1.add("zara");
				s1.add("mahanz");
				s1.add("ayan");
				System.out.println();
				System.out.println("Set elements");
				System.out.println("\t"+s1);
	//Hashmap 
			HashMap m1=new HashMap();
				m1.put("zara","8");
				m1.put("mahanz","32");
				m1.put("ayan","45");
				System.out.println();
				System.out.println("Map elements");
				System.out.println("\t"+m1);
		}
	}

