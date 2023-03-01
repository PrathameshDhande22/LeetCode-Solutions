package leetcode;

class Solution33 {
	public int search(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[low] <= nums[mid]) {
				if (target >= nums[low] && target <= nums[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (target >= nums[mid] && target <= nums[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}
}

public class Search_in_Rotated_Sorted_Array_33 {

	public static void main(String[] args) {
		Solution33 ns = new Solution33();
		int nums[] = { 5, 1, 3 };
		System.out.println(ns.search(nums, 5));
	}

}
