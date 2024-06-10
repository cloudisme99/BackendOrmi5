package codeTest;

import java.util.Scanner;
/*
3개의 정수 인자 a, b, c가 주어졌을 때, 이들의 합을 반환하세요.
하지만, 인자 중 하나가 다른 인자와 동일하면, 그 숫자는 합산에서 제외합니다.
기본적으로 중복되지 않는 숫자만 합산합니다.

System.out.println(sumUnique(1, 2, 3)); // 6
System.out.println(sumUnique(3, 2, 3)); // 2
System.out.println(sumUnique(3, 3, 3)); // 0
 */
public class code240610_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 3개를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println(sumUnique(a, b, c));
	}

	public static int sumUnique(int a, int b, int c) {
		int sum = 0;
		if (a != b && b != c && a != c) {
			sum = a + b + c;
		} else if ((a == b) && (a != c)) {
			sum = c;
		} else if ((a == c) && (b != c)) {
			sum = b;
		} else if ((b == c) && (a != b)) {
			sum = a;
		} else
			sum = 0;
		return sum;
		/* 강사님 코드
		if( a == b && b == c) return 0;
        if(a == b) return c;
        if(a == c) return b;
        if(b == c) return a;
        return a + b + c;
		 */
	}
}
