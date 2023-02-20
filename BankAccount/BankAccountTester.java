package edu.monmouth.CS176.s1319673.BankAccount;

public class BankAccountTester {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount("Gianna", 1000.00);
		BankAccount bankAccount2 = new BankAccount("Jane", 2000.00);
		BankAccount bankAccount3 = new BankAccount("X", 500);
		
		bankAccount2.withdrawMoney(150.00);
		bankAccount3.withdrawMoney(200.00);
		
		bankAccount.depositMoney(500.00);
		
		System.out.printf(" %s has $%.2f \n", bankAccount.getOwner(), bankAccount.getBalance());
		System.out.printf(" %s has $%.2f \n", bankAccount2.getOwner(), bankAccount2.getBalance());
		System.out.printf(" %s has $%.2f \n", bankAccount3.getOwner(), bankAccount3.getBalance());
	}

}
