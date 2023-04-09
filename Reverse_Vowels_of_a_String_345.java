package leetcode;

class Solution345 {

	public boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U') {
			return true;
		}
		return false;
	}

	public String reverseVowels(String s) {
		StringBuilder sb = new StringBuilder(s);
		int first = 0;
		int last = s.length() - 1;
		while (first < last) {
			char firstChar = s.charAt(first);
			char lastChar = s.charAt(last);
			if (isVowel(firstChar)) {
				if (isVowel(lastChar)) {
					if (firstChar != lastChar) {
						sb.setCharAt(first, lastChar);
						sb.setCharAt(last, firstChar);
						first++;
						last--;
					} else {
						first++;
						last--;
					}
				} else {
					last--;
				}
			} else {
				first++;
			}
		}

		return sb.toString();
	}
}

public class Reverse_Vowels_of_a_String_345 {

	public static void main(String[] args) {
		String st = "aeo";
		System.out.println(new Solution345().reverseVowels(st));
	}

}
