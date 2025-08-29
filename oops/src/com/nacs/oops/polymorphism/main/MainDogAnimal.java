package com.nacs.oops.polymorphism.main;

import com.nacs.oops.polymorphism.Animal;
import com.nacs.oops.polymorphism.Dog;

public class MainDogAnimal {
	public static void main(String[] args) {
		Animal johny = new Dog();
		johny.sound();
	}
}
