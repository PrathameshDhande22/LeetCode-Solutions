package leetcode;

class Solution1464 {
	public int maxProduct(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
//				System.out.println(String.format("i=%d,j=%d",nums[i],nums[j]));
				max = Math.max(((nums[i] - 1) * (nums[j] - 1)), max);
			}
		}
		return max;
	}
}

public class Maximum_Product_of_Two_Elements_in_an_Array_1464 {

	public static void main(String[] args) {
		int[] nums = { 3, 7 };
		Solution1464 ns = new Solution1464();
		System.out.println(ns.maxProduct(nums));
	}

}
