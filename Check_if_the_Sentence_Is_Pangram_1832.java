package leetcode;

import java.util.HashSet;

class Solution1832 {
	public boolean checkIfPangram(String sentence) {
		HashSet<Character> charstore = new HashSet<>();
		char[] stringarr = sentence.toCharArray();
		for (char a : stringarr) {
			charstore.add(a);
		}
		if (charstore.size() == 26)
			return true;
		return false;
	}
}

public class Check_if_the_Sentence_Is_Pangram_1832 {

	public static void main(String[] args) {
		String sentence = "leetcode";
		Solution1832 ns = new Solution1832();
		System.out.println(ns.checkIfPangram(sentence));
	}

}
