package gpt_exceptions;
	
public class BankAccount {
	
	class InsufficientFundException extends Exception {
		public InsufficientFundException(String message) {
			super(message);
		}
	}
	
	class InvalidAmountException extends Exception {
		public InvalidAmountException(String message) {
			super(message);
		}
	}
	
	private double balance;
	
	public BankAccount(double balance) {
		if (balance < 0) {
			throw new IllegalArgumentException("Balance kann nicht negativ sein");
			
		}
		this.balance = balance;
	}
	
	
	public double getBalance() {
		return balance;
	}

	
	public void deposit(double amount) throws InvalidAmountException {
		if (amount <= 0) {
			throw new InvalidAmountException("Die Summe muss positiv sein");
		}
		
		balance = getBalance() + amount;
	}
	
	public void withdraw(double amount) throws InsufficientFundException, InvalidAmountException {
		if (amount <= 0) {
			throw new InvalidAmountException("Summe muss positiv sein");
		}
		if (amount > balance) {
			throw new InsufficientFundException("Du hast nicht genug Geld");
		}
		balance = balance - amount;
	}
	

public static void main(String[] args) {
	try {
		BankAccount account = new BankAccount(1000);
		System.out.println("Balance: " + account.getBalance());
		account.deposit(500);
		System.out.println("Balance: " + account.getBalance());
		account.withdraw(2000);
		
	} catch (InsufficientFundException | InvalidAmountException e) {
		System.out.println(e.getMessage());
	} catch (IllegalArgumentException e) {
		System.out.println(e.getMessage());
	}
}

}


