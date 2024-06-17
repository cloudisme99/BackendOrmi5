package practice_240617.practice3;

public interface InterfaceA {
	void methodA();

	default void showA() {
		System.out.println("okay");
	}
}