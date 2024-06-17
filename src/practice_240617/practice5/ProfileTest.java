package practice_240617.practice5;

public class ProfileTest {
	public static void main(String[] args) {
		ProfileService profileService = new ProfileService();

		// 다형성
		profileService.saveProfile(new ProfileMemoryRepository());
		profileService.saveProfile(new ProfileDBRepository());
	}
}
