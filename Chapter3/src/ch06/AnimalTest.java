package ch06;

import java.util.ArrayList;

class Animal{ //동물의 행동을 메소드로 
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	public void eating() {
		
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}	

class Eagle extends Animal{
	
	public void move() {
		System.out.println("독수리가 하늘을 날아 다닙니다.");
	}
	public void flying() {
		System.out.println("독수리가 양날개를 쭉 펴고 날아 다닙니다.");
	}
}

class Puppy extends Animal{
	
	public void move() {
		System.out.println("강아지가 호다닥 달려갑니다.");
	}
	public void cute() {
		System.out.println("강아지는 귀엽습니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		Animal pAnimal = new Puppy();
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		test.moveAnimal(pAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		animalList.add(pAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}