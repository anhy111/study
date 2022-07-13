package chapter07.exercise.bank.expansion;

public class Bank {
	//필드
	private Customer[] customers;
	private int numberOfCustomers;
	
	
	//생성자
	public Bank() {
		customers = new Customer[10];
	}

	
	//메소드

	public void addCustomer(Customer customers) {
		this.customers[numberOfCustomers++] = customers;
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	public Customer[] getCustomers() {
		return customers;
	}
	
	public Customer getCustomer(int index) {
		return customers[index];
	}




	
	
}
