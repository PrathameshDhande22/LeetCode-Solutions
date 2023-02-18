package leetcode;

class Solution2490 {
	public boolean isCircularSentence(String sentence) {
		String[] words = sentence.split("\s");
		for (int i = 0; i < words.length; i++) {
			if (words.length - 1 == i) {
				if (words[i].charAt(words[i].length() - 1) != words[0].charAt(0)) {
					return false;
				}
			} else {
				if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
					return false;
				}
			}
		}
		return true;
	}
}

public class Circular_Sentence_2490 {
	public static void main(String[] args) {
		String sentence = "Leetcode is cool";
		Solution2490 ns = new Solution2490();
		System.out.println(ns.isCircularSentence(sentence));
	}
}
