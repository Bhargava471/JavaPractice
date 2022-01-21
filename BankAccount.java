package abstractclassandmethods;

public abstract class BankAccount {
	public BankAccount() {
		System.out.println("abstract");
	}
	String accountNo;
	public abstract void deposit();
	public abstract void withdraw();
}

