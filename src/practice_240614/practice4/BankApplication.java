package practice_240614.practice4;

public class BankApplication {
	public static void main(String[] args) {
		BackAccount account = new BackAccount();

		try {
			account.withdraw(10000);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
