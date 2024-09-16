package demo1.org;

public class Main {
	public static void main(String[] args) {
		 // Create a bank account and a savings account
		 BankAccount account = new BankAccount("123456789",
		1000);
		 SavingsAccount savings = new SavingsAccount("987654321", 500, 200);
		 // Test deposit and withdrawal on the BankAccount
		 System.out.println("Bank Account Operations:");
		 account.deposit(500);
		 account.withdraw(200);
		 System.out.printf("Final balance: Rs%.2f%n%n", account.getBalance());
		 // Test deposit and withdrawal on the SavingsAccount
		 System.out.println("Savings Account Operations:");
		 savings.deposit(100);
		 savings.withdraw(150);
		 savings.withdraw(250); // Should exceed withdrawal limit
		 System.out.printf("Final balance: Rs%.2f%n", savings.getBalance());
		 System.out.printf("Withdrawal limit: Rs%.2f%n", savings.getWithdrawalLimit());
		 }
	
}
