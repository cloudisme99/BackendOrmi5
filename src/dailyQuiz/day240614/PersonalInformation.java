package dailyQuiz.day240614;

public class PersonalInformation {

	public void nameCheck(String name) throws NameOutOfRangException {
		if (name.length() < 2) {
			throw new NameOutOfRangException("이름은 2글자 이상이어야 합니다.");
		}
		System.out.println("이름 정보가 저장되었습니다.");
	}

}
