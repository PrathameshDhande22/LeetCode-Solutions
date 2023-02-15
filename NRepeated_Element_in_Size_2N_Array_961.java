package leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution961 {
	public int repeatedNTimes(int[] nums) {
		Map<Integer, Integer> hm = new HashMap<>();
		for (int n : nums) {
			hm.put(n, hm.getOrDefault(n, 0) + 1);
		}
		for (int n : hm.keySet()) {
			if (hm.get(n) > 1) {
				return n;
			}
		}
		return 0;
	}
}

public class NRepeated_Element_in_Size_2N_Array_961 {

	public static void main(String[] args) {
		int[] nums = { 5, 1, 5, 2, 5, 3, 5, 4 };
		Solution961 ns = new Solution961();
		System.out.println(ns.repeatedNTimes(nums));
	}

}
