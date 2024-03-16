package Bank;

import java.util.*;

interface app {
	void withdraw(int amount);

	void deposit(int amount);
}

public class Bank implements app {
	private int acc_no, pin, amount;
	protected String name;
	static Scanner k = new Scanner(System.in);

	public int getAcc() {
		return acc_no;
	}

	public void setAcc(int acc_no) {
		this.acc_no = acc_no;
	}

	public int getpin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public void withdraw(int amount) {

		System.out.println("Enter pin: ");
		try {
			int ppin = k.nextInt();
			if (ppin != getpin()) {
				throw new PinException("Wrong Pin!");
			} else {
				int limit = getAmount() - amount;
				try {
					if (limit < 100) {
						throw new LessThanBaseException(
								"Cannot Allow to withdraw less than base amount without administrator override!");
					} else {
						System.out.println("Credited amount " + amount);
						setAmount(getAmount() - amount);
						Display_balance();
					}
				} catch (LessThanBaseException e) {
					System.out.println(e);
				}
			}
		} catch (PinException e) {
			System.out.println(e);
		}
	}

	@Override
	public void deposit(int amount) {
		System.out.println("Enter pin: ");
		try {
			int ppin = k.nextInt();
			if (ppin != getpin()) {
				throw new PinException("Wrong Pin!");
			} else {
				System.out.println("Debited amount  " + amount);
				setAmount(amount + getAmount());
				Display_balance();
			}
		} catch (PinException e) {
			System.out.println(e);
		}
	}

	void Display_balance() {
		System.out.println("Current balance: " + getAmount());
	}

}

class PinException extends Exception {
	PinException(String e) {
		super(e);
	}
}

class LessThanBaseException extends Exception {
	LessThanBaseException(String e) {
		super(e);
	}
}
