package com.kawaninja.thinkingJava.operators;

public class PassObject {
	
	static void f (Letter y) {
		
		y.c = 47.7777f;
	}

	public static void main(String[] args) {
		
		Letter x = new Letter();
		
		x.c = 5555.5555f;
		
		System.out.println ("1: x.c: " + x.c);
		
		f (x);
		
		System.out.println ("2: x.c: " + x.c);
		
	}

}
