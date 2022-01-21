package abstractclassandmethods;

public class SavingsAccount extends BankAccount {
	public SavingsAccount(String accNo) {
		super();
	}
	@Override
	public void deposit() {
		System.out.println("deposit into savins account");
	}

    @Override
    public void withdraw() {
    	System.out.println("withdraw from savings account");
    }
	
}