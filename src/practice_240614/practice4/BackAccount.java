package practice_240614.practice4;

public class BackAccount {
	private int balance;

	public void withdraw(int amount) throws InsufficientBalanceException {
		if (balance < amount) {
			throw new InsufficientBalanceException("잔액이 부족합니다.");
		}
		balance -= amount;
	}
}
