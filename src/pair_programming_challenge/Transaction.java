package pair_programming_challenge;

public class Transaction extends BankAccount {
	
	// minimum data
	double transactionAmount;
	double balanceBeforeTransaction;
	double balanceAfterTransaction;

	public Transaction(String name, int acctNumber, String branchLocation, double totalBalance, double transactionAmount) {
		super(name, acctNumber, branchLocation, totalBalance);
		this.transactionAmount = transactionAmount;
	}

	public double getAmount() {
		return transactionAmount;
	}

	// two base types of transactions
	// deposit
	public double deposit(double depositAmount) {
		this.balanceAfterTransaction = this.balanceBeforeTransaction + depositAmount;
		return this.balanceAfterTransaction;
	}
	
	// withdraw
	public double withdraw(double withdrawAmount) {
		this.balanceAfterTransaction = this.balanceBeforeTransaction - withdrawAmount;
		return this.balanceAfterTransaction;
	}
	
	public void setAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	
	public void theTransaction(double amount, String transactionType) {
		if(transactionType == "withdraw") {
			double withdraw = getTotalBalance() - amount;
			applyTransaction(withdraw);
		} else if(transactionType == "deposit") {
			double deposit = getTotalBalance() + amount;
			applyTransaction(deposit);
		}
	}

}
