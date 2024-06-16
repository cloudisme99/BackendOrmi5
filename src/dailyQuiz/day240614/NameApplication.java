package dailyQuiz.day240614;

import java.util.Scanner;

public class NameApplication {
	public static void main(String[] args) {
		PersonalInformation PI = new PersonalInformation();

		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력해주세요: ");
		String name = scanner.next();

		try {
			PI.nameCheck(name);
		} catch (NameOutOfRangException e) {
			System.out.println(e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
