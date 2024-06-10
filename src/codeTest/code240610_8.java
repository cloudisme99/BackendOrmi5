package codeTest;

import java.util.Scanner;
/*
// 주어진 문자열에서 각 문자마다 동일한 문자를 한 번 더 추가한 문자열을 반환하세요.

System.out.println(repeatChar("The")); // "TThhee"
System.out.println(repeatChar("AAbb")); // "AAAAbbbb"
System.out.println(repeatChar("Hi-There")); // "HHii--TThheerree"
 */
public class code240610_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("문자열을 입력하세요");
		String str = sc.next();
		System.out.println(repeatChar(str));
	}

	public static String repeatChar(String str) {
		if (str.length() == 0) {
			return str;
		}
		String firstStr = String.valueOf(str.charAt(0));
		return firstStr + firstStr + repeatChar(str.substring(1));
	}
}
