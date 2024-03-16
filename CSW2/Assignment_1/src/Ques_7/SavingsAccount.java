package Ques_7;

class SavingsAccount extends Account{
	private final double interest_rate=0.1;
	
	void deposit(double amount) {
//		int dep=amount;
		super.setBalance(amount+super.getBalance());
		double interest_amount=super.getBalance()*this.interest_rate;
		super.setBalance(interest_amount+super.getBalance());
		System.out.println("\nInterest amount after deposit: "+interest_amount+"\nUpdated balance: "+super.getBalance());
	}
	
	void withdraw(double amount) {
//		double limit=super.getBalance()-amount;
		try {
			if (super.getBalance()<amount) {
				throw new InsufficientBalanceException("Insufficient Balance!");
			}
			else {
				super.setBalance(super.getBalance()-amount);
				System.out.println("\nWithdrawal amount: "+amount+"\nUpdated balance: "+super.getBalance());
			}
		}catch(InsufficientBalanceException e) {
			System.out.println(e);
		}
	}
}
