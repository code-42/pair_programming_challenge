package pair_programming_challenge;

public class SavingsAccount extends BankAccount {
	
	// required data
	double interestRate;

	public SavingsAccount(String name, int acctNumber, String branchLocation, double totalBalance, double interestRate) {
		super(name, acctNumber, branchLocation, totalBalance);
		
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	
	// required method
	public void addInterest() {
		
		double interest = getTotalBalance() * interestRate / 100;
		
		double balanceWithInterest = getTotalBalance() + interest;
		
		setTotalBalance(balanceWithInterest);
		
	}

}
