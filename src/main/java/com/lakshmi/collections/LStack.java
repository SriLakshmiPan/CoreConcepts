package com.lakshmi.collections;
import java.util.EmptyStackException;
//stack is a subclass of vector that implements a standard lastin first out stack
//stack only defines the default constructor,which creates an empty stack
//stack includes all the methods defined by vector class  and adds several by its own
import java.util.Stack;
public class LStack {
 static void showpush(Stack st,int a) {
	st.push(new Integer(a));
	System.out.println("push("+a+")");
	System.out.println("stack: "+st);
}
static void showpop(Stack st) {
	System.out.println("pop...");
	Integer a=(Integer) st.pop();
	System.out.println(a);
System.out.println("stack: "+st);
}
	public static void main(String[] args) {
		Stack st=new Stack();
		System.out.println("stack: "+st);
		showpush(st, 42);
		showpush(st, 66);
		showpush(st, 99);
		showpop(st);
		showpop(st);
		showpop(st);
	try {
		showpop(st);
		}catch(EmptyStackException e) {
				System.out.println("empty stack");
		}
	}

}
