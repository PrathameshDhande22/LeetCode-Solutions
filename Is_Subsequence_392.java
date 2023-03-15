package leetcode;

class Solution392 {
	public boolean isSubsequence(String s, String t) {
		if (s.length() == 0) {
			return true;
		}
		int spointer = 0;
		int tpointer = 0;
		while (spointer < s.length()) {
			if (tpointer == t.length()) {
				return false;
			}
			if (s.charAt(spointer) == t.charAt(tpointer)) {
				spointer++;
			}
			if (spointer == s.length()) {
				return true;
			}
			tpointer++;
		}
		return false;
	}
}

public class Is_Subsequence_392 {

	public static void main(String[] args) {
		String s = "";
		String t = "ahbgdc";
		Solution392 ns = new Solution392();
		System.out.println(ns.isSubsequence(s, t));
	}

}
