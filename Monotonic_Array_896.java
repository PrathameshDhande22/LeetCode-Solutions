package leetcode;

class Solution896 {
	public boolean isMonotonic(int[] nums) {
		boolean inc = true;
		boolean dec = true;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] < nums[i + 1]) {
				dec = false;
			}
			if (nums[i] > nums[i + 1]) {
				inc = false;
			}
		}
		return inc | dec;
	}
}

public class Monotonic_Array_896 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3 };
		Solution896 ns = new Solution896();
		System.out.println(ns.isMonotonic(nums));
	}

}
