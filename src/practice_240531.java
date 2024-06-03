public class practice_240531 {

	public static void main(String[] args) {

		// String firstname = "yeongyun";
		// String secondName = "heo";
		// String phone = "iphone";
		// String status = "충전중";
		//System.out.println("나는 " + secondName + " " + firstname + "입니다.");
		//System.out.println(firstname + "님의 " + phone + "이(가) " + status + " 상태입니다");

		//System.out.println(firstname.length());

		// String a = "hello";
		// String b = new String("hello");
		//
		// System.out.println(a.equals(b));
		// System.out.println(a == b);
		//
		// System.out.println(a.indexOf());

		// String a = "Hello World!";
		// System.out.println(a.contains("World"));
		// String b = "ESTSOFT";
		// System.out.println(b.contains("SOFT"));

		// String findChar = "What is your hobby";
		// System.out.print(
		// 	findChar.charAt(13) + "" + findChar.charAt(14) + "" + findChar.charAt(15) + "" + findChar.charAt(16) + ""
		// 		+ findChar.charAt(17));

		// String a = "WEEEE ASKE ;ND";
		// System.out.println(a.substring(0, 3) + a.substring(8, 10) + a.substring(12));

		// String a = "a:b:c:d";
		//
		// String[] split = a.split(":");

		// String name1  = "Tim";
		// int age1 = 30;
		//
		// String name2 = "Anna";
		// int age2 = 45;
		//
		// String.format("%s의 나이는 %s세 입니다", name1, age1);
		// String.format("%s의 나이는 %s세 입니다", name2, age2);

		// String result = "";
		//
		// result += "Hello ";
		// result += "java";
		// result += "World";
		// System.out.println(result);
		//
		// StringBuilder sb = new StringBuilder();
		// sb.append("Hello ");
		// sb.append("java");
		// sb.append("World");
		// System.out.println(sb);
		//
		// StringBuffer sf = new StringBuffer();
		// sf.append("Hello ");
		// sf.append("java");
		// sf.append("World");
		// System.out.println(sf);

		// StringBuffer sb = new StringBuffer();
		// sb.append("Hello");
		// sb.insert(0, "World");
		// sb.insert(0, "World");
		// sb.insert(0, "World");
		// sb.insert(0, "World");
		// System.out.println(sb);

		// int[] arr1 = new int[100];
		// String[] arr2 = new String[1000];
		// System.out.println(arr2[0]);

		// int positive = 10;
		// int negative = -10;
		//
		// System.out.println("양의 부호 연산자 적용: " + (+positive));
		// System.out.println("음의 부호 연산자 적용: " + (-positive));
		// System.out.println("음의 부호 연산자로 부호 반전: " + (+negative));
		// System.out.println("음의 부호 연산자로 다시 부호 반전: " + (-negative));

		// int x = 5;
		// int y = 5;
		//
		// System.out.println("전위 증가 연산자: " + (++x));
		// System.out.println("후위 증가 연산자: " + (y++));
		//
		// System.out.println("===================");
		// System.out.println("x는 "+x);
		// System.out.println("y는 "+y);

		// int x = 5;
		// int y = 5;
		//
		// System.out.println("전위 증가 연산자: " + (++x));
		// System.out.println("후위 증가 연산자: " + (y++));
		//
		// System.out.println("===================");
		// System.out.println("x는 " + x);
		// System.out.println("y는 " + y);


		// int x = 100;
		// int y = 100;
		//
		// System.out.println("전위 감소 연산자: " + (--x));
		// System.out.println("후위 감소 연산자: " + (y--));
		// System.out.println("전위 감소 연산자: " + (--x));
		// System.out.println("후위 감소 연산자: " + (y--));
		// System.out.println("전위 감소 연산자: " + (--x));
		// System.out.println("후위 감소 연산자: " + (y--));

		boolean isRaining = true;

		if(isRaining) {
			System.out.println("하늘에서 비가와요");
		}
		if(!isRaining) {
			System.out.println("김태희가 안옵니다");
		}

		boolean isSunny = false;

		if(!isSunny) {
			System.out.println("날씨가 맑아요");
		}else {
			System.out.println("집에서 쉽니다");
		}

	}
}







