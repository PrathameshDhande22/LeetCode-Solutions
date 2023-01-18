package leetcode;

import java.util.Arrays;

class Solution1929 {
	public int[] getConcatenation(int[] nums) {
		int[] ans = new int[2 * nums.length];
		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[i];
			ans[nums.length + i] = nums[i];
		}
		return ans;
	}
}

public class Concatenation_of_Array_1929 {

	public static void main(String[] args) {
		Solution1929 ns = new Solution1929();
//		int[] nums= {1,2,1};
		int[] nums = { 1, 3, 2, 1 };
		System.out.println(Arrays.toString(ns.getConcatenation(nums)));
	}

}
