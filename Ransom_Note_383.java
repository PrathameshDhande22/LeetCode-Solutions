package leetcode;

import java.util.HashMap;

class Solution383 {
	public boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		// storing the magazine in the hm with their values
		for (char ch : magazine.toCharArray()) {
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}

		// interating over the ransomNote
		for (char ch : ransomNote.toCharArray()) {
			if (!hm.containsKey(ch)) {
				return false;
			} else if (hm.get(ch) == 0) {
				return false;
			}
			hm.put(ch, hm.get(ch) - 1);
		}
		return true;
	}
}

public class Ransom_Note_383 {

	public static void main(String[] args) {
		String ransomNote = "ace", magazine = "aaabcde";
		Solution383 ns = new Solution383();
		System.out.println(ns.canConstruct(ransomNote, magazine));
	}

}
