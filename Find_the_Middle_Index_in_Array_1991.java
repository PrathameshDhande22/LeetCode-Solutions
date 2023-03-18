package leetcode;

class Solution1991 {
	public int findMiddleIndex(int[] nums) {
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

public class Find_the_Middle_Index_in_Array_1991 {

	public static void main(String[] args) {
		int nums[] = { 2 };
		Solution1991 ns = new Solution1991();
		System.out.println(ns.findMiddleIndex(nums));
	}

}
