package practice_240618;

public class CompareTest {
	public static void main(String[] args) {
		compareString("hello", "java");
	}

	public static <T extends String> void compareString(T t1, T t2) {
		if (t1.equals(t2)) {
			System.out.println("okay");
		} else
			System.out.println("no");
	}
}
