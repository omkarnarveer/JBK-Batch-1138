package com.exception;

public class Banking_System {

	private double balance;
	private double dailyWithdrawalLimit;

	public Banking_System(double initialBalance, double dailyWithdrawalLimit) {
		this.balance = initialBalance;
		this.dailyWithdrawalLimit = dailyWithdrawalLimit;
	}

	// Custom exception for insufficient funds
	static class InsufficientFundsException extends Exception {
		public InsufficientFundsException(String message) {
			super(message);
		}
	}

	// Custom exception for exceeding daily limit
	static class ExceedsDailyLimitException extends Exception {
		public ExceedsDailyLimitException(String message) {
			super(message);
		}
	}

	public void withdraw(double amount) throws InsufficientFundsException, ExceedsDailyLimitException {
		if (amount > balance) {
			throw new InsufficientFundsException("Insufficient funds. Your balance is less than the withdrawal amount.");
		}

		if (amount > dailyWithdrawalLimit) {
			throw new ExceedsDailyLimitException("Withdrawal amount exceeds the daily limit.");
		}

		// If no exceptions are thrown, proceed with the withdrawal
		balance -= amount;
		System.out.println("Withdrawal successful. Remaining balance: " + balance);
	}

	public static void main(String[] args) {
		Banking_System bankingSystem = new Banking_System(1000.0, 500.0);

		try {
			// Example 1: Withdrawal within limits
			bankingSystem.withdraw(200.0);

			// Example 2: Withdrawal exceeding balance
			bankingSystem.withdraw(1200.0);

			// Example 3: Withdrawal exceeding daily limit
			bankingSystem.withdraw(600.0);

		} catch (InsufficientFundsException | ExceedsDailyLimitException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}