package chapter07.exercise.bank.original;

public class Customer {
	//필드
	private String firstName;
	private String lastName;
	private BankAccount account;


	//생성자
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	//메소드
	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public BankAccount getAccount() {
		return account;
	}


	public void setAccount(BankAccount account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return String.format("이름: %s %s, 잔고: %,d원",
						firstName, lastName, account.getBalance());
	}
}