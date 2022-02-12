package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerRyu = new Customer(2857, "류형수");
		customerRyu.setCustomerName("류형수");
		customerRyu.setCustomerID(2857);
		customerRyu.bonusPoint = 10000;
		
		int price = customerRyu.calcPrice(1000);
		System.out.println(customerRyu.showCustomerInfo() + price);
		
		
		VIPCustomer customerKim = new VIPCustomer(5830, "김혜린");
		customerKim.setCustomerName("김혜린");
		customerKim.setCustomerID(5830);
		customerKim.bonusPoint = 100000;
		
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo() + price);
		
		
		VIPCustomer customerKang = new VIPCustomer(7777, "강민주");
		customerKang.setCustomerName("강민주");
		customerKang.setCustomerID(7777);
		customerKang.bonusPoint = 50000;
		System.out.println(customerKang.showCustomerInfo());
		
		Customer vc = new VIPCustomer(12345, "류승연");
		vc.calcPrice(1000);
		System.out.println(vc.calcPrice(1000));
	}
}
