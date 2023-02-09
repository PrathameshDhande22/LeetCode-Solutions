package leetcode;

import java.util.Arrays;

class Solution977 {
	public int[] sortedSquares(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}
}

public class Squares_of_a_Sorted_Array_977 {

	public static void main(String[] args) {
		int[] nums = { -4, -1, 0, 3, 10 };
		Solution977 ns = new Solution977();
		System.out.println(Arrays.toString(ns.sortedSquares(nums)));
	}

}
