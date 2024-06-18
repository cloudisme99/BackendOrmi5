package practice_240618.practice5;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Java");
		arrayList.add("Spring");
		arrayList.add("Servlet/JSP");
		arrayList.add("DBMS");
		arrayList.add("JPA");

		System.out.println("총 객체 수: " + arrayList.size());

		System.out.println("===========");

		System.out.println("두 번째 인덱스: " + arrayList.get(2));

		System.out.println(arrayList.contains("java"));

		for(String str:arrayList) {
			System.out.println(str);
		}

		ArrayList<Object> objects = new ArrayList<>();

		objects.add(null);

		System.out.println(objects.isEmpty());
		objects.clear();
		System.out.println(objects.isEmpty());

	}
}
