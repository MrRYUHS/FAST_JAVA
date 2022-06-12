package ch06;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다");
	}
	public void eating() {
		System.out.println("동물이 냠냠");
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 움직입니다");
	}
	public void readBook() {
		System.out.println("사람이 책 읽음");
	}
	@Override
	public void eating() {
		System.out.println("사람이 냠냠");
	}
	
}


public class AnimalTest {

	public static void main(String[] args) {

		Animal hAnimal = new Human();
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
	}

	public void moveAnimal(Animal animal) {
		animal.move();
		animal.eating();
	}
}
