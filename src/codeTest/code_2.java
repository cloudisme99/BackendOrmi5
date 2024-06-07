package codeTest;

import java.util.Scanner;

/*    여러분은 아주 크게 짖는 개를 키우고 있습니다.
     hour 매개변수는 현재 시각을 의미하고 0~23까지 숫자를 넣을 수 있습니다.
     만약 개가 7시 이전이나 20시 이후에 짖으면 매우 곤란해질겁니다.
     만약 곤란한 상황이 발생하면 "짖으면 안돼!!" 를 반환하세요, 아니라면 "든든하군!" 을 반환하세요.

     barkingDogProblem(true, 6) ==> "짖으면 안돼!!"
     barkingDogProblem(true, 7) ==> "든든하군!"
     barkingDogProblem(false, 5) ==> "든든하군!"*/
public class code_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("짖음 여부와 시간을 입력해주세요!");
		boolean barking = scanner.nextBoolean();
		int hour = scanner.nextInt();
		System.out.println(barkingDogProblem(barking, hour));
	}

	public static String barkingDogProblem(boolean barking, int hour) {
		String str = "든든하군!";
		if ((hour <= 7 || hour >= 20) && barking) {
			str = "짖으면 안돼!";
		}
		return str;

		// return (hour <= 7 || hour >= 20) && barking ? "짖으면 안돼!!" : "든든하군!";
		// 이렇게 삼항연산자로 한 줄로 정리 가능함
	}
}
