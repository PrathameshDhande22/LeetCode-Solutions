package leetcode;

class Solution2535 {
	public int differenceOfSum(int[] nums) {
		int elementsum = 0;
		int digitSum = 0;
		for (int no : nums) {
			elementsum += no;
			digitSum += digitsum(no);
		}
		return Math.abs(elementsum - digitSum);
	}

	private int digitsum(int no) {
		String digitString = Integer.toString(no);
		int sum = 0;
		for (int i = 0; i < digitString.length(); i++) {
			sum += Character.getNumericValue(digitString.charAt(i));
		}
		return sum;
	}
}

public class Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array_2535 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		Solution2535 ns = new Solution2535();
		System.out.println(ns.differenceOfSum(nums));
	}

}
