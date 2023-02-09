package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution2215 {
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		List<List<Integer>> diff = new ArrayList<>();
		diff.add(difference(nums1, nums2));
		diff.add(difference(nums2, nums1));
		return diff;
	}

	public List<Integer> difference(int[] orig, int[] find) {
		List<Integer> differ = new ArrayList<>();
		Set<Integer> ori = new HashSet<>();
		for (int i = 0; i < orig.length; i++) {
			ori.add(orig[i]);
		}
		for (int i = 0; i < ori.size(); i++) {
			if (exists(orig[i], find)) {
				differ.add(orig[i]);
			}
		}
		return differ;
	}

	private boolean exists(int no, int[] search) {
		for (int i = 0; i < search.length; i++) {
			if (no == search[i]) {
				return false;
			}
		}
		return true;
	}
}

public class Find_the_Difference_of_Two_Arrays_2215 {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 3 };
		int[] nums2 = { 1, 1, 2, 2 };
		Solution2215 ns = new Solution2215();
		System.out.println(ns.findDifference(nums1, nums2));
//		System.out.println(ns.difference(nums2, nums1));
	}

}
