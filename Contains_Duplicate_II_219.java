package leetcode;

class Solution219 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					if (Math.abs(i - j) <= k) {
						return true;
					}

				}
			}
		}
		return false;
	}
}

public class Contains_Duplicate_II_219 {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 1, 2, 3 };
		int k = 2;
		Solution219 ns = new Solution219();
		System.out.println(ns.containsNearbyDuplicate(nums, k));
	}

}
