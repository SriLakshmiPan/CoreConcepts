package com.lakshmi.keyword;
//if localvariable and instance variable are same,if u want call instancevariable then we use 'this' keyword
class This {//This costructor
int x;//instance variable
This(int x)//x parameter
{
	this.x=x;//this keyword
	}
void display()
	{
		System.out.println(x);
	}
 public static void main(String[] args) {
This obj=new This(5);
obj.display();
}
}
