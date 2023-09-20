package org.java.animals;

import org.java.animals.abs.Animal;
import org.java.animals.intf.INuotante;

public class Dolphin extends Animal implements INuotante {
	
	@Override
	public void verso() {
		System.out.println("I am clicking");
	}
	
	@Override
	public void mangia() {
		System.out.println("I eat fish, squids, crustaceans, and jellyfish!");
	}
	
	@Override
	public String toString() {
		return "Hi! I'm a dolphin!";
	}
	
	@Override
	public void nuota() {
		System.out.println("I can swim!");
	}

}
