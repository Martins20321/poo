package exercicio1;

public class Account {
	private int number;

	private String holder;

	private double balance;

	public Account(int number, String holder, double inicialDeposity) {

		this.number = number;

		this.holder = holder;

		deposit(inicialDeposity);

	}

	public Account(int number, String holder) {

		this.number = number;

		this.holder = holder;

	}

	public int getNumber() {

		return number;

	}

	public String getHolder() {

		return holder;

	}

	public void setHolder(String holder) {

		this.holder = holder;

	}

	public double getBalance() {

		return balance;

	}

	public void deposit(double amount) {

		this.balance += amount;

	}

	public void withdraw(double amount) {

		this.balance -= amount + 5.0;

	}

	public String toString() {

		return "account:" + number +

				", Holder:" + holder +

				", Balance: $" + balance;

	}

}
