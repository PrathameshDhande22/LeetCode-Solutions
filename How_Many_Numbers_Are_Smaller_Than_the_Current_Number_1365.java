package leetcode;

import java.util.Arrays;

class Solution1365 {
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int ans[] = new int[nums.length];
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j && nums[j] < nums[i]) {
					count++;
				}
			}
			ans[i] = count;
			count = 0;
		}
		return ans;
	}
}

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number_1365 {

	public static void main(String[] args) {
		int[] nums = { 7, 7, 7, 7 };
		Solution1365 ns = new Solution1365();
		System.out.println(Arrays.toString(ns.smallerNumbersThanCurrent(nums)));
	}

}
