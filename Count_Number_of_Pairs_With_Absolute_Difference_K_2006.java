package leetcode;

class Solution2006 {
	public int countKDifference(int[] nums, int k) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
//				System.out.printf("i=%d,j=%d\n", i, j);
				if (Math.abs(nums[i] - nums[j]) == k) {
					count++;
				}
			}
		}
		return count;
	}
}

public class Count_Number_of_Pairs_With_Absolute_Difference_K_2006 {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 1, 5, 4 };
		Solution2006 ns = new Solution2006();
		System.out.println(ns.countKDifference(nums, 2));

	}

}
