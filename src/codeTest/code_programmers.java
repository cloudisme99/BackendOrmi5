package codeTest;

// 프로그래머스
// 코딩테스트 연슴 > 코딩 기초 트레이닝 > 접두사인지 확인하기
public class code_programmers {
	public static void main(String[] args) {
		String my_string = "banana";
		String is_prefix = "ban";

		// sol1)
		//int answer = 0;
		// for (int i = 0; i <= my_string.length(); i++) {
		// 	if (my_string.substring(0, i).equals(is_prefix))
		// 		System.out.println(my_string.substring(0, i));
		// 	answer = 1;
		// }
		// System.out.println(answer);

		// sol2)
		int answer = my_string.indexOf(is_prefix);

		if(answer == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}