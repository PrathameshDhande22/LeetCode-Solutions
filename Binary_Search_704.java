package leetcode;

class Solution704 {
	public int search(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
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
		return -1;
	}
}

public class Binary_Search_704 {

	public static void main(String[] args) {
		int[] nums = { 5 };
		int target = 5;
		Solution704 ns = new Solution704();
		System.out.println(ns.search(nums, target));
	}

}
