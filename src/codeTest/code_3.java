package codeTest;

/**
 * 주어진 문장에서 category 에 해당하는 모든 단어를 출력하세요.
 *
 "When organizing items, always label each group with the appropriate
 category. category: books, category: electronics, category: clothing, category: kitchenware,
 and so on. "
 */

public class code_3 {
	public static void main(String[] args) {
		String str = "When organizing items, always label each group with the appropriate category. category: books, category: electronics, category: clothing, category: kitchenware, and so on.";
		printCategory(str);
	}

	static void printCategory(String str) {
		int i = 0;
		while (true) {
			// i 의 값이 업데이트 되면서 해당 인덱스의 문자열을 탐색
			int idx = str.indexOf("category:", i);
			if (idx == -1) {
				break;
			}

			int startIdx = idx + 9;
			int endIdx = str.indexOf(',', startIdx);

			System.out.println(str.substring(startIdx, endIdx));

			i = endIdx + 1;
		}
	}

}
