package practice_240613.practice2;

public class MoneyTest {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();

		parent.saving();
		child.invest(parent.money);
	}
}
