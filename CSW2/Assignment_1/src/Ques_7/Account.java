package Ques_7;

abstract class Account {
	private double balance;
	private int account_number;
	
	int getAccountNumber() {
		return this.account_number;
	}
	
	double getBalance() {
		return this.balance;
	}
	
	void setAccountNumber(int account_number) {
		this.account_number=account_number;
	}
	
	void setBalance(double balance) {
		this.balance=balance;
	}
	
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
}
