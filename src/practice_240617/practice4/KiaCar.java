package practice_240617.practice4;

public class KiaCar implements Car {
	@Override
	public String showEngine() {
		return "가성비 좋은 엔진";
	}

	@Override
	public int amountNavi() {
		return 10000;
	}

	@Override
	public String getTier() {
		return "가성비 좋은 타이어";
	}
}
