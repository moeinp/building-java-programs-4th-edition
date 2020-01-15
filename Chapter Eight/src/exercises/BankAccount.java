package exercises;

//A BankAccount keeps track of a user's money balance and ID,
//and counts how many transactions (deposits/withdrawals) are made.
public class BankAccount {
	private String name;
	private String id;
	private double balance;
	private int transactions;

	// Constructs a BankAccount object with the given id, and
	// 0 balance and transactions.
	public BankAccount(String id) {
		this.id = id;
		this.balance = 0.0;
		this.transactions = 0;
	}

	// returns the field values
	public double getBalance() {
		return balance;
	}

	public String getID() {
		return id;
	}

	public int getTransactions() {
		return transactions;
	}

	// Adds the amount to the balance if it is between 0-500.
	// Also counts as 1 transaction.
	public void deposit(double amount) {
		transactions++;
		if (amount >= 0 && amount <= 500) {
			this.balance += amount;
		}
	}

	// Subtracts the amount from the balance if the user has enough money.
	// Also counts as 1 transaction.
	public void withdraw(double amount) {
		transactions++;
		if (amount >= balance) {
			balance -= amount;
		}
	}

	public boolean transactionFee(double amount) {
		int num = 0;
		for (int i = 1; i <= transactions; i++) {
			num += amount * i;
		}
		if (num < balance) {
			balance -= num;
			return true;
		} else {
			balance = 0;
			return false;
		}
	}

	public String toString() {
		String blnc = name + ", ";
		int dollar = (int) ((Math.abs(balance) * 100) / 100);
		int cent = (int) ((Math.abs(balance) * 100) % 100);
		if (balance < 0) {
			blnc += "-";
		}
		blnc += "$" + dollar + ".";
		if (cent < 9) {
			blnc += "0";
		}
		blnc += cent;
		return blnc;
	}

	public void transfer(BankAccount acnt, double amnt) {
		if (balance < 5 || amnt <= 0) {
			return;
		} else if (balance <= amnt + 5) {
			acnt.balance += (balance - 5);
			balance = 0.0;
			transactions++;
			acnt.transactions++;
		} else {
			acnt.balance += amnt;
			balance -= (amnt + 5);
			transactions++;
			acnt.transactions++;
		}

	}
}