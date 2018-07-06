package pair_programming_challenge;

public class Main {

	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount("John Dough", 112421, "1 Hope St. Providence, RI", 651.00);
		
		double balance = bankAccount.getTotalBalance();
		System.out.println(balance);

	}

}
