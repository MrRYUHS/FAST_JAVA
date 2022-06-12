package ch06;

public class GoldCustomer extends Customer {

	double salesRatio;
	private String agentID;
	
	public GoldCustomer() {
		super();
		bonusRatio = 0.02;
		salesRatio = 0.1;
		customerGrade = "Gold";
		System.out.println("GoldCustomer() call");
	}
	public GoldCustomer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "Gold";
		bonusRatio = 0.02;
		salesRatio = 0.1;
		System.out.println("GoldCustomer() call");
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
