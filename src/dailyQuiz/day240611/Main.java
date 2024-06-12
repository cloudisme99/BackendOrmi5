package dailyQuiz.day240611;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력해주세요: ");
		String name = sc.next();
		System.out.print("나이를 입력해주세요: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("주소를 입력해주세요: ");
		String address = sc.nextLine();
		Introduce me = new Introduce(name, age, address);

		System.out.print("졸업한 대학교 이름을 입력해주세요: ");
		String universityName = sc.next();
		System.out.print("전공 이름을 입력해주세요: ");
		String major = sc.next();
		System.out.print("입학년도를 입력해주세요: ");
		int enterYear = sc.nextInt();
		System.out.print("졸업년도를 입력해주세요: ");
		int graduationYear = sc.nextInt();

		University university = new University(universityName, major, enterYear, graduationYear);

		me.name(name);
		me.age(age);
		me.address(address);
		me.graduationUniversity(university);
		me.universityMajor(university);
		me.universityYear(university);

		sc.close();
	}
}
