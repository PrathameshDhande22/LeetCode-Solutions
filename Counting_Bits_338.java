package leetcode;

import java.util.Arrays;

class Solution338 {
	public int[] countBits(int n) {
		int[] ans = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			ans[i] = count(i);
		}
		return ans;
	}

	public int count(int no) {
		int count = 0;
		while (no != 0) {
			if ((no & 1) == 1) {
				count++;
			}
			no = no >> 1;
		}
		return count;
	}
}

public class Counting_Bits_338 {
	public static void main(String[] args) {
		Solution338 ns = new Solution338();
		System.out.println(Arrays.toString(ns.countBits(5)));
	}
}
