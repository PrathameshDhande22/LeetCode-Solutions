package leetcode;

class Solution35 {
	public int searchInsert(int[] nums, int target) {
		// using binary search
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return end + 1;
	}
}

public class Search_Insert_Position_35 {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
		Solution35 ns = new Solution35();
		System.out.println(ns.searchInsert(nums, 7));
	}

}
