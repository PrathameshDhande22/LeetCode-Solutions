package leetcode;

import java.util.ArrayList;

class Solution349 {
	public int[] intersection(int[] nums1, int[] nums2) {
		ArrayList<Integer> inter = new ArrayList<>();
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]) {
					if (!inter.contains(nums2[j]))
						inter.add(nums2[j]);
				}
			}
		}
		int[] interdup = new int[inter.size()];
		for (int i = 0; i < inter.size(); i++) {
			interdup[i] = inter.get(i);
		}
		return interdup;
	}
}

public class Intersection_of_Two_Arrays_349 {

	public static void main(String[] args) {
		Solution349 ns = new Solution349();
		int nums1[] = { 1, 2, 2, 1 };
		int nums2[] = { 2, 2 };

//		nums1 = [], nums2 = [2,2]
		System.out.println(ns.intersection(nums1, nums2));
	}

}
