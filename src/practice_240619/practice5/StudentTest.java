package practice_240619.practice5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {
		Map<Student, Integer> studentMap = new HashMap<>();

		studentMap.put(new Student(1, "홍길동"), 90);
		studentMap.put(new Student(2, "심청이"), 100);

		System.out.println(studentMap.size());

		Set<Map.Entry<Student, Integer>> entrySet = studentMap.entrySet();
		for (Map.Entry<Student, Integer> entry : entrySet) {
			Student key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key.getName() + ": " + value);
		}
	}
}
