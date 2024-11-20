package com.buildmaven.multi;

public class Multiplication {

	public void multi(int a, int b) {

		int c = a * b;
		System.out.println("Multiplication is :" + c);
	}

	public static void main(String[] args) {

		Multiplication m = new Multiplication();
		m.multi(10, 20);
	}
}
