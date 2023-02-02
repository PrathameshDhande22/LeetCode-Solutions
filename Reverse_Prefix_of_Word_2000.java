package leetcode;

class Solution2000 {
	public String reversePrefix(String word, char ch) {
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ch) {
				StringBuilder sb = new StringBuilder(word.substring(0, i + 1));
				sb.reverse().append(word.substring(i + 1, word.length()));
				return sb.toString();
			}
		}
		return word;

	}
}

public class Reverse_Prefix_of_Word_2000 {

	public static void main(String[] args) {
		Solution2000 ns = new Solution2000();
		String word = "abcd";
		char ch = 'z';
		System.out.println(ns.reversePrefix(word, ch));
	}

}
