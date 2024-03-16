package Ques_7;

import java.util.Scanner;

public class BankingApplication {
	public static void main(String[]args) {
		
		Scanner k=new Scanner(System.in);
		
		SavingsAccount sa1=new SavingsAccount();
		System.out.println("Enter amount to deposit in Savings account: ");
		sa1.deposit(k.nextDouble());
		System.out.println("Enter amount to withdraw from Savings account: ");
		sa1.withdraw(k.nextDouble());
		
		CurrentAccount ca1=new CurrentAccount();
		System.out.println("Enter amount to deposit in Current account: ");
		ca1.deposit(k.nextDouble());
		System.out.println("Enter amount to withdraw from Current account: ");
		ca1.withdraw(k.nextDouble());
		
		k.close();
	}
}
