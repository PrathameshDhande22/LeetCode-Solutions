package leetcode;

class Solution520 {
	public boolean detectCapitalUse(String word) {
		int count = 0;
		if (Character.isUpperCase(word.charAt(0))) {
			for (int i = 0; i < word.length(); i++) {
				if (Character.isUpperCase(word.charAt(i))) {
					count++;
				}
			}
			if (count == 1)
				return true;

		} else {
			for (int i = 0; i < word.length(); i++) {
				if (Character.isUpperCase(word.charAt(i))) {
					count++;
				}
			}
		}
		if (count == word.length() || count == 0) {
			return true;
		} else {
			return false;
		}
	}
}

public class Detect_Capital_520 {

	public static void main(String[] args) {
		Solution520 ns = new Solution520();
		System.out.println(ns.detectCapitalUse("gggode"));
	}

}
