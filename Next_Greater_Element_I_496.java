package leetcode;

import java.util.Arrays;

class Solution496 {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] ans = new int[nums1.length];
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]) {
					if (j == nums2.length - 1) {
						ans[i] = -1;
					} else {
						ans[i] = returnedAnss(j, nums2, nums2[j]);
					}
				}
			}
		}
		return ans;
	}

	public int returnedAnss(int start, int nums[], int compareNo) {
		int ans = -1;
		for (int a = start; a < nums.length; a++) {
			if (compareNo < nums[a]) {
				ans = nums[a];
				return ans;
			}
		}
		return ans;
	}
}

public class Next_Greater_Element_I_496 {

	public static void main(String[] args) {
		Solution496 ns = new Solution496();
//		int nums1[]= {4,1,2};
		int nums1[] = { 1, 3, 5, 2, 4 };
//		int nums1[] = { 2, 4 };
//		int nums2[] = { 1, 3, 4, 2 };
		int nums2[] = { 6, 5, 4, 3, 2, 1, 7 };
//		int nums2[]= {1,2,3,4};
		System.out.println(Arrays.toString(ns.nextGreaterElement(nums1, nums2)));
	}

}
