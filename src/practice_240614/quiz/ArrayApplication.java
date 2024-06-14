package practice_240614.quiz;

import java.util.Scanner;

//quiz2
public class ArrayApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("배열의 크기를 입력하세요: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.print("배열의 요소를 입력하세요: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

	}
}
