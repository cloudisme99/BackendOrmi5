package practice_240618.practice3;

public class ProductTest {
	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("smart TV");
		product.setCompany("Samsung");

		StorageImpl<Tv> objectStorage = new StorageImpl<>(100);
	}
}
