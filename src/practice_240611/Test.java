package practice_240611;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// practice_240611.Test2 test2 = new practice_240611.Test2();
		// System.out.println(test2.add(2, 5));
		// System.out.println(test2.sub(5, 2));

		// practice_240611.Person person1 = new practice_240611.Person("윤", 3062, 0, 25);
		// practice_240611.Person person2 = new practice_240611.Person("진", 2303, 1000, 24);
		// practice_240611.Person person3 = new practice_240611.Person("권", 4628, 800, 26);
		// practice_240611.Person person4 = new practice_240611.Person("정", 8609, 1200, 30);
		//
		// person2.sayMoney();
		//
		// practice_240611.Student student = new practice_240611.Student();
		//
		// person1.teaching(student);
		// person1.cheating(student);

		Scanner scanner = new Scanner(System.in);

		// 계좌 생성
		System.out.print("계좌번호를 입력하세요: ");
		String accountNumber = scanner.nextLine();
		System.out.print("소유자 이름을 입력하세요: ");
		String ownerName = scanner.nextLine();
		BankAccount account = new BankAccount(accountNumber, ownerName);

		// 입금 및 출금
		account.deposit(90000);
		account.withdraw(50000);

		// 잔액 조회
		account.printBalance();

		scanner.close();
	}
}