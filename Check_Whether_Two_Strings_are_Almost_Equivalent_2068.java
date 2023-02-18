package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution2068 {
	private Map<Character, Integer> w1 = new HashMap<>();
	private Map<Character, Integer> w2 = new HashMap<>();

	public boolean checkAlmostEquivalent(String word1, String word2) {
		frequency(word1, 1);
		frequency(word2, 2);
		Set<Character> chars = new HashSet<>();
		chars.addAll(w1.keySet());
		chars.addAll(w2.keySet());
		for (char c : chars) {
			if (w1.containsKey(c) && w2.containsKey(c)) {
				int diff = Math.abs(w1.get(c) - w2.get(c));
				if (diff > 3) {
					return false;
				}
			} else if (w1.containsKey(c) && !w2.containsKey(c)) {
				if (w1.get(c) > 3) {
					return false;
				}
			} else {
				if (w2.get(c) > 3) {
					return false;
				}
			}
		}
		return true;
	}

	public void frequency(String word, int no) {
		if (no == 1) {
			for (char c : word.toCharArray()) {
				w1.put(c, w1.getOrDefault(c, 0) + 1);
			}
		} else {
			for (char c : word.toCharArray()) {
				w2.put(c, w2.getOrDefault(c, 0) + 1);
			}
		}
	}
}

public class Check_Whether_Two_Strings_are_Almost_Equivalent_2068 {

	public static void main(String[] args) {
		Solution2068 ns = new Solution2068();
		String word1 = "cccddabba", word2 = "babababab";
		System.out.println(ns.checkAlmostEquivalent(word1, word2));
	}

}
