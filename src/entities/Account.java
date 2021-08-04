package entities;

public class Account {
	
	private int number;
	private String name;
	private double balance;
	
	public Account(int number, String name, double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}

	public Account(int number, String name) {
		this.number = number;
		this.name = name;
		this.balance = 0.0;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double value) {
		balance += value;
	}
	public void withdraw(double value) {
		balance -= (value + 5);
	}
	
	
	public String toString() {
		return "Account Data:\n"+"Account " + getNumber() + ", Holder:" + getName() + ", Balance: $" + getBalance(); 
	}
	

	
}
