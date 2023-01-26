package leetcode;

import java.util.Arrays;

class Solution1486 {
	public int xorOperation(int n, int start) {
		if (n == 1)
			return start;
		int[] nums = new int[n];
		int ans = 0;
		nums[0] = start;
		for (int i = 1; i < n; i++) {
			nums[i] = start + 2 * i;
			if (i == 1)
				ans = nums[i - 1] ^ nums[i];
			else
				ans ^= nums[i];
		}
		return ans;
	}
}

public class XOR_Operation_in_an_Array_1486 {

	public static void main(String[] args) {
		Solution1486 ns = new Solution1486();
		System.out.println(ns.xorOperation(1, 7));
	}

}
