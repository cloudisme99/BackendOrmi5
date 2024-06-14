package practice_240614;

// 예외처리 - 언체크드예외
public class Test {
	public static void main(String[] args) {
		try {
			int result = 10 / 0;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}

		System.out.println("정상적으로 종료되었습니다.");
	}
}
