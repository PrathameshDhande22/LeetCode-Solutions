package leetcode;

class Solution485 {
	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int count = 0;
		for (int n = 0; n < nums.length; n++) {
			if (nums[n] == 1) {
				count++;
			} else {
				max = Math.max(max, count);
				count = 0;
			}
		}
		return Math.max(max, count);
	}
}

public class Max_Consecutive_Ones_485 {

	public static void main(String[] args) {
		Solution485 ns = new Solution485();
//		int nums[]= {1,1,0,1,1,1};
		int nums[] = { 1, 0, 1, 1, 0, 1 };
		System.out.println(ns.findMaxConsecutiveOnes(nums));
	}

}
