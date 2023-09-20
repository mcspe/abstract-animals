package org.java.animals;

import org.java.animals.abs.Animal;
import org.java.animals.intf.INuotante;
import org.java.animals.intf.IVolante;

public class Eagle extends Animal implements IVolante, INuotante {
	
	@Override
	public void verso() {
		System.out.println("I am screaming");
	}
	
	@Override
	public void mangia() {
		System.out.println("I eat birds and mammals!");
	}
	
	@Override
	public String toString() {
		return "Hi! I'm a eagle!";
	}
	
	@Override
	public void nuota() {
		System.out.println("I can swim!");
	}
	
	@Override
	public void vola() {
		System.out.println("I can fly!");
	}

}
