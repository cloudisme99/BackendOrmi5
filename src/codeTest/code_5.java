package codeTest;
/*
 *    배열안에서 특정한 데이터를 찾는 함수를 만들어보세요. 찾을 수 있으면 해당원소의 index 값을 반환하고, 찾지 못하면 -1을 반환합니다.
 * search(new int[] {1,2,3,4,5}, 5); ==> 4
 * search(new int[] {1,2,3,4,5}, 6); ==> -1
 */

import java.util.Scanner;

public class code_5 {
	public static void main(String[] args) {
		int[] nums = new int[5];
		Scanner scanner = new Scanner(System.in);

		System.out.println("배열을 입력하세요");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scanner.nextInt();
		}
		//System.out.println(Arrays.toString(nums));
		System.out.println("찾고싶은 숫자를 입력하세요");
		int target = scanner.nextInt();
		System.out.println(search(nums, target));
	}

	static int search(int[] nums, int target) {
		int result = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				result = i;
				break;
			}
		}
		return result;
	}
}
