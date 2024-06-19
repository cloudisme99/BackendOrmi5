package practice_240619.practice7;

import java.util.Stack;

// stack
public class CoinTest {

	public static void main(String[] args) {
		Stack<Coin> coinStack = new Stack<>();

		coinStack.push(new Coin(100));
		coinStack.push(new Coin(500));
		coinStack.push(new Coin(10));
		coinStack.push(new Coin(50));

		while(!coinStack.isEmpty()){
			Coin pop = coinStack.pop();
			System.out.println(pop.getValue());
		}
	}
}
