package ch15;

public class Passenger {

	String passengerName;
	int money;
	
	public Passenger(String passengerName, int money) {
		this.passengerName = passengerName;
		this.money = money;
	}
	
	public void taketaxi(Taxi taxi) {
		taxi.take(10000);
		this.money-=10000;
	}
	
	public void taketaxit(Taxi taxi) {
		taxi.take(20000);
		this.money-=20000;
	}
	
	public void showInfo() {
		System.out.println(passengerName + "님의 남은 돈은 " + money + "원 입니다.");
	}
}
