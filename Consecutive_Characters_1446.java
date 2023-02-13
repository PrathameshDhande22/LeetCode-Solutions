package leetcode;

class Solution1446 {
	public int maxPower(String s) {
		int count = 0, max = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				count = 0;
			}
			max = Math.max(max, count);
		}
		return max + 1;
	}
}

public class Consecutive_Characters_1446 {

	public static void main(String[] args) {
		String s = "leetcode";
		Solution1446 ns = new Solution1446();
		System.out.println(ns.maxPower(s));
	}

}
