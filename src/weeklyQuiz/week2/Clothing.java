package weeklyQuiz.week2;

public class Clothing extends Product {
	private String size;

	public Clothing(String name, int price, int stock, String size) {
		super(name, price, stock);
		this.size = size;
	}

	@Override
	public int calculatePrice(int price) {
		if (size.equals("S") || size.equals("M") || size.equals("L")) {
			return price;
		} else {
			return (int)(price * 1.1);
		}
	}
}
