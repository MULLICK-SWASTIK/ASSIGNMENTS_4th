package Bank;

import java.util.Scanner;

public class Main extends Bank {
	public static void main(String []args) {
		Scanner k=new Scanner(System.in);
		Bank b1=new Bank();
		System.out.print("Enter name: ");
		b1.name = k.nextLine();
		System.out.print("Enter account no.: ");
		b1.setAcc(k.nextInt());
		System.out.print("Enter pin: ");
		b1.setPin(k.nextInt());
		while (true) {
			System.out.print("\n0. Exit\n1. Deposit\n2. Withdraw\n3. Display Balance\nEnter choice: ");
			int ch=k.nextInt();
			switch(ch) {
			case 0:
				System.exit(ch);
			case 1:
				System.out.println("Enter amount to deposit: ");
				int dep_amount=k.nextInt();
				b1.deposit(dep_amount);
				break;
			case 2:
				System.out.println("Enter amount to withdraw: ");
				int draw_amount=k.nextInt();
				b1.withdraw(draw_amount);
				break;
			case 3:
				b1.Display_balance();
				break;
			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
