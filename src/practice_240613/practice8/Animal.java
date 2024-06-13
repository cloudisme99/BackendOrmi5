package practice_240613.practice8;

public abstract class Animal {
	protected String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound();
}
