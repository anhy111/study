package chapter08.exercise.bank;

public class CheckingAccount extends BankAccount {
	//필드
	SavingsAccount protectedBy;
	
	//생성자
	public CheckingAccount(int balance) {
		super(balance);
	}
	
	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		this(balance);
		this.protectedBy = protectedBy;
	}
	
	//메소드
	@Override
	public boolean withdraw(int amount) {
		if(super.withdraw(amount)) {
			return true;
		}else if(protectedBy.balance >= amount - this.balance) {
			protectedBy.withdraw(amount-this.balance);
			this.balance = 0;
			return true;
		}
		return false;
	}
	
	@Override
	String getAccountType() {
		return "당좌예금";
	}
}
