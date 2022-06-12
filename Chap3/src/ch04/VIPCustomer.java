package ch04;

public class VIPCustomer extends Customer{
	
	double salesRatio;
	private String agentID;
	
	public VIPCustomer() {
		super();
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		System.out.println("VIPCustomer() call");
	}
	public VIPCustomer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
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
