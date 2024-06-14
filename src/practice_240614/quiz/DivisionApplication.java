package practice_240614.quiz;

import java.util.Scanner;

// quiz1
public class DivisionApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력하세요: ");
		int a = scanner.nextInt();
		System.out.println("두 번째 정수를 입력하세요: ");
		int b = scanner.nextInt();

		try {
			div(a,b);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {
			scanner.close();
		}
		System.out.println("정상적으로 종료되었습니다.");

	}

	private static void div(int a, int b) {
		int result = a / b;
		System.out.println("a / b = " + result);
	}
}
