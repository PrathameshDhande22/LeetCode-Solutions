package leetcode;

import java.util.Arrays;

public class Number_of_Even_and_Odd_Bits_2595 {

	public static void main(String[] args) {
		Solution2595 ns = new Solution2595();
		System.out.println(Arrays.toString(ns.evenOddBit(12)));
	}

}

class Solution2595 {
	public int[] evenOddBit(int n) {
		int evencount = 0, oddcount = 0, i = 0;
		while (n != 0) {
//			check for even indices
			if (i % 2 == 0) {
				evencount = check(n, evencount);
			}
//			check for odd indices
			else {
				oddcount = check(n, oddcount);
			}
			n = n >> 1;
			i++;
		}
		return new int[] { evencount, oddcount };
	}

	public int check(int n, int counter) {
		if ((n & 1) != 0) {
			return counter + 1;
		}
		return counter;
	}
}
