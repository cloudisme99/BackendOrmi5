package codeTest;
/*주어진 문자열의 길이가 홀수인 경우, 문자열의 가운데 3글자를 반환하는 함수를 작성하세요.
	예를 들어, 문자열 "Monitor"의 경우 "nit"을 반환해야 합니다.
	만약 문자열의 길이가 3보다 작으면, 문자열 자체를 반환하세요.

	예제
	입력: "Monitor"
	출력: "nit"

	요구사항
	문자열의 길이가 홀수인 경우, 가운데 3글자를 반환합니다.
	문자열의 길이가 3보다 작으면, 문자열을 그대로 반환합니다.*/

import java.util.Scanner;

public class code_1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요: ");
		String str = scanner.next();
		scanner.nextLine();
		System.out.println(getMiddleThree(str));
	}

	public static String getMiddleThree(String str) {
		int len = str.length();
		int midIdx = len / 2;
		String result = "";
		if (len % 2 == 1) {
			result = str.substring(midIdx - 1, midIdx + 2);
		} else if (len < 3) {
			result = str;
		}
		return result;
	}
	// static ==> 클래스 레벨의 필드와 메서드를 정의할 때 사용하는 키워드
	// 클래스 레벨 ==> 인스턴스에 속하는게 x

}
