package leetcode;

class Solution2278 {
	public int percentageLetter(String s, char letter) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (letter == s.charAt(i)) {
				count++;
			}
		}
		return (int) ((double) count / s.length() * 100);
	}
}

public class Percentage_of_Letter_in_String_2278 {

	public static void main(String[] args) {
		String s = "jjjj";
		char letter = 'k';
		Solution2278 ns = new Solution2278();
		System.out.println(ns.percentageLetter(s, letter));
	}

}
