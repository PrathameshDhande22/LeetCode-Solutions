package leetcode;

class Solution2057 {
	public int smallestEqual(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (i % 10 == nums[i]) {
				return i;
			}
		}
		return -1;
	}
}

public class Smallest_Index_With_Equal_Value_2057 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		Solution2057 ns = new Solution2057();
		System.out.println(ns.smallestEqual(nums));
	}

}
