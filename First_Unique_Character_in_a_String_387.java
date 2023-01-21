package leetcode;

import java.util.HashMap;

class Solution387 {
	public int firstUniqChar(String s) {
		HashMap<Character, Integer> schar = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			schar.put(s.charAt(i), schar.getOrDefault(s.charAt(i), 0) + 1);
		}
		for (int i = 0; i < s.length(); i++) {
			if (schar.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}
}

public class First_Unique_Character_in_a_String_387 {

	public static void main(String[] args) {
		String s = "aabb";
		Solution387 ns = new Solution387();
		System.out.println(ns.firstUniqChar(s));
	}

}
