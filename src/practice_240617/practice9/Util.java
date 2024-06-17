package practice_240617.practice9;

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> tBox = new Box<>();
		tBox.set(t);
		return null;
	}
}
