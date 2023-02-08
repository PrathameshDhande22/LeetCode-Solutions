package leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution2154 {
	public int findFinalValue(int[] nums, int original) {
		List<Integer> array = new ArrayList<>();
		for (int no : nums) {
			array.add(no);
		}
		while (true) {
			if (array.contains(original)) {
				original = original * 2;
			} else {
				return original;
			}
		}
	}
}

public class Keep_Multiplying_Found_Values_by_Two_2154 {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 9 };
		Solution2154 ns = new Solution2154();
		System.out.println(ns.findFinalValue(nums, 4));
	}

}
