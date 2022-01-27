package ch15;

public class TakeTaxiTest {

	public static void main(String[] args) {

		Passenger passengerRyu = new Passenger("형수", 20000);
		Passenger passengerKim = new Passenger("혜린", 30000);
		
		Taxi taxiK = new Taxi("분노의질주 택시");
		Taxi taxiR = new Taxi("매드맥스 택시");
		
		passengerRyu.taketaxi(taxiK);
		passengerKim.taketaxit(taxiR);
		
		passengerRyu.showInfo();
		taxiK.showTaxiInfo();
		
		passengerKim.showInfo();
		taxiR.showTaxiInfo();
	}

}
