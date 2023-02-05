package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2553 {
	private List<Integer> digits = new ArrayList<>();

	public int[] separateDigits(int[] nums) {
		for (int no : nums) {
			addDigit(no);
		}
		int[] answer = new int[digits.size()];
		for (int i = 0; i < digits.size(); i++) {
			answer[i] = digits.get(i);
		}
		return answer;
	}

	private void addDigit(int no) {
		String n = Integer.toString(no);
		for (int i = 0; i < n.length(); i++) {
			digits.add(Character.getNumericValue(n.charAt(i)));
		}
	}
}

public class Separate_the_Digits_in_an_Array_2553 {

	public static void main(String[] args) {
		Solution2553 ns = new Solution2553();
		int[] nums = { 7, 1, 3, 9 };
		System.out.println(Arrays.toString(ns.separateDigits(nums)));
	}

}
