package org.java.animals.abs;

public abstract class Animal {
	
	public void dormi() {
		System.out.println("I'll go to sleep!");
		System.out.println("Zzz");
	}
	
	public abstract void verso();
	
	public abstract void mangia();
	
	public void nuota() {
		System.out.println("I can swim!");
	}
	
	public void vola() {
		System.out.println("I can fly!");
	}
	
}
