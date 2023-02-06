package leetcode;

class Solution1768 {
	public String mergeAlternately(String word1, String word2) {
		StringBuffer sb = new StringBuffer();
		int len = Math.max(word1.length(), word2.length());
		for (int i = 0; i < len; i++) {
			if (i < word1.length()) {
				sb.append(word1.charAt(i));
			}
			if (i < word2.length()) {
				sb.append(word2.charAt(i));
			}
		}
		return sb.toString();
	}
}

public class Merge_Strings_Alternately_1768 {

	public static void main(String[] args) {
		String word1 = "ab", word2 = "pqrs";
		Solution1768 ns = new Solution1768();
		System.out.println(ns.mergeAlternately(word1, word2));
	}

}
