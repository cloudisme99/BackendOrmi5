package practice_240617.practice7;

public class Test {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("hello");

		Object o = (String) box.get();
	}
}
