package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution2824 {
	public int countPairs(List<Integer> nums, int target) {
		int n = nums.size();
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums.get(i) + nums.get(j) < target) {
					count++;
				}
			}
		}
		return count;
	}
}

public class Count_Pairs_Whose_Sum_is_Less_than_Target_2824 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		Collections.addAll(nums, -6, 2, 5, -2, -7, -1, 3);
		Solution2824 ns = new Solution2824();
		System.out.println(ns.countPairs(nums, -2));
	}

}
