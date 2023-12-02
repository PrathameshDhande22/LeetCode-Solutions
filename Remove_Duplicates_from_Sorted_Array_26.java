package leetcode;

import java.util.Arrays;

class Solution26 {
	public int removeDuplicates(int[] nums) {
		int index = 0, prev = -101;
		for (int i = 0; i < nums.length; i++) {
			if (prev != nums[i]) {
				prev = nums[i];
				nums[index++] = prev;
			} else if (prev == nums[i]) {
				continue;
			}
		}
		return index;
	}
}

public class Remove_Duplicates_from_Sorted_Array_26 {

	public static void main(String[] args) {
		Solution26 ns = new Solution26();
		int nums[] = { -1, 0, 0, 0, 0, 3, 3 };
		System.out.println(ns.removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
	}

}
