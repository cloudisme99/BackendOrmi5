package dailyQuiz.day240611;

public class Introduce {
	String name;
	int age;
	String address;

	public Introduce(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void name(String name) {
		System.out.println("안녕하세요, 제 이름은 " + name + "입니다.");
	}

	public void age(int age) {
		System.out.println("제 나이는 " + age + "살 입니다.");
	}

	public void address(String address) {
		System.out.println("제 주소는 " + address + "입니다.");
	}

	public void universityYear(University university) {
		university.year();
	}

	public void graduationUniversity(University university) {
		university.graduationUniversity();
	}

	public void universityMajor(University university) {
		university.major();
	}

}
