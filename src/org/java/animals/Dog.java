package org.java.animals;

import org.java.animals.abs.Animal;
import org.java.animals.intf.INuotante;

public class Dog extends Animal implements INuotante {

	@Override
	public void verso() {
		System.out.println("I am barking");
	}
	
	@Override
	public void mangia() {
		System.out.println("I eat everything!");
	}
	
	@Override
	public String toString() {
		return "Hi! I'm a dog!";
	}
	
}
