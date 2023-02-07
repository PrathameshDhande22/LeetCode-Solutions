package leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution1748 {
	public int sumOfUnique(int[] nums) {
		int sum = 0;
		HashMap<Integer, Integer> storeNums = new HashMap<>();
		for (int no : nums) {
			storeNums.put(no, storeNums.getOrDefault(no, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> iter : storeNums.entrySet()) {
			if (iter.getValue() == 1) {
				sum += iter.getKey();
			}
		}
		return sum;
	}
}

public class Sum_of_Unique_Elements_1748 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		Solution1748 ns = new Solution1748();
		System.out.println(ns.sumOfUnique(nums));
	}

}
