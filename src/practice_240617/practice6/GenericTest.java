package practice_240617.practice6;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
	public static void main(String[] args) {
		ArrayList<Animal> stringArrayList = new ArrayList<>();
		stringArrayList.add(new Lion());

		List list = new ArrayList<>();
		String o = (String) list.get(0);
	}
}
