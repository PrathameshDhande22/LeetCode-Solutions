package leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution2942 {
	public List<Integer> findWordsContaining(String[] words, char x) {
		List<Integer> indices = new ArrayList<Integer>();
		for (int i = 0; i < words.length; i++) {
			if (words[i].indexOf(x) != -1) {
				indices.add(i);
			}
		}
		return indices;
	}
}

public class Find_Words_Containing_Character_2942 {
	public static void main(String[] args) {
		String[] words = { "abc", "bcd", "aaaa", "cbc" };
		char x = 'a';
		Solution2942 ns = new Solution2942();
		System.out.println(ns.findWordsContaining(words, x));
	}
}
