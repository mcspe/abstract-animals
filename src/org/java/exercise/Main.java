package org.java.exercise;

import org.java.animals.Dog;
import org.java.animals.Dolphin;
import org.java.animals.Eagle;
import org.java.animals.Sparrow;
import org.java.animals.abs.Animal;
import org.java.animals.intf.INuotante;
import org.java.animals.intf.IVolante;

public class Main {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Sparrow sparrow = new Sparrow();
		Eagle eagle = new Eagle();
		Dolphin dolphin = new Dolphin();
		
		Animal[] animals = new Animal[4];
		
		animals[0] = dog;
		animals[1] = sparrow;
		animals[2] = eagle;
		animals[3] = dolphin;
		
		IVolante[] flyingAnimals = new IVolante[2];
		flyingAnimals[0] = sparrow;
		flyingAnimals[1] = eagle;
		
		INuotante[] swimmingAnimals = new INuotante[3];
		swimmingAnimals[0] = dog;
		swimmingAnimals[1] = eagle;
		swimmingAnimals[2] = dolphin;
		
		for (int i = 0; i < animals.length; i++) {
			Animal a = animals[i];
			System.out.println(a);
			a.mangia();
			a.verso();
			
			for (int j = 0; j < swimmingAnimals.length; j++) {
				INuotante sA = swimmingAnimals[j];
				if (a.equals(sA)) faiNuotare(sA);
			}
			
			for (int k = 0; k < flyingAnimals.length; k++) {
				IVolante fA = flyingAnimals[k];
				if (a.equals(fA)) faiVolare(fA);
			}
						
			a.dormi();

			System.out.println("\n--------------------\n");
		}
		
	}

	public static void faiVolare(IVolante animale) {
		animale.vola();
	}
	
	public static void faiNuotare(INuotante animale) {
		animale.nuota();
	}
}
