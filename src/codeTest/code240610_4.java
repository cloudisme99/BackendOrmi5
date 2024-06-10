package codeTest;

import java.util.Scanner;
/*
세 개의 정수 first, second, third가 주어졌을 때,
second가 first보다 크고 third가 second보다 크면 true를 반환하는 코드를 작성하세요.
단, 마지막 opt 파라미터가 true인 경우에는 second가 first보다 크지 않아도 되지만,
여전히 third보다는 작아야 합니다.

System.out.println(isOrdered(1, 2, 4, false)); // true
System.out.println(isOrdered(1, 2, 1, false)); // false
System.out.println(isOrdered(1, 1, 2, true));  // true
 */
public class code240610_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 3개를 입력해주세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println("마지막 opt값을 입력해주세요.");
		boolean opt = sc.nextBoolean();

		System.out.println(isOrdered(a, b, c, opt));
	}

	public static boolean isOrdered(int a, int b, int c, boolean opt) {

		if (opt) {
			return a <= b && b < c;
		}
		return a < b && b < c;

	}
}
