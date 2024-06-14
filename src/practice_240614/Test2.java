package practice_240614;

// 에러 2개 이상 잡을 수 있음
public class Test2 {
	public static void main(String[] args) {

		try {
			divide(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("정상적으로 종료되었습니다.");
	}

	private static int divide(int a, int b) {
		if (a / b == 0) {
			throw new ArithmeticException();
		} else {
			throw new NullPointerException();
		}
	}
}