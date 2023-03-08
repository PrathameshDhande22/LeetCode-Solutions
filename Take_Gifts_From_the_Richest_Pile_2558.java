package leetcode;

import java.util.Arrays;

class Solution2558 {
	public long pickGifts(int[] gifts, int k) {
		Arrays.sort(gifts);
		int last = gifts.length - 1;
		for (int i = 0; i < k; i++) {
			int n = gifts[last];
			n = (int) Math.floor(Math.sqrt(n));
			gifts[last] = n;
			Arrays.sort(gifts);
		}
		long sum = 0;
		for (int i = 0; i < gifts.length; i++) {
			sum += gifts[i];
		}
		return sum;
	}
}

public class Take_Gifts_From_the_Richest_Pile_2558 {

	public static void main(String[] args) {
		int gifts[] = { 1, 1, 1, 1 };
		Solution2558 ns = new Solution2558();
		System.out.println(ns.pickGifts(gifts, 4));

	}

}
