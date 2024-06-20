package practice_240620.practice4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		Iterator<Integer> iterator = numbers.iterator();

		// 람다식으로 짝수 지우기
		numbers.removeIf((integer -> integer % 2 ==0));

		// // while문과 iterator로 짝수 지우기
		// while(iterator.hasNext()) {
		// 	Integer next = iterator.next();
		// 	if(next % 2 ==0) {
		// 		iterator.remove();
		// 	}
		// }
		System.out.println(numbers);
	}

}
