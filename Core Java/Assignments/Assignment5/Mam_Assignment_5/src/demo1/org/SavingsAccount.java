package demo1.org;

public class SavingsAccount extends BankAccount {
	
		private double withdrawalLimit;
		 public SavingsAccount(String accountNumber, double initialBalance, double withdrawalLimit) {
		 super(accountNumber, initialBalance);
		 this.withdrawalLimit = withdrawalLimit;
		 }
		 @Override
		 public void withdraw(double amount) {
		 if (amount > 0 && amount <= getBalance()) {
		 if (amount <= withdrawalLimit) {
		 super.withdraw(amount); // Call the parent
		 } else {
		 System.out.printf("Withdrawal limit exceeded. Maximum allowed is Rs%.2f.%n", withdrawalLimit);
		 }
		 } else {
		 System.out.println("Insufficient funds or invalid amount.");
		 }
		 }
		 public double getWithdrawalLimit() {
		 return withdrawalLimit;
		 }
		}


