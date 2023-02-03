package leetcode;

class Solution2185 {
	public int prefixCount(String[] words, String pref) {
		int count = 0;
		for (String word : words) {
			if (word.startsWith(pref)) {
				count++;
			}
		}
		return count;
	}
}

public class Counting_Words_With_a_Given_Prefix_2185 {

	public static void main(String[] args) {
		String[] words = { "leetcode", "win", "loops", "success" };
		String pref = "code";
		Solution2185 ns = new Solution2185();
		System.out.println(ns.prefixCount(words, pref));
	}

}
