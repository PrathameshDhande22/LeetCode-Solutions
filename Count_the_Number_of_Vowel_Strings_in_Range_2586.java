package leetcode;

class Solution2586 {
	public int vowelStrings(String[] words, int left, int right) {
		int count = 0;
		for (int i = left; i <= right; i++) {
			count += isVowelString(words[i]) ? 1 : 0;
		}
		return count;
	}

	public boolean isVowelString(String str) {
		char first = str.charAt(0);
		char last = str.charAt(str.length() - 1);
		if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') {
			if (last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u') {
				return true;
			}
		}
		return false;
	}
}

public class Count_the_Number_of_Vowel_Strings_in_Range_2586 {

	public static void main(String[] args) {
		String words[] = { "hey", "aeo", "mu", "ooo", "artro" };
		int left = 1;
		int right = 4;
		Solution2586 ns = new Solution2586();
		System.out.println(ns.vowelStrings(words, left, right));
	}

}
