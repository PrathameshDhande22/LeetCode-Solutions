package leetcode;

class Solution771 {
	public int numJewelsInStones(String jewels, String stones) {
		int count = 0;
		for (int i = 0; i < stones.length(); i++) {
			for (int j = 0; j < jewels.length(); j++) {
				if (stones.charAt(i) == jewels.charAt(j)) {
					count++;
				}
			}
		}
		return count;
	}
}

public class Jewels_and_Stones_771 {

	public static void main(String[] args) {
		Solution771 ns = new Solution771();
		String jewels = "z";
		String stones = "ZZ";
		System.out.println(ns.numJewelsInStones(jewels, stones));
	}

}
