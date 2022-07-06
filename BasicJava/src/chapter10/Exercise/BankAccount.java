package chapter10.Exercise;

public class BankAccount {
	
	//필드
	protected int balance;
	
	
	//생성자
	public BankAccount(int balance) {
		this.balance = balance;
	}

	
	//메소드
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public boolean withdraw(int amount) {
		if(balance >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	}
	
	public boolean transfer(int amount, BankAccount otherAccount) {
		if(amount < 0 || this.balance < amount) {
			throw new IllegalArgumentException();
		}
		if(otherAccount == null) {
			throw new NullPointerException();
		}
		if(withdraw(amount)) {
			otherAccount.deposit(amount);
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("잔액: %,d", balance);
	}
	
}
