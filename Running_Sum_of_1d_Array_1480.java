package leetcode;

import java.util.Arrays;

class Solution1480 {
	public int[] runningSum(int[] nums) {
		int[] ans = new int[nums.length];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j <= i; j++) {
				sum += nums[j];
			}
			ans[i] = sum;
			sum = 0;
		}
		return ans;
	}
}

public class Running_Sum_of_1d_Array_1480 {

	public static void main(String[] args) {
		int[] nums = { 3, 1, 2, 10, 1 };
		Solution1480 ns = new Solution1480();
		System.out.println(Arrays.toString(ns.runningSum(nums)));
	}

}
