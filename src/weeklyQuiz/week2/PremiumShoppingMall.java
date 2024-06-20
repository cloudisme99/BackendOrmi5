package weeklyQuiz.week2;

public class PremiumShoppingMall extends ShoppingMall {
	public PremiumShoppingMall(int capacity, Product products, int stock) {
		super(capacity, products, stock);
	}

	@Override
	public boolean checkOrderAvailability() {
		boolean isPossible = true;
		if (stock < 10) {
			isPossible = false;
		}
		return isPossible;
	}
}
