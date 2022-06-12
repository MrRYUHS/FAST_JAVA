package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer(10010, "Tomas");
		Customer customerJ = new GoldCustomer(10020, "James");
		Customer customerE = new VIPCustomer(10030, "Kim");
		
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerE);
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"님이 "+cost+"원 지불");
			System.out.println(customer.getCustomerName()+"님의 현재 보너스포인트 "+customer.bonusPoint);
		}
	}
}
