package weeklyQuiz.week2;

public class Food extends Product {
	private int expirationDate;

	public Food(String name, int price, int stock, int expirationDate) {
		super(name, price, stock);
		this.expirationDate = expirationDate;
	}

	@Override
	public int calculatePrice(int price) {
		if (expirationDate <= 7) {
			return (int)(price * 0.8);
		} else {
			return price;
		}
	}
}
