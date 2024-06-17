package practice_240617.practice5;

public class ProfileMemoryRepository implements ProfileRepository {
	@Override
	public void save() {
		System.out.println("Memory에 프로필 저장");
	}
}
