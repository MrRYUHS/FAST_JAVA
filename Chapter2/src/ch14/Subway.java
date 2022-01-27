package ch14;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int busNumber) {
		this.lineNumber =busNumber;
	}
	
	public void take(int money) {
		this.money+=money;
		passengerCount++;
	}
	
	public void showsubInfo() {
		System.out.println(lineNumber + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원입니다.");
	}
}
