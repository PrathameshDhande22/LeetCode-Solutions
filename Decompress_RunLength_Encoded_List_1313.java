package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1313 {
	public int[] decompressRLElist(int[] nums) {
		List<Integer> no = new ArrayList<>();
		for (int i = 0; i < Math.abs(nums.length / 2); i++) {
			int freq = nums[2 * i];
			int val = nums[2 * i + 1];
			for (int j = 0; j < freq; j++) {
				no.add(val);
			}
		}
		int[] ans = new int[no.size()];
		for (int a = 0; a < no.size(); a++) {
			ans[a] = no.get(a);
		}
		return ans;
	}
}

public class Decompress_RunLength_Encoded_List_1313 {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 3, 4, 5 };
		Solution1313 ns = new Solution1313();
		System.out.println(Arrays.toString(ns.decompressRLElist(nums)));
	}

}
