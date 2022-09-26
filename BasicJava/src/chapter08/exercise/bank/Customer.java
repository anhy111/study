package chapter08.exercise.bank;

public class Customer {
	//필드
	private String firstName;
	private String lastName;
	private BankAccount[] account;
	private int numberOfAccounts;
	
	//생성자
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		account = new BankAccount[5];
	}
	
	//메소드
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public BankAccount getAccount(int index) {
		return account[index];
	}

	public void addAccount(BankAccount account) {
		this.account[numberOfAccounts++] = account;
	}

	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}
