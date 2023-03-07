package leetcode;

import java.util.Arrays;

class Solution2574 {
	public int[] leftRigthDifference(int[] nums) {
		int[] answer = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int lSum = 0, rSum = 0;
			for (int j = 0; j < i; j++) {
				lSum += nums[j];
			}
			for (int j = i + 1; j < nums.length; j++) {
				rSum += nums[j];
			}
			answer[i] = Math.abs(lSum - rSum);
		}
		return answer;
	}
}

public class Left_and_Right_Sum_Differences_2574 {

	public static void main(String[] args) {
		int[] nums = { 1 };
		Solution2574 ns = new Solution2574();
		System.out.println(Arrays.toString(ns.leftRigthDifference(nums)));
	}

}
