package weeklyQuiz;

import java.util.Scanner;

// 계산기 만들어보기
public class week1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int func;
		do {
			System.out.println("원하는 기능을 선택하세요 \n 1. 덧셈 /2. 뺄셈 /3.곱셉 /4. 나눗셈 /0. 종료");
			func = scanner.nextInt();

			if (func == 0) {
				System.out.println("계산기를 종료합니다.");
				break;
			} else if (!(func >= 1 && func <= 4)) {
				System.out.println("올바른 입력이 아닙니다.");
				continue;
			}
			System.out.println("첫 번째 값을 입력하고 엔터를 누르세요.");
			int a = scanner.nextInt();
			System.out.println("두 번째 값을 입력하고 엔터를 누르세요.");
			int b = scanner.nextInt();

			switch (func) {
				case 1:
					System.out.println(a + " + " + b + " = " + (a + b));
					break;
				case 2:
					System.out.println(a + " - " + b + " = " + (a - b));
					break;
				case 3:
					System.out.println(a + " * " + b + " = " + (a * b));
					break;
				case 4:
					System.out.println(a + " / " + b + " = " + (a / b));
					break;
			}
		} while (func != 0);
		scanner.close();
	}
}
