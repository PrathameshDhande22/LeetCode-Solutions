package leetcode;

import java.util.Arrays;

class Solution2956 {
	public int[] findIntersectionValues(int[] nums1, int[] nums2) {
		int[] indices = new int[2];
		int n1 = nums1.length;
		int n2 = nums2.length;
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				if (nums1[i] == nums2[j]) {
					indices[0]++;
					break;
				}
			}
		}

		for (int i = 0; i < n2; i++) {
			for (int j = 0; j < n1; j++) {
				if (nums2[i] == nums1[j]) {
					indices[1]++;
					break;
				}
			}
		}
		return indices;
	}
}

public class Find_Common_Elements_Between_Two_Arrays_2956 {

	public static void main(String[] args) {
		int[] nums1 = { 3, 4, 2, 3 };
		int[] nums2 = { 1, 5 };
		Solution2956 ns = new Solution2956();
		System.out.println(Arrays.toString(ns.findIntersectionValues(nums1, nums2)));
	}

}
