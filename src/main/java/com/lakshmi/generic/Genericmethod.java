package com.lakshmi.generic;
//generic methods allow programmers to specify set of related methods
//all generic method declaration have <E>
public class Genericmethod {
public static <E> void printArray( E[] inputArray) {//<E> for generic method
	for(E element : inputArray) {
//Display array elements		
		System.out.printf("%s ",element);
	}
		System.out.println();
}
	public static void main(String[] args) {
//create arrays of integer,double and character		
		Integer[] intArray= {1,2,3,4,5};
		Double[] doubleArray= {1.1,2.2,3.3,4.4,5.5};
		Character[] charArray= {'H','E','L','L','o'};
		System.out.println("Array integerArray contains : ");
		printArray(intArray);//pass an integer array
		System.out.println("Array doubleArray contains : ");
		printArray(doubleArray);//pass a double array
		System.out.println("Array characterArray contains : ");
		printArray(charArray);//pass a character array
	}
}//
