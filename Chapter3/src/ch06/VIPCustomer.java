package ch06;

public class VIPCustomer extends Customer{

	
	

	double salesRatio;
	private String agentID;
	
//	public VIPCustomer() {
//		
//		super(0, "류승연");
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		customerGrade = "골드";
//		
//		System.out.println("VIPCustomer() call");
//	}
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "다이아";
				
	}
	

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}

	public String getAgentID() {
		return agentID;
	}
}
