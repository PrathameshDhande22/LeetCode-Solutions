package leetcode;

import java.util.Arrays;

class Solution242 {
	public boolean isAnagram(String s, String t) {
		char[] swor = s.toCharArray();
		char[] twor = t.toCharArray();
		Arrays.sort(swor);
		Arrays.sort(twor);
		if (swor.length != twor.length)
			return false;
		for (int i = 0; i < swor.length; i++) {
			if (swor[i] != twor[i]) {
				return false;
			}
		}
		return true;
	}
}

public class Valid_Anagram_242 {

	public static void main(String[] args) {
		String s = "a";
		String t = "ab";
		Solution242 ns = new Solution242();
		System.out.println(ns.isAnagram(s, t));
	}

}
