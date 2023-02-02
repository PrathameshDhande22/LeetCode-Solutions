package leetcode;

class Solution1732 {
	public int largestAltitude(int[] gain) {
		int max = 0;
		int sum = 0;
		for (int i = 0; i < gain.length; i++) {
			sum += gain[i];
			if (sum > max) {
				max = sum;
			}
		}
		return max;
	}
}

public class Find_the_Highest_Altitude_1732 {

	public static void main(String[] args) {
		int[] gain = { -4, -3, -2, -1, 4, 3, 2 };
		Solution1732 ns = new Solution1732();
		System.out.println(ns.largestAltitude(gain));
	}

}
