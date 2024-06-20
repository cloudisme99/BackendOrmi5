package practice_240620.practice5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		//numbers.stream();

		// int[] array = {1, 2, 3, 4, 5};
		// IntStream stream = Arrays.stream(array);
		//
		// Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

		// numbers.stream().filter(integer -> integer % 2 == 0);
		numbers.stream()
			.filter(integer -> integer % 2 == 0)
			.forEach(integer -> System.out.println(integer));

		// numbers.stream().map(integer -> integer * 2);
		List<Integer> collect = numbers.stream().map(integer -> integer * 2)
			.collect(Collectors.toList());

		// numbers.stream().sorted();
		numbers.stream().sorted().forEach(integer -> System.out.println(integer));

		// 홀수만 출력(리스트 사용)
		List<Integer> collect2 = numbers.stream().filter(integer -> integer % 2 == 1)
			.collect(Collectors.toList());
		System.out.println(collect2);

		// 정수 리스트에서 홀수만 필터링하여 출력하는 프로그램을 람다 표현식을 사용하여 작성하세요
		numbers.stream()
			.filter(n -> n % 2 == 1)
			.forEach(n -> System.out.println(n));

		// 문자열 리스트에서 길이가 5 이하인 문자열만 출력하는 프로그램을 람다 표현식을 사용하여 작성하세요
		List<String> strings = new ArrayList<>(Arrays.asList("사과", "수박", "애플망고", "냄새나는두리안"));
		strings.stream()
			.filter(s -> s.length() <= 5)
			.forEach(s -> System.out.println(s));

	}
}
