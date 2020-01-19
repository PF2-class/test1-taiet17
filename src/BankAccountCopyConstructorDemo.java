import pc1.BankAccount;

public class BankAccountCopyConstructorDemo {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(200.0);
		BankAccount account2 = new BankAccount(account1);
		
		
		System.out.println("The balance account 1: " + account1.getBalance() + "$");
		System.out.println("The balance account 2: " + account2.getBalance() + "$");
	}

}
