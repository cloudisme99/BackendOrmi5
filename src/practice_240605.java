import java.util.Random;
import java.util.Scanner;

public class practice_240605 {
	public static void main(String[] args) {
		// //문제:
		// // 문자열 배열 String[] words가 주어집니다. 이 배열에는 여러 단어들이 저장되어 있습니다.
		// // 이중 포문을 사용하여 모든 단어 쌍의 조합을 출력하는 프로그램을 작성하세요.
		// // 단, 같은 단어를 중복해서 출력하면 안 되며, 단어 쌍의 순서는 고려하지 않습니다.
		// //    예시 출력:
		// //apple banana
		// //apple cherry
		// //apple durian
		// //banana cherry
		// //banana durian
		// //cherry durian
		// String[] words = {"apple", "banana", "cherry", "durian"};
		// for (int i = 0; i < words.length - 1; i++) {
		// 	for (int j = i + 1; j < words.length; j++) {
		// 		System.out.println(words[i] + " " + words[j]);
		// 	}
		// }

		// Scanner sc = new Scanner(System.in);
		//
		// System.out.println("정수를 입력해주세요.");
		// int number = sc.nextInt();
		// sc.nextLine();
		//
		// String line = sc.nextLine();
		//
		// System.out.println("정수는  = " + number);
		// System.out.println("문자열은 = " + line);
		//
		// sc.close();

		// // 문제:
		// // "계절을 맞춰보세요!"라는 자바 프로그램을 작성해보세요.
		// // 사용자에게 1에서 4 사이의 숫자를 입력하라고 요청합니다.
		// // 각 숫자는 계절을 나타냅니다: 1은 봄, 2는 여름, 3은 가을, 4는 겨울입니다.
		// // 사용자가 숫자를 입력하면, 프로그램은 해당 계절의 이름을 출력해야 합니다. 만약 사용자가 1에서 4 사이의 숫자가 아닌 것을 입력하면, "잘못된 입력입니다!"라고 출력해야 합니다.
		// // 	이 문제를 해결하기 위해 switch 문을 사용하세요.
		// Scanner sc = new Scanner(System.in);
		//
		// System.out.println("1에서 4사이의 숫자를 입력해주세요.");
		// int n = sc.nextInt();
		// sc.nextLine();
		//
		// switch (n) {
		// 	case 1:
		// 		System.out.println("봄 입니다.");
		// 		break;
		// 	case 2:
		// 		System.out.println("여름 입니다.");
		// 		break;
		// 	case 3:
		// 		System.out.println("가을 입니다.");
		// 		break;
		// 	case 4:
		// 		System.out.println("겨울 입니다.");
		// 		break;
		// 	default:
		// 		System.out.println("잘못된 입력입니다!");
		// }

		// // 퀴즈
		// int[] lotto = new int[6];
		// Random random = new Random();
		// System.out.print("로또 번호: ");
		// for (int i = 0; i < 6; i++) {
		// 	lotto[i] = random.nextInt(45) + 1;
		// 	for (int j = 0; j < i; j++) {
		// 		if (lotto[i] == lotto[j]) {
		// 			i--;
		// 		}
		// 	}
		// 	System.out.print("[" + lotto[i] + "]");
		// }

		// //숫자 맞추기 게임
		// Random random = new Random();
		// Scanner sc = new Scanner(System.in);
		//
		// int targetNumber = random.nextInt(100) + 1;
		//
		// System.out.println("1에서 100사이의 숫자를 입력해주세요.");
		// int n = sc.nextInt();
		// sc.nextLine();
		// while (targetNumber != n) {
		// 	if (targetNumber < n) {
		// 		System.out.println("더 작은 숫자를 입력해주세요!");
		// 		n = sc.nextInt();
		// 		sc.nextLine();
		// 	} else if (targetNumber > n) {
		// 		System.out.println("더 큰 숫자를 입력해주세요!");
		// 		n = sc.nextInt();
		// 		sc.nextLine();
		// 	} else {
		// 		System.out.println("정답입니다!");
		// 	}
		// }
		// sc.close();

		//영화 티켓 예매 시스템
		Scanner sc = new Scanner(System.in);

		System.out.println("영화제목: ");
		String title = sc.nextLine();

		System.out.println("관람 인원 수");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("예매자 성함");
		String name = sc.next();
		sc.nextLine();

		System.out.println("예매자 전화번호");
		String tell = sc.nextLine();

		System.out.println("=== 영화 티켓 예매 정보 ===");
		System.out.println("영화 제목: " + "[" + n + "]");
		System.out.println("관람 인원: " + "[" + title + "]");
		System.out.println("예매자 이름: " + "[" + name + "]");
		System.out.println("예매자 전화번호: " + "[" + tell + "]");
		System.out.println("총 결제 금액: " + "[" + n*10000 + "]원");

	}
}
