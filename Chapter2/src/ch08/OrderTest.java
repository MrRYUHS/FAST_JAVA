package ch08;

public class OrderTest {

	public static void main(String[] args) {

		Order orderA = new Order(12345, 010, "대구", 1017, 1025, 77777, 0003);
		System.out.println(orderA.showOrderInfo());
	}

}
