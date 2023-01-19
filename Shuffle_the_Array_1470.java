package leetcode;

import java.util.Arrays;

class Solution1470 {
	public int[] shuffle(int[] nums, int n) {
		int[] ans = new int[nums.length];
		int index = 0;
		for (int i = 0; i < n; i++) {
			ans[index] = nums[i];
			ans[index + 1] = nums[i + n];
			index += 2;
		}
		return ans;
	}
}

public class Shuffle_the_Array_1470 {

	public static void main(String[] args) {
		Solution1470 ns = new Solution1470();
		int nums[] = { 1, 1, 2, 2 };
		System.out.println(Arrays.toString(ns.shuffle(nums, 2)));
	}

}
