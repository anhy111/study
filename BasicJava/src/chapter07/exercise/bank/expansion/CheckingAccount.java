package chapter07.exercise.bank.expansion;

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
		}else if(protectedBy.balance >= amount - balance) {
			protectedBy.withdraw(amount-balance);
			return super.withdraw(balance);
		}
		return false;
		
	}
}
