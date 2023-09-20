package org.java.animals;

import org.java.animals.abs.Animal;
import org.java.animals.intf.IVolante;

public class Sparrow extends Animal implements IVolante {
	
	@Override
	public void verso() {
		System.out.println("I am chirping");
	}
	
	@Override
	public void mangia() {
		System.out.println("I eat seeds, insects, fruit, mollusks, and small vertebrates!");
	}
	
	@Override
	public String toString() {
		return "Hi! I'm a sparrow!";
	}
	
	@Override
	public void vola() {
		System.out.println("I can fly!");
	}

}
