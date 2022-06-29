package chapter08.exercise.bank;

public class SavingsAccount extends BankAccount {
	//필드
	private double interestRate;
	
	//생성자
	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	
	//메소드
	void updateBalance(int period) {
		balance += balance * interestRate * period;
	}
	@Override
	String getAccountType() {
		return "저축예금";
	}
	
}
