package practice_240613.practice3;

public class AnimalTest {
	public static void main(String[] args) {
		Dog dog = new Dog();

		dog.setName("용팔이");

		// 오버로딩
		dog.sleep();
		dog.sleep(100);
	}
}
