import java.util.Arrays;

public class practice_240604 {
	public static void main(String[] args) {
		// 	int i = 10;
		// 	while (i >= 0) {
		// 		System.out.println("현재 카운트: " + i);
		// 		i--;
		// 	}
		// 	System.out.println("카운트 종료");

		// int n = 100;
		// int sum = 0;
		// while (n >= 0) {
		// 	sum += n;
		// 	n--;
		// }
		// System.out.println("합은: " + sum);

		// int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
		// int i = 0;
		// int sum = 0;
		// int length = numbers.length;
		// while (length > i) {
		// 	sum += numbers[i];
		// 	i++;
		// }
		// System.out.println("평균: " + sum / length);

		// int i = 0;
		// while (i <= 300) {
		// 	if (i % 3 == 0) {
		// 		System.out.println(i);
		// 	}
		// 	i++;
		// }

		// int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
		// int max = 0;
		// int i = 0;
		// while(i<numbers.length) {
		// 	if (numbers[i] >= max) {
		// 		max = numbers[i];
		// 	}
		// 	i++;
		// }
		// System.out.println("최댓값: " + max);

		// int sum = 0;
		// for (int i = 1; i <= 100; i++) {
		// 	if (i % 2 == 0) {
		// 		sum += i;
		// 	}
		// }
		// System.out.println(sum);

		// int n = 20;
		// int sum = 0;
		// for (int i = 0; i <= n; i++) {
		// 	if (i % 3 == 0 && i % 5 == 0) {
		// 		sum += i;
		// 	}
		// }
		// System.out.println(sum);

		// //피보나치 수열
		// int a = 1;
		// int b = 1;
		// int n = 0;
		// for(int i = 0; i<=10; i++) {
		// 	n = a+b;
		// 	int tmp =+ n;
		// 	System.out.print(n);
		//
		// }

		// for (int i = 0; i >= -100; i--) {
		// 	if (i % 2 == 0) {
		// 		System.out.println(i);
		// 	}
		// }

		// 	//피보나치 배열
		// 	int[] arr = new int[100];
		// 	arr[0] = 1;
		// 	arr[1] = 1;
		// 	for (int i = 2; i < 100; i++) {
		// 		arr[i] = arr[i - 2] + arr[i - 1];
		// 		System.out.println(arr[i]);
		// 	}
		// 	Arrays.setAll(arr, i -> (i < 2) ? 1 : arr[i - 1] + arr[i - 2]);
		// 	System.out.println(arr[10]);

		// for (int i = 1; i < 10; i++) {
		// 	for (int j = 1; j < 10; j++) {
		// 		System.out.println(i + " * " + j + " = " + i * j);
		// 	}
		// }
		// for (int k = 1; k < 10; k++) {
		// 	System.out.println(k + " * " + 2 + " = " + k * 2);
		// }

		// for (int i = 19; i > 0; i--) {
		// 	System.out.println(19 + " * " + i + " = " + 19 * i);
		// }

		// for (int i = 0; i < 10; i++) {
		// 	System.out.println("현재 i의 값은 = " + i);
		// 	for (int j = 0; j < 10; j++) {
		// 		System.out.println("현재 j의 값은 = " + j);
		// 	}
		// }

		// for (int i = 1; i <= 100; i++) {
		// 	System.out.println("i값: " + i);
		// 	if (i == 50)
		// 		break;
		// 	for (int j = 2; j <= 100; j++) {
		// 		System.out.println("j값: " + j);
		// 		if (j == 80)
		// 			break;
		// 	}
		// }

		// for (int i = 1; i <= 10; i++) {
		// 	if(i==4)
		// 		continue;
		// 	else if (i==7) {
		// 		continue;
		// 	}
		// 	System.out.println(i);
		// }

		// int[] scores = {1, 30, 20, 80, 15, 20, 30, 22};
		// int sum = 0;
		// double avg = 0;
		// for (int i : scores) {
		// 	sum += i;
		// }
		// avg = (double)sum / scores.length;
		// System.out.println("총합: " + sum);
		// System.out.println("평균: " + avg);

		// String[] arr = {"okay2", "asbds", "good2", "ormiiiii", "abcde"};
		// for (String name : arr) {
		// 	if (name.length() >= 5) {
		// 		System.out.println(name);
		// 	}
		// }

		// // Daily Quiz1
		// int count = 1;
		// while (count > 0) {
		// 	count++;
		// 	if (count == 10000)
		// 		break;
		// }
		// System.out.println(count);

		// Daily Quiz2
		for (int i = 9; i >= 2; i--) {
			for (int j = 9; j >= 1; j--){
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}

}
