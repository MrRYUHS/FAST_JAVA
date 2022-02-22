package ch10;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동의 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동의 끕니다.");
	}
	public void washCar() {}
	
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
