package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		Arrays.sort(nums);
		List<Integer> disAppear = new ArrayList<>();
		Set<Integer> storeNo = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			storeNo.add(nums[i]);
		}
		for (int i = 1; i <= nums.length; i++) {
			if (!storeNo.contains(i)) {
				disAppear.add(i);
			}
		}
		return disAppear;
	}
}

public class Find_All_Numbers_Disappeared_in_an_Array_448 {

	public static void main(String[] args) {
		Solution448 ns = new Solution448();
//		int nums[]= {4,3,2,7,8,2,3,1};
		int nums[] = { 1, 1 };
		System.out.println(ns.findDisappearedNumbers(nums));
	}

}
