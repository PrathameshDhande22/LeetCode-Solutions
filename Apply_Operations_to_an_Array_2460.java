package leetcode;

import java.util.Arrays;

class Solution2460 {
	public int[] applyOperations(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				nums[i] = 2 * nums[i];
				nums[i + 1] = 0;
			}
		}
		return sortByzero(nums);
	}

	public int[] sortByzero(int[] nums) {
		int[] result = new int[nums.length];
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				result[index++] = nums[i];
			}
		}
		return result;
	}
}

public class Apply_Operations_to_an_Array_2460 {
	public static void main(String[] args) {
		int[] nums = {0,1};
		Solution2460 ns = new Solution2460();
		System.out.println(Arrays.toString(ns.applyOperations(nums)));
	}

}
