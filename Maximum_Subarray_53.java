package leetcode;

class Solution53 {
	public int maxSubArray(int[] nums) {
		// using kadane algorithm
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			max = Math.max(max, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return max;
	}
}

public class Maximum_Subarray_53 {

	public static void main(String[] args) {
		Solution53 ns = new Solution53();
		int[] nums = {-2,-1};
		System.out.println(ns.maxSubArray(nums));
	}

}
