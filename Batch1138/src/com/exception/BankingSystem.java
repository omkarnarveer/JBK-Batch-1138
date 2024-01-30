package com.exception;

public class BankingSystem {

    private double balance;
    private double dailyWithdrawalLimit;

    public BankingSystem(double initialBalance, double dailyWithdrawalLimit) {
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

    public void withdraw(double amount) {
        try {
            if (amount > balance) {
                throw new InsufficientFundsException("Insufficient funds. Your balance is less than the withdrawal amount.");
            }

            if (amount > dailyWithdrawalLimit) {
                throw new ExceedsDailyLimitException("Withdrawal amount exceeds the daily limit.");
            }

            // If no exceptions are thrown, proceed with the withdrawal
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ExceedsDailyLimitException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem(1000.0, 500.0);

        // Example 1: Withdrawal within limits
        bankingSystem.withdraw(200.0);

        // Example 2: Withdrawal exceeding balance
        bankingSystem.withdraw(1200.0);

        // Example 3: Withdrawal exceeding daily limit
        bankingSystem.withdraw(600.0);
    }
}