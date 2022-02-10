package ch03;

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
		customerGrade = "골드";
		
		System.out.println("VIPCustomer(int, String) call");
	}

	public String getAgentID() {
		return agentID;
	}
}
