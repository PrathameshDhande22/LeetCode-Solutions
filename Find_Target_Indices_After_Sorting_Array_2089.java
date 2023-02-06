package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

class Solution2089 {
	public List<Integer> targetIndices(int[] nums, int target) {
		List<Integer> ans = new Vector<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				ans.add(i);
			}
		}
		return ans;
	}
}

public class Find_Target_Indices_After_Sorting_Array_2089 {

	public static void main(String[] args) {
		int[] nums = {1,2,5,2,3};
		int target = 3;
		Solution2089 ns = new Solution2089();
		System.out.println(ns.targetIndices(nums, target));
	}

}
