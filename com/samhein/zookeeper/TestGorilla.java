package com.samhein.zookeeper;

public class TestGorilla {

	public static void main(String[] args) {
		Gorilla g1 = new Gorilla();
		
		g1.throwSomething();
		g1.throwSomething();
		g1.throwSomething();
		
		g1.eatBananas();
		g1.eatBananas();
		
		g1.climb();
		
		System.out.println(g1.energyLevel);
		

	}

}
