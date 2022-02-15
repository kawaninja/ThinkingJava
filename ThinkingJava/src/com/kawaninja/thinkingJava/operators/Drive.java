package com.kawaninja.thinkingJava.operators;

public class Drive {
	
	int distance;
	
	int time;
	
	int speedtest;
	
	public int driveAtMyCar (int distance, int time ) {
		
		speedtest = distance / time;
		
		System.out.println ("Моя скорость " + speedtest + " км/ч");
		
		return speedtest;
	}


}
