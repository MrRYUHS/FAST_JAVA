package ch14;

public class TakeTransTest {

	public static void main(String[] args) {

		Student studentRyu = new Student("형수", 31000);
		Student studentKim = new Student("혜린", 26000);
		
		Bus bus719 = new Bus(719);
		Bus bus724 = new Bus(724);
		
		studentRyu.takeBus(bus719);
		
		Subway greenSubway = new Subway(2);
		Subway redSubway = new Subway(1);
		
		studentKim.takeSubway(greenSubway);
		
		studentRyu.showInfo();
		studentKim.showInfo();
		
		bus719.showBusInfo();
		greenSubway.showsubInfo();
		
		bus724.showBusInfo();
		redSubway.showsubInfo();
	}

}
