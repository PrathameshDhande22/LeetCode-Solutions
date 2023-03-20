package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution2341 {
	public int[] numberOfPairs(int[] nums) {
		int count = 0;
		int pairs = 0;
		Map<Integer, Integer> occur = new HashMap<>();
		// counting occurence of each element
		for (int i = 0; i < nums.length; i++) {
			occur.put(nums[i], occur.getOrDefault(nums[i], 0) + 1);
		}
		for (int no : occur.keySet()) {
			int counter = occur.get(no);
			pairs += (counter / 2);
			count += counter % 2 == 1 ? 1 : 0;
		}
		return new int[] { pairs, count };
	}
}

public class Maximum_Number_of_Pairs_in_Array_2341 {

	public static void main(String[] args) {
		int nums[] = { 0 };
		Solution2341 ns = new Solution2341();
		System.out.println(Arrays.toString(ns.numberOfPairs(nums)));

	}

}
