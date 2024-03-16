package Ques_7;

class CurrentAccount extends Account{
	double overdraft_limit=100000.00;
	double draw=0;
	
	void deposit(double amount) {
		System.out.println("\nCredit amount: "+amount);
		super.setBalance(amount+super.getBalance());
		System.out.println("Updated balance: "+super.getBalance());
	}
	
	void withdraw(double amount) {
		try {
			if (super.getBalance()<amount) {
				throw new InsufficientBalanceException("Insufficient Balance!");
			}
			else {
				this.draw+=amount;
				try {
					if(this.draw>=this.overdraft_limit) {
						throw new OverdraftLimitException("Overdraft limit reached!");
					}
					else {
						super.setBalance(super.getBalance()-amount);
						System.out.println("\nDebit amount: "+amount+"\nUpdated balance: "+super.getBalance());
					}
				}catch(OverdraftLimitException e) {
					System.out.println(e);
				}
			}
		}catch(InsufficientBalanceException e) {
			System.out.println(e);
		}
	}
	
}
