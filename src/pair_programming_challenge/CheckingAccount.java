package pair_programming_challenge;

public class CheckingAccount extends BankAccount {
	
	// required data
	double serviceFee;

	public CheckingAccount(String name, int acctNumber, String branchLocation, double totalBalance, double serviceFee) {
		super(name, acctNumber, branchLocation, totalBalance);
		
		this.serviceFee = 12.00;
	}

	public double getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(double serviceFee) {
		this.serviceFee = serviceFee;
	}
	
	// required method
	public double yearlyServiceFee() {
		return this.serviceFee * 12;
	}
	
}
