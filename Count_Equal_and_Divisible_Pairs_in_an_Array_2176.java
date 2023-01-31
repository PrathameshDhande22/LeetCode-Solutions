package leetcode;

class Solution2176 {
	public int countPairs(int[] nums, int k) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j] && (i * j) % k == 0) {
					count++;
				}
			}
		}
		return count;
	}
}

public class Count_Equal_and_Divisible_Pairs_in_an_Array_2176 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		Solution2176 ns = new Solution2176();
		System.out.println(ns.countPairs(nums, 1));
	}

}
