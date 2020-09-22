package com.lakshmi.oops;

//Abstation,hide internal data  and showing functionality only
class Triangle {
	private float base, height;

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float area() {
		float result = (0.5f) * base * height;
		return result;
	}
}

public class Abstration {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.setBase(5.0f);
		t.setHeight(3.0f);
		float area = t.area();
		System.out.println("Base = " + t.getBase());
		System.out.println("Height = " + t.getHeight());
		System.out.println("Area = " + area);
	}
}
