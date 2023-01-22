package leetcode;

class Solution1512 {
	public int numIdenticalPairs(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					sum++;
				}
			}
		}
		return sum;
	}
}

public class Number_of_Good_Pairs_1512 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		Solution1512 ns = new Solution1512();
		System.out.println(ns.numIdenticalPairs(nums));
	}

}
