package ch08;

public class Order {

	public int orderNumber;
	public int orderPhoneNumber;
	public String orderAddress;
	public int orderDay;
	public int orderHour;
	public int orderPrice;
	public int menuNumber;
	
	public Order(int orderNumber, int orderPhoneNumber, String orderAddress, int orderDay, int orderHour, int orderPrice, int menuNumber) {
		this.orderNumber = orderNumber;
		this.orderPhoneNumber = orderPhoneNumber;
		this.orderAddress = orderAddress;
		this.orderDay = orderDay;
		this.orderHour = orderHour;
		this.orderPrice = orderPrice;
		this.menuNumber = menuNumber;
	}
	
	public String showOrderInfo() {
		return "주문 접수 번호 : " + orderNumber + " 주문 핸드폰 번호 : " + orderPhoneNumber + " 주문 집 주소 : " + orderAddress + " 주문 날짜 : " + orderDay + " 주문 시간 : " + orderHour + " 주문 가격 : " + orderPrice + " 메뉴번호 : " + menuNumber;
	}
}
