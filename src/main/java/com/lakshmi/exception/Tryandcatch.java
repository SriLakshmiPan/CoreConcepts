package com.lakshmi.exception;

public class Tryandcatch {

	public static void main(String[] args) {
//try block to excecute normal code catch block to execute exception code
		int a[] = new int[2];
		try {
			System.out.println("Acess element three : " + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown : " + e);
		} finally {
			a[0] = 6;
			System.out.println("First element value : " + a[0]);
			System.out.println("The finally statement is exceuted");

		}
	}
}
