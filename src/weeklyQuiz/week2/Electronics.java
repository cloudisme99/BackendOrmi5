package weeklyQuiz.week2;

public class Electronics extends Product {
	private String brand;

	public Electronics(String name, int price, int stock, String brand) {
		super(name, price, stock);
		this.brand = brand;
	}

	@Override
	public int calculatePrice(int price) {
		if (brand.equals("Apple")) {
			return (int)(price * 1.2);
		} else {
			return price;
		}
	}
}
