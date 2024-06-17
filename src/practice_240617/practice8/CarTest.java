package practice_240617.practice8;

public class CarTest {
	public static void main(String[] args) {
		Car<String> stringCar = new Car<>();

		stringCar.setCar("setCar");
		String str = stringCar.getCar();

		System.out.println(str);
	}
}
