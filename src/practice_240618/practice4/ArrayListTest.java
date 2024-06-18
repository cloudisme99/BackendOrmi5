package practice_240618.practice4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("홍길동");
		arrayList.add("홍길동2");
		arrayList.add("홍길동2");
		arrayList.add("홍길동2");
		arrayList.add("홍길동2");
		arrayList.add("홍길동2");

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("===================");

		// (타입 변수 : 순회할 리스트)
		for (String str : arrayList) {
			System.out.println(str);
		}
	}
}
