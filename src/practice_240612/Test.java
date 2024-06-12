package practice_240612;

public class Test {
	public static void main(String[] args) {

		Person person1 = new Person("영윤", 26);
		Person person2 = new Person("승", 27);

		person1.sayHello();
		person1.introduce();

		person2.sayHello();
		person2.introduce();

		System.out.println(Person.GENDER);
		System.out.println(Person.LECTURE);
		System.out.println(Person.PHONE_NUMBER);
	}
}
