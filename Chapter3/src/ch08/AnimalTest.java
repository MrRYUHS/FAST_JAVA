package ch08;

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
		
		test.testDownCasting(animalList);
	}	
	
	public void testDownCasting(ArrayList<Animal> list) {
		
		for(int i = 0; i<list.size(); i++) {
			
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				
				Human human = (Human)animal;
				human.readBook();
			}
			else if(animal instanceof Tiger) {
				
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if(animal instanceof Eagle) {
				
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
			else if(animal instanceof Puppy) {
				
				Puppy puppy = (Puppy)animal;
				puppy.cute();
			}
			
			else {
				System.out.println("unsupported type");
			}
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}