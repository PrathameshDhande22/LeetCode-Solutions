package leetcode;

class Solution1979 {
	public int findGCD(int[] nums) {
		int min = nums[0], max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			min = Math.min(nums[i], min);
			max = Math.max(nums[i], max);
		}
		return GCDcalculator(min, max);
	}

	public int GCDcalculator(int a, int b) {
		int rem;
		while (b != 0) {
			rem = a % b;
			a = b;
			b = rem;
		}
		return a;
	}
}

public class Find_Greatest_Common_Divisor_of_Array_1979 {

	public static void main(String[] args) {
		int[] nums = { 3, 3 };
		Solution1979 ns = new Solution1979();
		System.out.println(ns.findGCD(nums));
	}

}
