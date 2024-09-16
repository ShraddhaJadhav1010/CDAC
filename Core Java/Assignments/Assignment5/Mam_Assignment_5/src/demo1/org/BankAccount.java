package demo1.org;

public class BankAccount {
	private String accountNumber;
	 private double balance;
	 public BankAccount(String accountNumber, double initialBalance) {
	 this.accountNumber = accountNumber;
	 this.balance = initialBalance;
}
	 public void deposit(double amount) {
		 if (amount > 0) {
		 balance += amount;
		 System.out.printf("Deposited Rs%.2f. New balance is Rs%.2f.%n", amount, balance);
		 } else {
		 System.out.println("Deposit amount must be positive.");
		 }
		 }
		 public void withdraw(double amount) {
		 if (amount > 0 && amount <= balance) {
		 balance -= amount;
		 System.out.printf("Withdrew Rs%.2f. New balanceis Rs%.2f.%n", amount, balance);
		 } else {
		 System.out.println("Insufficient funds or invalid amount.");
		 }
		 }
		 public double getBalance() {
		 return balance;
		 }
		 public String getAccountNumber() {
		 return accountNumber;
		 }
}
