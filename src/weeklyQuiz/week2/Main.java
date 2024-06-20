package weeklyQuiz.week2;

public class Main {
	public static void main(String[] args) {
		Product product = new Product("상품", 5000, 9);
		PremiumShoppingMall premiumShoppingMall = new PremiumShoppingMall(5, product, product.getStock());

		Clothing clothing = new Clothing("의류", 10000, 5, "L");
		Electronics electronics = new Electronics("핸드폰", 20000, 7, "Apple");
		Food food = new Food("빵", 2000, 20, 6);

		// Product 클래스의 calculatePrice() 메소드는 가격(price)을 그대로 리턴함
		System.out.println("Product 가격: " + product.calculatePrice(product.getPrice()));

		// Clothing 클래스의 calculatePrice() 메소드는 사이즈가 "L" 이상이면 가격에 10%를 추가하여 리턴함
		System.out.println("Clothing L사이즈 이상일때 가격: " + clothing.calculatePrice(clothing.getPrice()));

		// Electronics 클래스의 calculatePrice() 메소드는 브랜드가 "Apple"이면 가격에 20%를 추가하여 리턴함
		System.out.println("Electronics Apple 일때 가격: " + electronics.calculatePrice(electronics.getPrice()));

		// Food 클래스의 calculatePrice() 메소드는 유통기한이 7일 이하로 남았다면 가격에서 20%를 할인하여 리턴함
		System.out.println("Food 유통기한 7일 이하 가격 : " + food.calculatePrice(food.getPrice()));

		// PremiumShoppingMall 클래스의 checkOrderAvailability() 메소드는
		// 모든 상품의 재고량이 10개 이상일 때만 true를 리턴하고 그 외에는 false를 리턴할 것
		System.out.println("재고량 10개 이상인가? " + premiumShoppingMall.checkOrderAvailability());

		premiumShoppingMall.addProduct("상품추가", 777, 17);
		premiumShoppingMall.removeProduct(product, "상품추가1");
		premiumShoppingMall.displayProducts();
	}
}
