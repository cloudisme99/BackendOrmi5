package dailyQuiz.day240611;

import java.time.LocalDate;

public class University {
	String universityName;
	String major;
	int enterYear;
	int graduationYear;

	public University(String universityName, String major, int enterYear, int graduationYear) {
		this.universityName = universityName;
		this.major = major;
		this.enterYear = enterYear;
		this.graduationYear = graduationYear;
	}

	public void year() {
		LocalDate today = LocalDate.now();
		int thisYear = today.getYear();

		System.out.println("입학한지 " + (thisYear - enterYear) + "년째입니다.");
		System.out.println("졸업한지 " + (thisYear - graduationYear) + "년째입니다.");
	}

	public void graduationUniversity() {
		System.out.println("저는 " + universityName + "를 졸업했습니다.");
	}

	public void major() {
		System.out.println("제 전공은 " + major + "입니다.");
	}
}
