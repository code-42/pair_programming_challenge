package pair_programming_challenge;

public class BankAccount {
	
	// required data
	String name;
	int acctNumber;
	String branchLocation;
	double totalBalance;
	
	
	public BankAccount(String name, int acctNumber, String branchLocation, double totalBalance) {
		this.name = name;
		this.acctNumber = acctNumber;
		this.branchLocation = branchLocation;
		this.totalBalance = totalBalance;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAcctNumber() {
		return acctNumber;
	}


	public void setAcctNumber(int acctNumber) {
		this.acctNumber = acctNumber;
	}


	public String getBranchLocation() {
		return branchLocation;
	}


	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}


	public double getTotalBalance() {
		return totalBalance;
	}


	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}
	
	// required method
	public double applyTransaction(double amount) {
		
		return totalBalance;
	}
	
}
