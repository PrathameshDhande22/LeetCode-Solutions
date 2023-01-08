package leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution169 {
	public int majorityElement(int[] nums) {
		HashMap<Integer, Integer> storeNums = new HashMap<>();
		for (int no : nums) {
			if (storeNums.containsKey(no)) {
				storeNums.put(no, storeNums.get(no) + 1);
			} else {
				storeNums.put(no, 1);
			}
		}
		for (Map.Entry<Integer, Integer> me : storeNums.entrySet()) {
			if (me.getValue() > (nums.length / 2)) {
				return me.getKey();
			}
		}
		return 0;
	}
}

public class Majority_Element_169 {

	public static void main(String[] args) {
		Solution169 ns = new Solution169();
//		int nums[]= {3,2,3};
		int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(ns.majorityElement(nums));
	}

}
