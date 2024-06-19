package practice_240619;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {

		Map<String, List<String>> map = new HashMap<>();
		List<String> stringList = new ArrayList<>();
		stringList.add("홍길동");
		stringList.add("홍길동");
		stringList.add("홍길동");
		map.put("키1", stringList);

		Set<Entry<String, List<String>>> entries = map.entrySet();

		for(Entry<String,List<String>> entry:entries){
			String key = entry.getKey();
			List<String> value = entry.getValue();
			System.out.println("\t" + key + ": " + value);
		}
	}
}