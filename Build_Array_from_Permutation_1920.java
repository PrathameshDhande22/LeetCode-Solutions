package leetcode;

import java.util.Arrays;

class Solution1920 {
	public int[] buildArray(int[] nums) {
		int[] ans = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[nums[i]];
		}
		return ans;
	}
}

public class Build_Array_from_Permutation_1920 {

	public static void main(String[] args) {
		Solution1920 ns = new Solution1920();
//		int nums[]= {0,2,1,5,3,4};
		int nums[] = { 5, 0, 1, 2, 3, 4 };
		System.out.println(Arrays.toString(ns.buildArray(nums)));
	}

}
