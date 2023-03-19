package leetcode;

import java.util.Arrays;

class Solution628 {
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length - 1;
		int leftproduct = nums[n] * nums[n - 1] * nums[n - 2];
		int rightproduct = nums[0] * nums[1] * nums[n];
		return Math.max(leftproduct, rightproduct);
	}
}

public class Maximum_Product_of_Three_Numbers_628 {

	public static void main(String[] args) {
		int[] nums = { -1, -2, -3 };
		Solution628 ns = new Solution628();
		System.out.println(ns.maximumProduct(nums));
	}

}
