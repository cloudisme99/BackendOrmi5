public class practice_240603 {
	public static void main(String[] args) {
		// int number1 = 10;
		// int number2 = 3;
		//
		// int sum = number1 + number2;
		// int diff1 = number2 - number1;
		// int diff2 = number1 - number2;
		//
		// int product = number1 * number2;
		// int quot = number1 / number2;
		// int reminder = number1 % number2;
		//
		// System.out.println("덧셈: " + sum);
		// System.out.println("뻴셈1: " + diff1);
		// System.out.println("뻴셈2: " + diff1);
		// System.out.println("곱셈: " + product);
		// System.out.println("나눗셈: " + quot);
		// System.out.println("나머지: " + reminder);

		// byte a = 1;
		// byte b = 1;
		// int c = (int)a+b;

		// int a = 10;
		// int b = 4;
		// int c = a / b;
		// double d = (double)a / b;
		//
		// System.out.println(d);

		// char c1 = 'A' + 1;
		// char c2 = 'A';
		// char c3 = c2 + 1;

		// System.out.println("Hello" + 123 + 456);
		// System.out.println(123+ 456+ "Hello");
		// StringBuilder sb = new StringBuilder();
		// sb.append(123);
		// sb.append(456);
		// sb.append("Hello");
		// System.out.println(sb);

		// int number1 = 10;
		// int number2 = 10;
		// System.out.println(number1 == number2);
		// System.out.println(number1 <= number2);
		// System.out.println(number1 >= number2);
		// System.out.println(number1 > number2);

		// String a = new String();
		// String b = new String();
		// System.out.println(a.equals(b));
		//
		// System.out.println('A' < 'B');

		// System.out.println(true && true);
		// System.out.println(true && false);
		// System.out.println(false && true);
		// System.out.println(false && false);

		// System.out.println(true ^ !true);
		// System.out.println(true ^ !false);
		// System.out.println(false ^ !true);
		// System.out.println(false ^ !false);

		// // i는 2의 배수이면서 3의 배수이다
		// i % 2 == 0 && i % 3 == 0;
		//
		// // x는 30의 배수이면서 2의 배수이거나 5의 배수이다
		// (x % 30 == 0) && (x % 2 == 0) || (x % 5 == 0);

		// System.out.println(1& ~1);
		// System.out.println(1| ~0);
		// System.out.println(1^ ~1);

		// int score = 95;
		// String grade = (score == 95 && score % 5 == 0) ? "good" : "bad";
		// System.out.println(grade);

		// int a = 10;
		// int b = 20;
		// if (a > b) {
		// 	System.out.println("a is greater than b");
		// } else if (a == b) {
		// 	System.out.println("a and b are equal");
		// } else {
		// 	System.out.println("a is less than b");
		// }
		//
		// String ment = (a > b) ? "a is greater than b" : (a == b) ? "a and b are equal" : "a is less than b";
		// System.out.println(ment);

		// // quiz1
		// int x = 10;
		// if (x > 0) {
		// 	System.out.println("x는 양수");
		// } else if (x < 0) {
		// 	System.out.println("x는 음수");
		// } else if (x == 0) {
		// 	System.out.println("x는 0");
		// }
		// String result = (x > 0) ? "양수" : (x < 0) ? "음수" : "0";
		//
		// // quiz2
		// int score = 75;
		// if (score >= 90) {
		// 	System.out.println("A");
		// } else if (score < 90 && score >= 80) {
		// 	System.out.println("B");
		// } else if (score < 80 && score >= 70) {
		// 	System.out.println("C");
		// } else if (score < 70 && score >= 60) {
		// 	System.out.println("D");
		// } else {
		// 	System.out.println("F");
		// }
		//
		// // quiz3
		// int year = 2023;
		// if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
		// 	System.out.println("윤년 입니다");
		// } else {
		// 	System.out.println("평년 입니다");
		// }
		//
		// // quiz4
		// int a = 10;
		// int b = 20;
		// int c = 30;
		// if (a > b && a > c) {
		// 	System.out.println("가장 큰값은 a: " + a);
		// } else if (b > a && b > c) {
		// 	System.out.println("가장 큰값은 b: " + b);
		// }
		// if (c > a && c > b) {
		// 	System.out.println("가장 큰값은 c: " + c);
		// }
		//
		// // quiz5
		// int passScore = 60;
		// int myScore = 75;
		// if (myScore >= passScore) {
		// 	System.out.println("합격입니다.");
		// } else {
		// 	System.out.println("불합격입니다.");
		// }

		// int a = 10;
		// int b = 5;
		//
		// boolean result1 = (a > 5) && (b < 10);
		// boolean result2 = (a > 5) || (b > 10);
		// boolean result3 = !(a > 5);

		// int three = 3;
		// int five = 5;
		// int two = 2;
		//
		// boolean result = (five > three) || (five < two) && (five < three);

		// int data = 10;
		//
		// switch (data) {
		// 	case 1:
		// 		System.out.println("1입니다.");
		// 		break;
		// 	case 2:
		// 		System.out.println("2입니다.");
		// }

		// String today = "Mon";
		// switch (today) {
		// 	case "Sun":
		// 		System.out.println("늦잠자기");
		// 		break;
		// 	case "Mon":
		// 		System.out.println("일찍 일어나기");
		// 		break;
		// 	case "Tue":
		// 		System.out.println("책읽기");
		// 		break;
		// 	case "Wed":
		// 		System.out.println("낮잠자기");
		// 		break;
		// 	case "Thu":
		// 		System.out.println("노래듣기");
		// 		break;
		// 	case "Fri":
		// 		System.out.println("영화보기");
		// 		break;
		// 	case "Sat":
		// 		System.out.println("운동하기");
		// 		break;
		// 	default:
		// 		System.out.println("알 수 없는 요일");
		// }

		// char grade = 'A';
		// switch (grade) {
		// 	case 'A':
		// 		System.out.println("Excellent");
		// 		break;
		// 	case 'B':
		// 		System.out.println("Good");
		// 		break;
		// 	case 'C':
		// 		System.out.println("Average");
		// 		break;
		// 	case 'D':
		// 		System.out.println("Below Average");
		// 		break;
		// 	case 'F':
		// 		System.out.println("Fail");
		// 		break;
		// }

		char operator = '+';
		int num1 = 20;
		int num2 = 10;
		switch (operator) {
			case '+':
				System.out.println(num1 + num2);
				break;
			case '-':
				System.out.println(num1 - num2);
				break;
			case '*':
				System.out.println(num1 * num2);
				break;
			case '/':
				System.out.println(num1 / num2);
				break;
		}
	}
}
