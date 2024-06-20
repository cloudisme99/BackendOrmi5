package weeklyQuiz.week2;

public abstract class ShoppingMall {
	public int capacity;
	public Product[] products;

	public int stock;
	int n;

	public ShoppingMall(int capacity, Product products, int stock) {
		this.capacity = capacity;
		this.products = new Product[capacity];
		this.stock = stock;
	}

	// 제품 삭제
	public void removeProduct(Product product) {

	}

	// 제품 삭제 오버로딩
	public void removeProduct(Product product, String name) {
		int length = products.length;
		for (int i = 0; i < length; i++) {
			if (products[i].equals(name)) {
				for (int j = i; j < length - 1; j++) {
					products[j] = products[j + 1];
				}
				length--;
				break;
			} else
				System.out.println("지울 상품이 없습니다.");
		}
	}

	// 제품 추가
	public void addProduct(String name, int price, int stock) {
		if (n < capacity) {
			products[n] = new Product(name, price, stock);
			n++;
		} else {
			addProduct2(name, price, stock);
		}
	}

	public void addProduct2(String name, int price, int stock) {
		capacity *= 2;
		Product[] products = new Product[capacity];
	}

	// 제품 목록 출력
	public void displayProducts() {
		for (int i = 0; i < products.length; i++) {
			System.out.println("상품명: " + products[i].getName() + " 가격: " + products[i].getPrice()
				+ " 재고: " + products[i].getStock());
		}
	}

	public abstract boolean checkOrderAvailability();
}
