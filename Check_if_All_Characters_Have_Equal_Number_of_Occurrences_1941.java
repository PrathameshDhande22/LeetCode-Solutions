package leetcode;

import java.util.HashMap;

class Solution1941 {
	public boolean areOccurrencesEqual(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		int occ = map.get(s.charAt(0));
		for (int no : map.values()) {
			if (occ != no) {
				return false;
			}
		}
		return true;
	}
}

public class Check_if_All_Characters_Have_Equal_Number_of_Occurrences_1941 {

	public static void main(String[] args) {
		String s = "aaabb";
		Solution1941 ns = new Solution1941();
		System.out.println(ns.areOccurrencesEqual(s));
	}

}
