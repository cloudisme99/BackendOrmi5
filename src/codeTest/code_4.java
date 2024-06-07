package codeTest;

// 다음 문장을 for 문을 이용해 순회하면서 안에 있는 문자를 모두 순서대로 한번씩 콘솔로 출력해보세요.

//String someTxt = "물방울이 떨어지는 소리를 들으며 나는 한적한 숲속 오두막에서 책을 읽고 있었다.";
/*
*
물
방
울
이
* */

// 그리고 거꾸로 가장 마지막 문자부터 출력하도록 만들어 보세요.
public class code_4 {
	public static void main(String[] args) {
		String someTxt = "물방울이 떨어지는 소리를 들으며 나는 한적한 숲속 오두막에서 책을 읽고 있었다.";
		// 순서대로 출력
		for (int i = 0; i < someTxt.length(); i++) {
			System.out.println(someTxt.charAt(i));
		}

		// 거꾸로 출력
		for (int i = someTxt.length() - 1; i >= 0; i--) {
			System.out.println(someTxt.charAt(i));
		}
	}
}
