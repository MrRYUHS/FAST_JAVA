package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo()+ price);
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo()+ price);
		
		Customer vc = new VIPCustomer();
		vc.setCustomerName("만두");
		vc.setCustomerID(10030);
		vc.bonusPoint = 100000;
		vc.calcPrice(1000);
		System.out.println(vc.showCustomerInfo()+price);
		
		Customer customerT = new Customer(10040, "감자");
		customerT.bonusPoint = 1000;
		price = customerT.calcPrice(1000);
		System.out.println(customerT.showCustomerInfo()+price);
		
		Customer customerY = new VIPCustomer(10050, "고구마");
		customerY.bonusPoint = 1000;
		price = customerY.calcPrice(1000);
		System.out.println(customerY.showCustomerInfo()+price);
	}
}
