package leetcode;

class Solution2220 {
	public int minBitFlips(int start, int goal) {
		return Integer.bitCount(start ^ goal);
	}
}

public class Minimum_Bit_Flips_to_Convert_Number_2220 {

	public static void main(String[] args) {
		Solution2220 ns = new Solution2220();
		System.out.println(ns.minBitFlips(3, 4));
	}

}
