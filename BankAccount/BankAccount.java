package edu.monmouth.CS176.s1319673.BankAccount;

public class BankAccount {

	private double balance;
	private String owner;
	
	
	public BankAccount() {
		balance = 0.0;
	}
	
	public BankAccount(String owner, double startingAmt) {
		balance = startingAmt;
		this.owner = owner;
		
	}
	
	public void depositMoney(double amt) {
		balance = balance + amt;
		
	}
	
	public void withdrawMoney(double amt) {
		balance = balance - amt;
	}

	public String getOwner() {
		return owner;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
}
