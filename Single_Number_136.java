package leetcode;

import java.util.Hashtable;
import java.util.Map;

class Solution136 {
	public int singleNumber(int[] nums) {
		Hashtable<Integer, Integer> containsNo = new Hashtable<>();
		for (int i = 0; i < nums.length; i++) {
			if (containsNo.containsKey(nums[i])) {
				containsNo.put(nums[i], containsNo.get(nums[i]) + 1);
			} else {
				containsNo.put(nums[i], 1);
			}

		}
		for (Map.Entry<Integer, Integer> m : containsNo.entrySet()) {
			if (m.getValue() == 1) {
				return m.getKey();
			}
		}
		return 0;
	}
}

public class Single_Number_136 {

	public static void main(String[] args) {
//		int[] nums= {2,2,1};
		int[] nums = { 4, 1, 2, 1, 2 };
		Solution136 ns = new Solution136();
		System.out.println(ns.singleNumber(nums));
	}

}
