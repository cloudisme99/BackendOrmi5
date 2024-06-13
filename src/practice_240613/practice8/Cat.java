package practice_240613.practice8;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("miumiu");
	}
}
