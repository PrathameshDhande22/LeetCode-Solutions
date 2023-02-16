package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution884 {
	private Map<String, Integer> wordOcc = new HashMap<>();

	public String[] uncommonFromSentences(String s1, String s2) {
		addOccurences(s1);
		addOccurences(s2);
		List<String> ans = new ArrayList<>();
		for (String word : wordOcc.keySet()) {
			if (wordOcc.get(word) == 1) {
				ans.add(word);
			}
		}
		return ans.toArray(new String[ans.size()]);
	}

	public void addOccurences(String sen) {
		for (String word : sen.split("\s")) {
			wordOcc.put(word, wordOcc.getOrDefault(word, 0) + 1);
		}
	}
}

public class Uncommon_Words_from_Two_Sentences_884 {
	public static void main(String[] args) {
		String s1 = "apple apple", s2 = "banana";
		Solution884 ns = new Solution884();
		System.out.println(Arrays.toString(ns.uncommonFromSentences(s1, s2)));
	}
}
