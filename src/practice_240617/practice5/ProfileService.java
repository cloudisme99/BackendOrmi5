package practice_240617.practice5;

public class ProfileService {
	// ProfileRepository profileRepository;
	//
	// public void saveProfile() {
	// 	profileRepository = new ProfileDBRepository();
	// 	profileRepository.save();
	// }

	public void saveProfile(ProfileRepository profileRepository) {
		profileRepository.save();
	}
}
