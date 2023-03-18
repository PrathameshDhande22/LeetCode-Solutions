package leetcode;

class Solution724 {
	public int pivotIndex(int[] nums) {
		int sum = 0;
		int totalSum = Arraysum(nums);
		for (int i = 0; i < nums.length; i++) {
			totalSum = totalSum - nums[i];
			if (totalSum == sum) {
				return i;
			}
			sum += nums[i];
		}
		return -1;
	}

	public int Arraysum(int[] nums) {
		int sum = 0;
		for (int no : nums) {
			sum += no;
		}
		return sum;
	}
}

public class Find_Pivot_Index_724 {

	public static void main(String[] args) {
		int[] nums = { 2, 1, -1 };
		Solution724 ns = new Solution724();
		System.out.println(ns.pivotIndex(nums));
	}

}
